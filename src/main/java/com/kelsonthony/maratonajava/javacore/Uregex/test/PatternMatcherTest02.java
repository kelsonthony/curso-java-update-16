package com.kelsonthony.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = retorna todos os digitos
        // \D = retorna tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os em branco
        // \w = a-z A-z _
        // \W = Tudo o que não está incluso no \w
        String regex = "\\D";
       // String texto = "abaaba";
        String texto2 = "dwq3434543fdsdf4545g5";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("ìndices encontrados");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }


    }
}
