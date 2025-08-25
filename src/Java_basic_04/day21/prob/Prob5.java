package Java_basic_04.day21.prob;

import java.io.FileReader;
import java.io.Reader;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) throws Exception {
        Reader reader = null;

        reader = new FileReader("C:/Temp/byte_output.txt");
        char[] bye = new char[100];

        while (true){
            int Read = reader.read(bye);
            if (Read == -1) break;
            for (int i = 0; i < Read ; i++) {
                System.out.print(bye[i]);
            }
        }
        reader.close();
    }
}