package java_advanced.day23.socket01;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class ServerSocketEx01 {
    private ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("Starting server socket");
        System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter키를 입력하세요.");

        //TCP 서버 시작
        starServer();

        //키보드 입력
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")) {
                break;
            }
        }

        //TCP 서버 종료
        stopServer();
    }
    public static  void starServer() {

    }

    public static  void stopServer() {
        try {
            serverSocket.close();
            System.out.println("서버 종료");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
