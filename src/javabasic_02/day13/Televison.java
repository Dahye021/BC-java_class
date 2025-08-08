package javabasic_02.day13;

public class Televison implements RemoteControl{
    @Override
    public void trunOff() {
        System.out.println("TV 전원을 끈다");
    }

    @Override
    public void trunOn() {
        System.out.println("TV 전원을 켠다");
    }
}
