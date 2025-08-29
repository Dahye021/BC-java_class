package Assignment.TeamProject.socket03team;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class ChatServer {
    //DEFAULT_PORT = 5000 (기본적으로 서버가 열릴 포트 번호)
    private static final int DEFAULT_PORT = 5000;
    //ServerSocket = 누군가가 접속을 시도하면 ServerSocket으로 받아줌
    private ServerSocket serverSocket;

    //Map을 이용하여 String(닉네임), PrintWriter(해당 닉네임의 통신 창구)를 clients라는 변수에 저장
    //HashMap은 여러 스레드가 동시에 접근하면 문제 발생
    //이를 해결하기 위해 ConcurrentHashMap을 사용하여 멀티스레드 환경에서도 데이터가 꼬임 없이 안전하게 관리할수 있게 함
    private final Map<String, PrintWriter> clients = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;
        //new ChatServer() -> 채팅 서버 객체 생성 / .start(port) -> 서버 시작(해당 포트에서 클라이언트 접속을 기다림)
        new ChatServer().start(port);
    }

    public void start(int port) {
        try {
            //지정한 포트 번호(5000)로 서버 소켓을 생성
            serverSocket = new ServerSocket(port);  //해당 포트는 열리게 되고 클라이언트가 접속할 수 있게 됨
            System.out.println("[서버 시작] 포트: " + port);

            while (true) { //클라이언트 요청 무한으로 기다리며 서버는 꺼지지 않고 계속 실행 상태 유지
                Socket socket = serverSocket.accept();  //클라이언트가 접속 시도 하면 socket객체에 해당 요청을 받아들임
                new ClientHandler(socket).start(); //start()를 호출하여 클라이언트와의 통신을 병렬처리하여 여러 클라이언트가 동시 접속 가능
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