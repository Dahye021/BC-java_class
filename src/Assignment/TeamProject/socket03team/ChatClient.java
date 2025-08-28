package Assignment.TeamProject.socket03team;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * ChatClient: 서버에 접속하여 메시지를 송수신하는 클라이언트
 * - 서버 주소, 포트, 닉네임 지정
 */
public class ChatClient {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String nickname;

    public ChatClient(String host, int port, String nickname) {
        this.nickname = nickname;
        try {
            socket = new Socket(host, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
        } catch (IOException e) {
            System.err.println("[오류] 서버에 연결할 수 없습니다.");
            System.exit(1);
        }
    }

    public void start() {
        try {
            // 서버로 닉네임 전송
            String prompt = in.readLine();
            if (prompt != null && prompt.equals("NICK?")) {
                out.println("NICK " + nickname);
            }

            // 서버 응답 수신 스레드
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    System.err.println("[연결 종료]");
                }
            }).start();

            // 사용자 입력을 서버로 전송
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("/quit")) {
                    out.println("/quit");
                    break;
                }
                out.println(input);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                // 무시
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("사용법: java ChatClient <host> <port> <nickname>");
            return;
        }

        String host = args[0];
        int port = Integer.parseInt(args[1]);
        String nickname = args[2];

        ChatClient client = new ChatClient(host, port, nickname);
        client.start();
    }
}