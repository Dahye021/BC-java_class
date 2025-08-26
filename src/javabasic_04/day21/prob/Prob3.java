package javabasic_04.day21.prob;

import java.io.FileReader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:/Temp/hello.txt");

        int count = 0;
        int ch;

        while ((ch = fr.read()) != -1) {
            count++;
        }

        fr.close();

        System.out.println("hello.txt 파일의 문자 수 : " + count);
    }
}