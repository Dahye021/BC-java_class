package Java_basic_04.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {
        //List<Product> ArrayList Products 생성
        List<Product> products = new ArrayList<>();
        //5개의 제품을 생성하여 products에 저장해주세요.
        products.add(new Product(1, "에어팟", "애플", 220000));
        products.add(new Product(2, "스마트폰", "삼성", 2000000));
        products.add(new Product(3, "노트북", "LG", 1000000));
        products.add(new Product(4, "텀블러", "스탠리", 58000));
        products.add(new Product(5, "키보드", "쿠팡", 130000));

        Stream<Product> stream = products.stream();
        stream.forEach(System.out::println);
//        stream.forEach(p -> System.out.println(p));
    }
}
