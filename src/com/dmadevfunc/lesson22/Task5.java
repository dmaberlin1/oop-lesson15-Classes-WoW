package com.dmadevfunc.lesson22;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class Task5 {
    public static void main(String[] args) {
        List<Person> peopleList = List.of(new Person("billbill", "terner", 21),
                new Person("bill", "tern", 22),
                new Person("bi", "terner2", 33),
                new Person("b", "terner3", 33),
                new Person("billbill441414", "terner4", 55),
                new Person("billbill5414141414", "terner5", 54),
                new Person("billbill6", "terner6", 20));

        peopleList.stream().filter(person -> person.getFullName().length()<15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<Person>> personMap = peopleList.stream()
                .collect(groupingBy(Person::getAge));
        System.out.println(personMap);
        Map<Integer, List<String>> personMapFullName = peopleList.stream()
                .collect(groupingBy(Person::getAge, mapping(Person::getFullName, toList())));
        System.out.println(personMapFullName);

        Map<Integer, Function<Object, Object>> collectWithMap = peopleList.stream()
                .collect(toMap(Person::getAge, person -> identity()));
    }
}
