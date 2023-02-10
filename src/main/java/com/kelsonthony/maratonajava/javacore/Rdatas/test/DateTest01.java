package com.kelsonthony.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //Date date = new Date(1_000_000_000_000_000L); //long 10000
        Date date = new Date(1674085776290L); //long 10000
        System.out.println(date);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
