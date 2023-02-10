package com.kelsonthony.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //lingua pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat dateInstanceItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateInstanceCH = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateInstanceIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateInstanceJapan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat dateInstanceHolanda = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia: " + dateInstanceItaly.format(calendar.getTime()));
        System.out.println("Suiça: " + dateInstanceCH.format(calendar.getTime()));
        System.out.println("India: " + dateInstanceIndia.format(calendar.getTime()));
        System.out.println("Japão: " + dateInstanceJapan.format(calendar.getTime()));
        System.out.println("Holanda: " + dateInstanceHolanda.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());

        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeCH.getDisplayCountry(localeHolanda));
    }
}
