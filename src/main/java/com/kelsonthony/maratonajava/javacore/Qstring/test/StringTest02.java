package com.kelsonthony.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "    Mchilanny    ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); //retorna m
        System.out.println(nome.length());
        System.out.println(nome.replace("n", "m"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(numeros.substring(3));
        System.out.println(nome);
        System.out.println(nome.trim());
    }
}
