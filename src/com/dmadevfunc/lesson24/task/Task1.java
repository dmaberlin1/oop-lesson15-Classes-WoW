package com.dmadevfunc.lesson24.task;

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 7, 22, 21, 0);
        LocalDateTime localDateTime1 = localDateTime.plusMonths(3L);

        System.out.println(localDateTime1.toLocalDate());
        System.out.println(localDateTime1.toLocalTime());
    }
}
