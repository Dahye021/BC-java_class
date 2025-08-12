package javabasic_02.과제.Exception.E02;

// 사용자 정의 Exception : 수정하지 말고 그대로 사용하세요.
public class PayException extends Exception {

    public PayException(String message){
        super(message);
    }
}