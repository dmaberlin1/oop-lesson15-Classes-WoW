package com.dmadev.lesson19.person;

public class PersonExample {
    public static void main(String[] args) {
        Person tom = new Person(1, "Tom", "Will");
        Person bill = new Person(2, "Bill", "Skotte");

        System.out.println(tom.hashCode());
        System.out.println(bill.hashCode());
        System.out.println(tom.equals(bill));
    }
}
