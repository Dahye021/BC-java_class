package javabasic_02.과제.상속.상속02.E01;

public class Tv {
    String color;
    boolean power;
    int channel;

    // 생성자
    public Tv() {
        color = "black";
        power = false;
        channel = 0;
    }

    public void power() {
        power = !power;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void print() {
        System.out.println("color :" + color + "\t power:" + power + "\t channel:" + channel);
    }
}