package com.dmadev.lesson19.map;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("test111");
        mySet.add("test222");
        System.out.println(mySet.add("test222"));
        mySet.add("test333");
        mySet.add("test444");
        System.out.println(mySet);

    }
}
