package Java_basic_04.day21.prob;

import java.io.File;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) throws Exception {
        File file = new File("C:/Temp/copy.jpg");

        if(file.exists()){
            long fileSize = file.length();
            System.out.println("copy.jpg 파일 크기 : " + fileSize + " byte");
        }

    }
}