package javabasic_02.과제.다형성.다형성02.E01;

public class Tea extends Beverage {
    public static int amount = 0;

    public Tea(String name) {
        super(name);
        calcPrice();
        amount++; // 판매 개수 누적
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "lemonTea":
                price = 1500;
                break;
            case "ginsengTea":
                price = 2000;
                break;
            case "redginsengTea":
                price = 2500;
                break;
            default:
                price = 0; // 기본값
        }
    }
}