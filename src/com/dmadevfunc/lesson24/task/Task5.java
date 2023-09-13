package com.dmadevfunc.lesson24.task;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Task5 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        Period period = Period.between(prevDate, now);
        System.out.println(period);
        long betweenInDays = ChronoUnit.DAYS.between(prevDate, now);
        System.out.println(betweenInDays);
    }
}
