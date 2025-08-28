package Assignment.homework.E05;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(s -> s.startsWith("Java"))
                .forEach(System.out::println);
    }
}
