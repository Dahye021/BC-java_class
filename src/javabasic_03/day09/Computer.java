package javabasic_03.day09;
//가변길이 매개변수
//메소드를 호출할때 매개변수의 개수에 맞게 매개값을 제공해야한다
// 만약 메소드가 가변길이 매개변수를 가지면 매개변수의 개수와 상관없이 매개값을 줄 수 있따

public class Computer {
    public int totalSum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        if (sum % 2 == 0)
        return 0;
        else return 1;
    }
}