package com.dmadevfunc.lesson22;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(100, 200, 300, 400, 500);
        String collectResult = integerList.stream().map(String::valueOf)
                .collect(Collectors.joining("+","start: "," end"));
        System.out.println(collectResult);
    }

}
