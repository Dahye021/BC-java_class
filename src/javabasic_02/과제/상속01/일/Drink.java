package javabasic_02.과제.상속01.일;

public class Drink {
    private String name;
    private int price;
    private int count;

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return price * count;
    }

    public static void printTitle() {
        System.out.println("상품명\t단가\t수량\t금액");
    }

    public void printData() {
        System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
    }

    // ⬇️ 추가 getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}