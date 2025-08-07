package javabasic_02.과제.상속.상속02.E01;

public class Prob1 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.print();  // 첫번째 출력문
        t.power();
        t.print();  // 두번째 출력문
        t.channelUp();
        t.channelUp();
        t.print(); // 세번째 출력문
    }
}