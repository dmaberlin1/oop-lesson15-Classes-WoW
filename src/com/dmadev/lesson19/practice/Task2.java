package com.dmadev.lesson19.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 6, 11, 15, 15, 3, 3, 5, 7, 11);
        List<Integer> empty = List.of();
        System.out.println(countUnique(integers));
        System.out.println(countUnique(empty));
        System.out.println(countUnique(empty));
    }


    private static int countUnique(List<Integer> list) {
        return  new HashSet<>(list).size();
    }
}
