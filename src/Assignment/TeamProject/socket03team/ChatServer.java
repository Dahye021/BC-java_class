package Assignment.TeamProject.socket03team;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * ChatServer: 다중 클라이언트를 처리하는 텍스트 기반 채팅 서버
 * - TCP 기반, 포트는 기본 5000
 * - 각 클라이언트는 개별 스레드에서 처리
 */
public class ChatServer {
    private static final int DEFAULT_PORT = 5000;
    private ServerSocket serverSocket;

    // 클라이언트 목록 관리 (닉네임 → 출력 스트림)
    private final Map<String, PrintWriter> clients = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;
        new ChatServer().start(port);
    }

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("[서버 시작] 포트: " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                new ClientHandler(socket).start(); // 클라이언트 스레드 실행
            }
        } catch (IOException e) {
            System.err.println("[오류] 서버 종료: " + e.getMessage());
        } finally {
            stop();
        }
    }

    // 서버 종료 시 소켓 닫기
    public void stop() {
        try {
            if (serverSocket != null && !serverSocket.isClosed())
                serverSocket.close();
        } catch (IOException e) {
            System.err.println("[오류] 서버 소켓 종료 실패");
        }
    }

    /**
     * 클라이언트를 담당하는 스레드
     */
    private class ClientHandler extends Thread {
        private Socket socket;
        private String nickname;
        private BufferedReader in;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

                // 1. 닉네임 받기
                out.println("NICK?");
                String line = in.readLine();

                if (line == null || !line.startsWith("NICK ")) {
                    out.println("ERR Invalid NICK command");
                    socket.close();
                    return;
                }

                nickname = line.substring(5).trim();

                if (nickname.isEmpty() || clients.containsKey(nickname)) {
                    out.println("ERR Nickname invalid or taken");
                    socket.close();
                    return;
                }

                // 2. 정상 등록
                clients.put(nickname, out);
                broadcast("[" + nickname + "] joined");

                System.out.println("[접속] " + nickname);

                // 3. 메시지 수신 루프
                String msg;
                while ((msg = in.readLine()) != null) {
                    if (msg.startsWith("/quit")) {
                        break;
                    } else if (msg.startsWith("/who")) {
                        out.println("USERS " + String.join(", ", clients.keySet()));
                    } else {
                        broadcast("[" + nickname + "] " + msg);
                    }
                }
            } catch (IOException e) {
                System.err.println("[오류] " + nickname + ": " + e.getMessage());
            } finally {
                // 퇴장 처리
                if (nickname != null) {
                    clients.remove(nickname);
                    broadcast("[" + nickname + "] left");
                    System.out.println("[퇴장] " + nickname);
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    // 무시
                }
            }
        }

        // 전체 사용자에게 메시지 전송
        private void broadcast(String message) {
            for (PrintWriter pw : clients.values()) {
                pw.println(message);
            }
        }
    }
}