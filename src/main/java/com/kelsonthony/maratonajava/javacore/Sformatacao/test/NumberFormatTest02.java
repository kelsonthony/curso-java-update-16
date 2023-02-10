package com.kelsonthony.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localIT = Locale.ITALY;

        NumberFormat[] nfe = new NumberFormat[4];

        nfe[0] = NumberFormat.getCurrencyInstance();
        nfe[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfe[2] = NumberFormat.getCurrencyInstance(localBR);
        nfe[3] = NumberFormat.getCurrencyInstance(localIT);

        double valor = 1_000.2130;

        for (NumberFormat numberFormat : nfe) {
            //System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";

        try {
            System.out.println(nfe[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
