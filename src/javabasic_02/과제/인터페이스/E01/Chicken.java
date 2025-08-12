package javabasic_02.과제.인터페이스.E01;

public class Chicken extends Animal implements Cheatable {
    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        distance += speed * (hours / 2.0); // 절반 시간 이동
    }

    @Override
    public void fly() {
        speed *= 2; // 속도 2배
    }
}
