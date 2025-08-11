package javabasic_02.과제.문자열.문자열03.이;

public class FindCharacters {

    public static void main(String[] args) {
        FindCharacters fc = new FindCharacters();

        String s = "Boys, be ambitious";

        // 테스트
        System.out.println("문자 'i' 개수 => " + fc.countChar(s, 'i')); // 2
        System.out.println("문자 'b' 개수 => " + fc.countChar(s, 'b')); // 2
    }

    public int countChar(String str, char c) {
        int count = 0;
        char[] arr = str.toCharArray(); // 문자열을 문자 배열로 변환

        for (char ch : arr) {
            if (ch == c) { // 대소문자 구분 비교
                count++;
            }
        }

        return count;
    }
}
