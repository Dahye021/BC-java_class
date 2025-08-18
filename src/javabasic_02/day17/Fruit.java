package javabasic_02.day17;

import java.util.*;

// 과일 클래스 (자체 비교 가능하도록 Comparable 구현)
class Fruit implements Comparable<Fruit> {
    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + price + "원)";
    }

    // 가격 기준 오름차순 정렬 (같은 가격이면 이름으로 비교)
    @Override
    public int compareTo(Fruit other) {
        int result = Integer.compare(this.price, other.price);
        if (result == 0) {
            return this.name.compareTo(other.name);
        }
        return result;
    }
}

