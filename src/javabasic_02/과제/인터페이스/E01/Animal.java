package javabasic_02.과제.인터페이스.E01;

public abstract class Animal {
    int speed;          // 속도 km/h
    double distance;    // 이동거리 km

    public Animal(int speed) {
        this.speed = speed;
        this.distance = 0;
    }

    public abstract void run(int hours);

    public double getDistance() {
        return distance;
    }
}
