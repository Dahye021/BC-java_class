package javabasic_02.과제.다형성.다형성02.E02;

public abstract class Content {
    private String title;
    private int price;

    // 기본 생성자
    public Content() {}

    // title을 매개변수로 받는 생성자
    public Content(String title) {
        this.title = title;
    }

    // 추상 메서드
    public abstract void totalPrice();

    // show 메서드
    public void show() {
        System.out.println(title + " 비디오의 가격은 " + price + "원 입니다.");
    }

    // getter / setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}