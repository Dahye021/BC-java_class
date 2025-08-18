package javabasic_02.day17;

import java.util.ArrayList;
import java.util.List;

public class ImmutableEx {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Pear", "Orange");
        list.add("grape");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
