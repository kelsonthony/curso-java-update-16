package com.kelsonthony.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = retorna todos os digitos
        // \D = retorna tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os em branco
        // \w = a-z A-z _
        // \W = Tudo o que não incluso no \w
        // []
        // quantificadores
        // ? Zero o um uma ocorrencias
        // * Zero ou mais
        // + uma ou mais ocorrências
        // {n,m} de n até m de ocorrências
        // () para agrupamento
        // | ou 0(v|c)o ovo | oco
        // $ fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("ìndices encontrados");

        while (matcher.find()) {
            System.out.print("Matchers: " + matcher.start() + " " + matcher.group() + "\n");
        }

       /* int numeroHex = 0xFFABC;

        System.out.println(numeroHex);*/
    }
}
