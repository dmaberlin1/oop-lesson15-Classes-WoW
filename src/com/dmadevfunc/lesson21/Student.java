package com.dmadevfunc.lesson21;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int age;
    private String name;
    private List<Integer> marks=new ArrayList<>();

    public List<Integer> getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name, List<Integer> marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
