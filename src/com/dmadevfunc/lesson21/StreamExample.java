package com.dmadevfunc.lesson21;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88","11", "22", "33", "44","55","66");
        strings.stream().map(string->string+string).map(Integer::valueOf)
                .filter(value->value %2==0).sorted().skip(1).limit(3).forEach(System.out::println);

        List<String> stringsInt = List.of("88111111","11", "22", "33", "44","55","66");
        IntSummaryStatistics intSummaryStatistics = strings.stream().map(string -> string + string).map(Integer::valueOf)
                .filter(value -> value % 2 == 0).sorted()
                .skip(1).limit(6).mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        strings.stream().map(string -> string + string).map(Integer::valueOf)
                .filter(value -> value % 2 == 0).sorted()
                .skip(1).limit(6).mapToInt(Integer::intValue)
                .mapToObj(Integer::valueOf).forEach(System.out::println);

        Stream.of("100","200","300").peek(System.out::println).sorted().peek(System.out::println)
                .limit(2).toList().forEach(System.out::println);
        double average = IntStream.of(1, 2, 3, 50, 60).summaryStatistics().getAverage();

        IntStream.range(0,10).forEach(System.out::println);
        IntStream.rangeClosed(0,10).forEach(System.out::println);
        IntStream.iterate(0,value->value+10).skip(10).limit(1000).forEach(System.out::println);
    }
}
