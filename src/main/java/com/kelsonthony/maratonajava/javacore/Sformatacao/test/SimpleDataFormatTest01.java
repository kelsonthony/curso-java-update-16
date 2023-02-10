package com.kelsonthony.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatTest01 {
    public static void main(String[] args) {
        //String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("Amsterdam 18 de janeiro de 2023"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
