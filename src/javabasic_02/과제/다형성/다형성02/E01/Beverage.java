package javabasic_02.과제.다형성.다형성02.E01;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name) {
        this.name = name;
    }

    public abstract void calcPrice();

    public void print() {
        System.out.println("판매 음료는 " + name + "이며, 가격은 " + price);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}