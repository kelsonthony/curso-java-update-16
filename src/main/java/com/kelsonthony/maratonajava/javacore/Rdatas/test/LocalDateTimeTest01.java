package com.kelsonthony.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalDate date2 = LocalDate.parse("2023-01-19");
        LocalTime time = LocalTime.of(9, 45, 21);
        LocalTime time2 = LocalTime.parse("09:45:00");

        System.out.println(localDateTime);
        System.out.println(localDateTime.getHour());

        System.out.println(date2);
        System.out.println(time2);

        LocalDateTime localDateTime1 = date2.atTime(time2);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = time2.atDate(date2);
        System.out.println(localDateTime2);


    }
}
