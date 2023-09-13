package com.dmadevfunc.lesson22;

import java.util.List;
import java.util.OptionalDouble;

public class Task1 {
    public static void main(String[] args) {
        List<Integer>integerList= List.of(1,5,4,6,7,8,11,12,14,15,18);
        OptionalDouble average = integerList.stream()
                .filter(val -> val % 2 != 0)
                .filter(val -> val % 5 == 0)
                .mapToInt(Integer::intValue).average();
        average.ifPresent(System.out::println);

    }
}
