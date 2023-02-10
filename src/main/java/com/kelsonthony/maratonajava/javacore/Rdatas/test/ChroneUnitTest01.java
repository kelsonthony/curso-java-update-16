package com.kelsonthony.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChroneUnitTest01 {
    public static void main(String[] args) {

        LocalDateTime aniversario =
                LocalDateTime.of(1986, Month.JUNE, 13,0, 15, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}
