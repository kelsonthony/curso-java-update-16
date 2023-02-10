package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes = new ArrayList(); // 1.4
        nomes.add("Kelson");
        nomes.add("Mchilanny");
        nomes.add(123);

        for (Object nome: nomes) {
            System.out.println(nome);
        }

        List<String> nomes1 = new ArrayList<>(16); // 1.5
        List<String> nomes2 = new ArrayList<>(16); // 1.5
        nomes1.add("Kelson");
        nomes1.add("Mchilanny");
        //nomes1.remove("Kelson");
        nomes2.add("Due");
        nomes2.add("Goku");

        nomes1.addAll(nomes2);
        for (String nome: nomes1) {
            System.out.println(nome);
        }
        nomes1.add("John");
        System.out.println("-------------------");
        int size = nomes1.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes1.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);

    }
}
