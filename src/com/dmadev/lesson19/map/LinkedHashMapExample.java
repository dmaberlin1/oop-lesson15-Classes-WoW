package com.dmadev.lesson19.map;

import com.dmadev.lesson19.person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Person tommy = new Person(1, "Tom", "Will");
        Person bill = new Person(22, "Bill", "Skotte");
        Person andry = new Person(3, "Andry", "Skotte");

        Map<Integer, Person> myMap = new LinkedHashMap<>();
        myMap.put(tommy.getId(), tommy);
        myMap.put(bill.getId(), bill);
        myMap.putIfAbsent(andry.getId(), andry);
        for (Map.Entry<Integer, Person> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
