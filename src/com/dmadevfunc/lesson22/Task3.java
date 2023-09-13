package com.dmadevfunc.lesson22;

import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> mapTest = Map.of(
                "str1", 1,
                "strin1", 10,
                "str123", 100100,
                "str124", 1100,
                "str126", 1100100,
                "str127", 1100100,
                "str128", 1100100100,
                "str129", 1100500,
                "str1300", 1100100
        );
        int resultSum = mapTest.entrySet().stream().filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue).sum();
        System.out.println(resultSum);
    }
}
