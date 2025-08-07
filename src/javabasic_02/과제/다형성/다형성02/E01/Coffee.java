package javabasic_02.과제.다형성.다형성02.E01;

public class Coffee extends Beverage {
    public static int amount = 0;

    public Coffee(String name) {
        super(name);
        calcPrice();
        amount++; // 판매 개수 누적
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "Americano":
                price = 1500;
                break;
            case "CafeLatte":
                price = 2500;
                break;
            case "Cappuccino":
                price = 3000;
                break;
            default:
                price = 0; // 기본값
        }
    }
}