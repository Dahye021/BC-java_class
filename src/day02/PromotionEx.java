package day02;

import java.security.spec.RSAOtherPrimeInfo;

public class PromotionEx {
    public static void main (String[] args) {

        //byte<short,char<int<long<float<double

        byte byteValue = 10;
        int intValue = byteValue; //자동 타입 변환

        long longValue = 5000000000L; //인트와 롱의 리터럴을 구분하기 위해서 롱값은 뒤에 대문자 l 또는 소문자 l을 붙여라
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        double d1 = 5e2; //5.0 x 10 x 10 = 500.0
        double d2 = 0.12E-2; //0.12 x 0.01 = 0.0012
        double d3 = 3.14;
        double d4 = 314e-2;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);

        float f1 = 3.14f; // float 리터럴 값은 마지막에 f,F를 붙인다.
        float f2 = 3E6F;
        System.out.println(f1 + " " + f2);
        }

    }

