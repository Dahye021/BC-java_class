package Java_basic_04.day21.prob;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 문제 1: 텍스트 파일에 문자열 저장
//         문자열 "Hello Java!"를 hello.txt에 저장하세요.
public class Prob1 {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/Temp/hello.txt");

        os.write("Hello Java!".getBytes());

        os.flush();
        os.close();

    }
}