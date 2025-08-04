package javabasic_03.day09;

public class CalMain {
    public static void main(String[] args) {
        MyCalculator myCalculator1 = new MyCalculator();

        MyCalculator myCalculator = new MyCalculator();
        myCalculator.numbers[0] = 10;
        System.out.println(myCalculator.numbers[0]);
        myCalculator.numbers[1] = 20;
        System.out.println(myCalculator.numbers[1]);
        myCalculator.adder(myCalculator.numbers);
    }
}
