package com.kelsonthony.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Kelson, Mchilanny, Goku";

        //String[] nomes = texto.split(",");
        String[] nomes = texto.split("\\d");

        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
