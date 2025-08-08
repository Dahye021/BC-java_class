package javabasic_02.day13;

public class User {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Televison();
        rc.trunOn();

        //리모컨을 통해서 청소기를 동작시키려 한다. rc 이용
        //1. 전원을 키고

        //2. 청소를 10분 시킨다.

        //3. 10분후 청소기를 끈다.

        //TV의 최대 볼륨 확인  public static final은 타입.상수명으로 접근
        System.out.println(RemoteControl.MAX_VOLUME);
        //TV의 최소 볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME);

    }
}
