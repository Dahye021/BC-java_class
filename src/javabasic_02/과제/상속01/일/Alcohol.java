package javabasic_02.과제.상속01.일;

public class Alcohol extends Drink {
    private double alper;

    public Alcohol(String name, int price, int count, double alper) {
        super(name, price, count);
        this.alper = alper;
    }

    public static void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t수량\t금액");
    }

    @Override
    public void printData() {
        System.out.println(getName() + "(" + alper + ")\t" + getPrice() + "\t" + getCount() + "\t" + getTotalPrice());
    }
}