package com.kelsonthony.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime timeTest = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();

        System.out.println(timeTest);
        System.out.println(timeTest.getHour());
        System.out.println(timeTest.getMinute());
        System.out.println(timeTest.getSecond());
        System.out.println(timeTest.get(ChronoField.HOUR_OF_DAY));
        System.out.println(timeTest.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MAX);

        System.out.println(timeNow);
    }
}
