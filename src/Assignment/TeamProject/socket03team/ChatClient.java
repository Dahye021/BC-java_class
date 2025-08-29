package Assignment.TeamProject.socket03team;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String nickname;

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("사용법: java ChatClient <서버IP> <포트> <닉네임>");
            return;
        }

        String serverIP = args[0];
        int port = Integer.parseInt(args[1]);
        String nickname = args[2];

        new ChatClient().start(serverIP, port, nickname);
    }

    public void start(String serverIP, int port, String nickname) {
        try {
            this.nickname = nickname;
            socket = new Socket(serverIP, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

            // 1. 서버에서 NICK? 요청 받으면 닉네임 전송
            String serverMsg = in.readLine();
            if ("NICK?".equals(serverMsg)) {
                out.println("NICK " + nickname);
            }

            // 2. 메시지 수신용 스레드
            Thread readerThread = new Thread(this::readMessages);
            readerThread.start();

            // 3. 사용자 입력 처리
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("/quit")) {
                    out.println("/quit");
                    break;
                } else {
                    out.println(input);
                }
            }

            close();
        } catch (IOException e) {
            System.err.println("[오류] 서버 연결 실패: " + e.getMessage());
        }
    }

    private void readMessages() {
        String msg;
        try {
            while ((msg = in.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (IOException e) {
            System.err.println("[오류] 서버와 연결 종료");
        }
    }

    private void close() {
        try {
            if (socket != null && !socket.isClosed()) socket.close();
            if (in != null) in.close();
            if (out != null) out.close();
            System.out.println("[종료] 클라이언트 종료");
        } catch (IOException e) {
            // 무시
        }
    }
}
