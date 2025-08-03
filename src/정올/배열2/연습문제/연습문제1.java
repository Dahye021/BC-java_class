package 정올.배열2.연습문제;

import java.util.Scanner;
import java.util.TreeMap;

public class 연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        TreeMap<Integer, Integer> countMap = new TreeMap<>();

        while (true) {
            int num = in.nextInt();
            if (num < 1 || num > 10) break;

            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int key : countMap.keySet()) {
            System.out.println(key + " : " + countMap.get(key) + "개");
        }

        in.close();
    }
}
