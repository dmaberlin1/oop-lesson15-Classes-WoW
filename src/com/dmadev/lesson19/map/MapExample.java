package com.dmadev.lesson19.map;

import com.dmadev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person tom = new Person(1, "Tom", "Will");
        Person bill = new Person(2, "Bill", "Skotte");

        Map<Integer, Person> myMap = new HashMap<>();
        myMap.put(tom.getId(), tom);
        myMap.put(bill.getId(), bill);
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
        System.out.println(myMap.entrySet());
        for (Person person : myMap.values()) {
            System.out.println(person.getFirstName());
        }

        for (Map.Entry<Integer, Person> entry : myMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(myMap.containsKey(2));
    }
}
