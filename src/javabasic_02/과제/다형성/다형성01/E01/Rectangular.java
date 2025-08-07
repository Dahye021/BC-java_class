package javabasic_02.과제.다형성.다형성01.E01;

public class Rectangular extends Shape {
    private double width;
    private double hight; // 오타 유지 (문제 지문 기준)

    public Rectangular(String name, double width, double hight) {
        super(name);
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public void calculationArea() {
        double area = width * hight;
        setArea(area);
    }
}