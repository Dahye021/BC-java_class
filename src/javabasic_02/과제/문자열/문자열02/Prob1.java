package javabasic_02.과제.문자열.문자열02;

public class Prob1 {

    public static void main(String[] args) {
        System.out.println("문자열에 특정문자 변경하는 테스트");
        System.out.println("-------------Sample 1 --------------");
        String str1 = myReplace("hello world", 'l', '*');
        System.out.println(str1);

        System.out.println("-------------Sample 2 --------------");
        String str2 = myReplace("hello world", ' ', '-');
        System.out.println(str2);

        System.out.println("-------------Sample 3 --------------");
        String str3 = myReplace("hello world", 'a', '*');
        System.out.println(str3);
    }

    public static String myReplace(String str, char oldChar, char newChar) {
        // 변경할 문자가 없는 경우 그대로 반환
        boolean found = false;
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
                found = true;
            }
        }

        // 변경 대상이 없으면 원본 문자열 반환
        if (!found) {
            return str;
        }

        // 변경된 문자 배열을 문자열로 변환
        return new String(chars);
    }
}
