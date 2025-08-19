package javabasic_02.day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {

    public static void main(String[] args) {
        class User implements Comparable<User> {
            String name;
            int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) {
                //비교로직 구현
                if (this.age < o.age) {
                    return -1;
                } else if (this.age > o.age) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 32),
                new User("김동성", 48),
                new User("박희동", 14),
        };
        System.out.println("-------나이 순 오름차순-----------");
        Arrays.sort(users, new Comparator<User>() {

            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });

        for (User u : users) {
            System.out.println(u.name + " " + u.age + "세");
        }
        System.out.println("------나이 순 내림차순--------------");
        Arrays.sort(users, Collections.reverseOrder());
        for (User u : users) {
            System.out.println(u.name + " " + u.age+"세");
        }
    }
}