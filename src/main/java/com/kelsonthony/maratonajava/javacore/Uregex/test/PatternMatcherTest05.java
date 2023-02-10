package com.kelsonthony.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . caracter curinga 1.3  = 123 133 1@3 1A3
        //
        String regex = "([1-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jatora@gmail.com, #@!zoro@mail.br, test@gmail.com.br sakura@mail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("E-mail válido?");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());

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
