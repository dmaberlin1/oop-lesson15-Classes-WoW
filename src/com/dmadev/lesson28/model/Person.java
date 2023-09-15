package com.dmadev.lesson28.model;

public class Person {
    private long id;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    public Person(long id) {
        this.id = id;

    }
}
