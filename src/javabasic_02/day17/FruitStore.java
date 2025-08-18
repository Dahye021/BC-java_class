package javabasic_02.day17;

import java.util.Set;
import java.util.TreeSet;

public class FruitStore {
    public static void main(String[] args) {
        // TreeSet 은 Fruit 자체의 compareTo 기준으로 정렬
        Set<Fruit> fruitStore = new TreeSet<>();

        fruitStore.add(new Fruit("사과", 10000));
        fruitStore.add(new Fruit("귤", 12000));
        fruitStore.add(new Fruit("포도", 18000));

        System.out.println("총각네 과일가게 상품 리스트 (가격 오름차순):");
        for (Fruit f : fruitStore) {
            System.out.println(f);
        }
    }
}