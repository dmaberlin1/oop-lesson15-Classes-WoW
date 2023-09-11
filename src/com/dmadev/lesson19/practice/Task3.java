package com.dmadev.lesson19.practice;

//Написать метод который принимиает Map(String,String),  и возрвращает true,
//        если каждому ключу соответствует своё уникальное значение

import java.util.HashSet;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> mapPersons = Map.of(
                "Marty", "Mart",
                "Martys", "Marts",
                "Martyss", "Martss",
                "Martysss", "Marts",
                "Martyssss", "Mart"
        );

        isUnique(mapPersons);
        isUniquePrint(mapPersons);

    }
    public static boolean isUnique (Map<String,String> map){
        return map.size() ==new HashSet<>(map.values()).size();
    }
    public static void isUniquePrint(Map<String,String> map){
        boolean result = map.size() == new HashSet<>(map.values()).size();
        System.out.println(result);
    }
}
