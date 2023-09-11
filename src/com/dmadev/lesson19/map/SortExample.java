package com.dmadev.lesson19.map;

import com.dmadev.lesson19.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> myStrings = Arrays.asList("123","201","999","199", "456", "789", "987");
        Collections.sort(myStrings);
        System.out.println(myStrings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Emmer", "Terner"),
                new Person(22, "Scott", "Agy"),
                new Person(5, "Wilkins", "Fetch")
        );
        Collections.sort(personList);
        System.out.println(personList);

        Collections.sort(personList,new FirstNameComparator());
        personList.sort(new FirstNameComparator());
        personList.sort(Comparator.comparing(Person::getFirstName));
        System.out.println(personList);
    }

    public static class FirstNameComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
