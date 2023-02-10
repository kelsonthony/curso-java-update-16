package com.kelsonthony.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = retorna todos os digitos
        // \D = retorna tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os em branco
        // \w = a-z A-z _
        // \W = Tudo o que não incluso no \w
        // caracteres de range
        // []
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        // String texto = "abaaba";
        //String texto2 = "cafeBABE;
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("ìndices encontrados");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        /*int numeroHex = 0xFFABC;

        System.out.println(numeroHex);*/
    }
}
