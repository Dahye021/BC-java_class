package javabasic_02.day13;

public interface RemoteControl {
    //최대 볼륨은 30이다.
    public static final int MAX_VOLUME = 30;
    //최소 볼륨은 0이다.
    public static final int MIN_VOLUME = 0;

    public void trunOn(); //전원 켜기
    public void trunOff(); //전원 끄기

}
