package javabasic_02.과제.문자열.문자열03.삼;

public class Prob1 {
    public static void main(String[] args) {
        Prob1 p = new Prob1();
        String addr = "서울시,강남구,싹아트홀,신세계아이앤씨";
        String[] addrArr = p.split(addr, ',');
        System.out.println("배열 크기 : " + addrArr.length);
        for (int i = 0; i < addrArr.length; i++) {
            System.out.print(addrArr[i] + " ");
        }
    }

    public String[] split(String str, char separator) {
        // 1. 구분자 개수 세기 (배열 크기 = 구분자 개수 + 1)
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == separator) {
                count++;
            }
        }

        // 2. 배열 생성
        String[] result = new String[count];
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        // 3. 구분자를 기준으로 문자열 나누기
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == separator) {
                result[idx++] = sb.toString();
                sb.setLength(0); // StringBuilder 초기화
            } else {
                sb.append(str.charAt(i));
            }
        }

        // 마지막 토큰 저장
        result[idx] = sb.toString();

        return result;
    }
}