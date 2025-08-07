package javabasic_02.과제.생성자.E01;

public class Rectangle {
    private int width;
    private int height;
    private String color;
    private int area;

    // 기본 생성자
    public Rectangle() {
        this.width = 0;
        this.height = 0;
        this.color = "흰색";
        this.area = 0;
    }

    // width, height만 받는 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.color = "흰색";
        this.area = 0;
    }

    // width, height, color 받는 생성자
    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.area = 0;
    }

    // setter
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // getter
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getArea() {
        return area;
    }

    // 면적 계산
    public void calculateArea() {
        this.area = width * height;
    }
}