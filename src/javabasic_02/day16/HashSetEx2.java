package javabasic_02.day16;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();


        set.add(new Member("신세계",30));


        int size = set.size();
        System.out.println(size);
    }
}
