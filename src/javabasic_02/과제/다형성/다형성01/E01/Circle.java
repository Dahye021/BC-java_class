package javabasic_02.과제.다형성.다형성01.E01;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        double area = Math.PI * radius * radius;
        setArea(area);
    }
}