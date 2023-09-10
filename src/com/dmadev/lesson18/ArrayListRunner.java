package com.dmadev.lesson18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<Integer> myIntegers = new ArrayList<>(3);
        myIntegers.add(1);
        myIntegers.add(10);
        myIntegers.add(100);
        System.out.println(myIntegers.get(4));
        System.out.println(myIntegers.contains(1001));
        List<Object> myLinkedList = new LinkedList<>();
    }
}
