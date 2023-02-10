package com.kelsonthony.maratonajava.javacore.ZGenerics.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest00 {
    public static void main(String[] args) {
        List lista = new ArrayList<>(); //1.4
        lista.add("Kelson");
        lista.add(123L);
        lista.add(new Consumidor("Goku"));

        for (Object o : lista) {
            if (o instanceof String) {
                System.out.println(o);
            }
            if (o instanceof Long) {
                System.out.println(o);
            }
            if (o instanceof Consumidor) {
                System.out.println(o);
            }
        }

    }
}
