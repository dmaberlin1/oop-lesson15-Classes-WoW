package com.dmadev.lesson19.map;

import com.dmadev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person tom = new Person(1, "Tom", "Will");
        Person tommy = new Person(2, "Tommy", "Skotte");
        Person wesley = new Person(15, "Wesley", "Skotte");
        Person winger = new Person(25, "Winger", "Skotte");
        Person scott = new Person(11, "Scott", "Skotte");

        Map<Integer, Person> myMap = new TreeMap<>();
        myMap.put(tom.getId(), tom);
        myMap.put(tommy.getId(), tommy);
        myMap.put(wesley.getId(), wesley);
        myMap.put(winger.getId(), winger);
        myMap.put(scott.getId(), scott);

        for (Map.Entry<Integer, Person> integerPersonEntry : myMap.entrySet()) {
            System.out.println(integerPersonEntry.getKey() + "=" + integerPersonEntry.getValue());
        }

    }
}
