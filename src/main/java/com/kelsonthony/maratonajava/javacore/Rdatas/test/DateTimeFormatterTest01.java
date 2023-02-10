package com.kelsonthony.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate p1 = LocalDate.parse("20230119", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate p2 = LocalDate.parse("2023-01-19", DateTimeFormatter.ISO_DATE);
        LocalDate p3 = LocalDate.parse("2023-01-19", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime p4 = LocalDateTime.parse("2023-01-19T12:13:31.6947602");
        System.out.println(p4);

        //dd/mm/yyyy
        //MM/dd/yyyy
        //yyy/M/dd
        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(dateTimeFormatterBR);

        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("19/01/2023", dateTimeFormatterBR);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatterGR =
                DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);

        String formatGR = LocalDate.now().format(dateTimeFormatterGR);
        System.out.println(formatGR);

        LocalDate parseGR = LocalDate.parse("19.Januar.2023", dateTimeFormatterGR);

        System.out.println(parseGR);


    }
}
