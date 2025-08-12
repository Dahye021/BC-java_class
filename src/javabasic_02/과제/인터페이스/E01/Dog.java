package javabasic_02.과제.인터페이스.E01;

public class Dog extends Animal {
    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        distance += speed * hours; // 시간 그대로 이동
    }
}
