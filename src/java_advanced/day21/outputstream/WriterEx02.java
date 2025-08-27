package java_advanced.day21.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx02 {
    public static void main(String[] args) {
        //바이트 배열을 통째로 출력 하는 경우가 대부분
        try {
            //출력 스트림 생성 C:Temp/test1.txt에 1byte 데이터를 저장
            OutputStream os = new FileOutputStream("C:/Temp/test2.db"); // 데이터 도착지를 test2.db 바이트 출력 스트림 생성
            //내보낼 데이터를 지정
            byte[] array = {10,20,30,40,50,60};
            //데이터를 스트림에 보내서 해당 목적지에 쓴다 / 배열의 모든 바이트를 출력
            os.write(array);
            //스트림의 버퍼를 비운다 (내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움)
            os.flush();
            //스트림을 닫는다
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
