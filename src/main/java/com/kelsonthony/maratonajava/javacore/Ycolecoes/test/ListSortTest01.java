package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();

        mangas.add("Dragon Ball Z");
        mangas.add("Pokemon");
        mangas.add("Cavaleiros do Zodiaco");
        mangas.add("Street Fighter");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(240.98);
        dinheiros.add(82.99);
        dinheiros.add(10.90);

        System.out.println(dinheiros);

        Collections.sort(dinheiros);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
    }


}
