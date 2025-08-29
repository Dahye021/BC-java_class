package Assignment.TeamProject.socket03team;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

// 채팅 서버 클래스
public class ChatServer {
    // DEFAULT_PORT = 5000 (서버가 기본적으로 열릴 포트 번호)
    private static final int DEFAULT_PORT = 5000;

    // ServerSocket : 클라이언트의 접속 요청을 받아들이는 소켓
    private ServerSocket serverSocket;

    // clients : 현재 접속 중인 사용자들을 관리하는 Map
    // Key : 닉네임(String), Value : 해당 사용자의 출력 스트림(PrintWriter)
    // HashMap은 멀티스레드 환경에서 동기화 문제가 발생하므로,
    // ConcurrentHashMap을 사용하여 여러 클라이언트가 동시에 접근해도 안전하게 관리되도록 함
    private final Map<String, PrintWriter> clients = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        // args[0]에 포트 번호가 들어오면 해당 포트를 사용, 없으면 기본값(5000) 사용
        int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;

        // ChatServer 객체를 생성하고, 지정한 포트에서 서버 실행 시작
        new ChatServer().start(port);
    }

    // 서버 실행 메서드
    public void start(int port) {
        try {
            // 지정한 포트로 서버 소켓 생성
            serverSocket = new ServerSocket(port);
            System.out.println("[서버 시작] 포트: " + port);

            // 무한 루프
            while (true) {
                // 클라이언트가 접속을 시도하면 accept()로 받아들이고 Socket 객체 생성
                Socket socket = serverSocket.accept();

                // 새 클라이언트마다 ClientHandler 스레드를 만들어 병렬 처리 -> 여러 명 동시 접속 가능
                new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            System.err.println("[오류] 서버 종료: " + e.getMessage());
        } finally {
            stop(); // 예외 발생 시 서버 소켓 닫기
        }
    }

    // 서버 종료 메서드
    public void stop() {
        try {
            // serverSocket이 열려있으면 닫기
            if (serverSocket != null && !serverSocket.isClosed())
                serverSocket.close();
        } catch (IOException e) {
            System.err.println("[오류] 서버 소켓 종료 실패");
        }
    }

    /**
     * 클라이언트와의 통신을 담당하는 스레드 클래스
     */
    private class ClientHandler extends Thread {
        private Socket socket;       // 클라이언트와 연결된 소켓
        private String nickname;     // 사용자의 닉네임
        private BufferedReader in;   // 입력 스트림 (클라이언트 -> 서버)
        private PrintWriter out;     // 출력 스트림 (서버 -> 클라이언트)

        // 생성자 : 소켓을 받아 초기화
        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        // 스레드 실행 코드
        public void run() {
            try {
                // 클라이언트와 통신할 입력/출력 스트림 생성 (UTF-8 인코딩 적용)
                in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

                // 1. 닉네임 받기
                out.println("NICK?");               // 서버가 먼저 닉네임을 요청
                String line = in.readLine();        // 클라이언트가 보낸 닉네임 수신

                // 닉네임 형식이 올바르지 않으면 접속 종료
                if (line == null || !line.startsWith("NICK ")) {
                    out.println("ERR Invalid NICK command");
                    socket.close();
                    return;
                }

                nickname = line.substring(5).trim(); // "NICK " 이후의 문자열을 닉네임으로 사용

                // 닉네임이 비어있거나 이미 사용 중이면 접속 거부
                if (nickname.isEmpty() || clients.containsKey(nickname)) {
                    out.println("ERR Nickname invalid or taken");
                    socket.close();
                    return;
                }

                // 2. 정상 등록 처리
                clients.put(nickname, out);                // clients에 닉네임과 출력 스트림 등록
                broadcast("[" + nickname + "] joined");    // 전체 사용자에게 접속 알림
                System.out.println("[접속] " + nickname);

                // 3. 메시지 수신 루프 (클라이언트가 메시지를 보낼 때마다 처리)
                String msg;
                while ((msg = in.readLine()) != null) {
                    if (msg.startsWith("/quit")) { // "/quit" 입력 시 퇴장 처리
                        break;
                    } else if (msg.startsWith("/who")) { // "/who" 입력 시 현재 접속자 목록 전송
                        out.println("USERS " + String.join(", ", clients.keySet()));
                    } else { // 일반 메시지는 전체 사용자에게 방송
                        broadcast("[" + nickname + "] " + msg);
                    }
                }
            } catch (IOException e) {
                System.err.println("[오류] " + nickname + ": " + e.getMessage());
            } finally {
                // 퇴장 처리
                if (nickname != null) {
                    clients.remove(nickname);                  // 사용자 목록에서 제거
                    broadcast("[" + nickname + "] left");      // 다른 사용자에게 알림
                    System.out.println("[퇴장] " + nickname);
                }
                try {
                    socket.close(); // 소켓 닫기
                } catch (IOException e) {
                    // 무시 (이미 닫혀 있을 수 있음)
                }
            }
        }

        // 전체 사용자에게 메시지를 보내는 메서드
        private void broadcast(String message) {
            for (PrintWriter pw : clients.values()) {
                pw.println(message); // 모든 사용자 출력 스트림으로 전송
            }
        }
    }
}
