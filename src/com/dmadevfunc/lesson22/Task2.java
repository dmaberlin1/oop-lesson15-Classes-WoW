package com.dmadevfunc.lesson22;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<String> stringList = List.of(
                "string-1",
                "string-11",
                "string-12",
                "string-13",
                "string-15",
                "string-15",
                "string-14",
                "string-111",
                "string-111",
                "string-1111"
        );

        int result = stringList.stream().filter(str -> str.length() > 8).collect(Collectors.toSet()).size();
        long resultOptimal = stringList.stream().filter(string -> string.length() > 8).distinct().count();
        System.out.println(result);
        System.out.println(resultOptimal);

    }
}
