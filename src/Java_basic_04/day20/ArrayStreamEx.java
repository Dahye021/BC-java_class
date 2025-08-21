package Java_basic_04.day20;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static void main(String[] args) {
        String[] strings = new String[] {"1","2","3","4","5"};
        Stream<String> stream = Arrays.stream(strings);
//        stream.forEach(System.out::println);
        stream.forEach(item -> System.out.println(item+" "));

        Integer[] integers = new Integer[]{1,2,3,4,5};
    }
}
