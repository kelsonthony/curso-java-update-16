package com.kelsonthony.maratonajava.javacore.ZGenerics.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Em tempo de compilação
        //Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Kelson");


        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Kakaroto"));

        for (Object o : lista) {
            System.out.println(o);
        }

    }
    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
