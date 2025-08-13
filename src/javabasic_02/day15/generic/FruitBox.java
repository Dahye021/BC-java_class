package javabasic_02.day15.generic;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T> {
    List<T> fruits = new ArrayList<>(); //T클래스 필드로 지정


    public void add(T fruit){ //메소드의 매개변수의 타입 지정
        fruits.add(fruit);
    }
}
