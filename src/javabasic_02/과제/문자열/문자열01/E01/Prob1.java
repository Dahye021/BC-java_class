package javabasic_02.과제.문자열.문자열01.E01;

public class Prob1 {
    public String leftPad(String str, int size, char padChar) {
        if (str.length() >= size) {
            return str;
        }

        int padCount = size - str.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < padCount; i++) {
            sb.append(padChar);
        }

        sb.append(str);
        return sb.toString();
    }

    public static void main(String[] args) {
        Prob1 p = new Prob1();
        System.out.println(p.leftPad("SDS", 6, '#')); // ###SDS
        System.out.println(p.leftPad("SDS", 5, '$')); // $$SDS
        System.out.println(p.leftPad("SDS", 2, '&')); // SDS
    }
}
