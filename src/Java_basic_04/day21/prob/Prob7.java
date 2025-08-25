package Java_basic_04.day21.prob;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {
    public static void main(String[] args) {
        int size = 0;

        try (InputStream is = new FileInputStream("C:/Temp/copy.jpg");) {
            while (is.read() != -1) {  // 한 바이트씩 읽음
                size++;
            }
            System.out.println("copy.jpg 파일 크기: " + size + " byte");
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류 발생: " + e.getMessage());
        }
    }
}