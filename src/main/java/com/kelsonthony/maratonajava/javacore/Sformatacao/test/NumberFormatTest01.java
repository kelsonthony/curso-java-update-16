package com.kelsonthony.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localIT = Locale.ITALY;

        NumberFormat[] nfe = new NumberFormat[4];

        nfe[0] = NumberFormat.getNumberInstance();
        nfe[1] = NumberFormat.getNumberInstance(localeJP);
        nfe[2] = NumberFormat.getNumberInstance(localePT);
        nfe[3] = NumberFormat.getNumberInstance(localIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfe) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1_000.2130";

        try {
            System.out.println(nfe[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
