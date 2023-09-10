package com.dmadev.iterator;

import com.dmadev.lesson17.List;

public class ListExample {
    public static void main(String[] args) {
        List<String>list=new List<>(10);
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");

        for (String value : list) {
            System.out.println(value);
        }
        System.out.println();
        list.iterator().forEachRemaining(System.out::println);
    }
}
