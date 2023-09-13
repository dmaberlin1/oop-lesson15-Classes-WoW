package com.dmadevfunc.lesson24.task;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task7 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTimeAfricaCairo = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTimeAfricaCairo);

    }
}
