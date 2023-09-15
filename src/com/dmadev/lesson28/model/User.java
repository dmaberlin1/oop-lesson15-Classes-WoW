package com.dmadev.lesson28.model;

import java.io.Serializable;

public class User extends Person implements Serializable,Comparable<User> {
    private String name;
    @MinAge(age = 21)
    private int age;

    public User(long id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
