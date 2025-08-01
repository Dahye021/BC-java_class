package javabasic_02.day08.methods;
//StringBuffer 주요 메서드
public class StringBufferEx02 {
    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("초기상태 : " + sb);
        //StringBuffer 을 String 타입으로 변환
        System.out.println("초기상태 : " + sb.toString());
        //str 문자열에서 "cd" 출력하세요
        System.out.println("문자열 추출 :" + str.substring(2,4));

        //str 문자열에 "2" 추가하세요

    }
}
