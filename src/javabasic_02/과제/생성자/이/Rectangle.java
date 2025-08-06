package javabasic_02.과제.생성자.이;

public class Rectangle {
    private int width;
    private int length;
    private String color;

    // 가로
    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    // 세로
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    // 색깔
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // 넓이
    public int area() {
        return width * length;
    }

    // 둘레
    public int perimeter() {
        return 2 * (width + length);
    }
}