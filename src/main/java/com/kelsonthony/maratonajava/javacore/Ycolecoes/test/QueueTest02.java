package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        mangas.add(new Manga(5L, "Dragon Ball Z", 19.90, 0));
        mangas.add(new Manga(2L, "Pokemon", 3.9, 5));
        mangas.add(new Manga(3L, "Cavaleiros do Zodiaco", 25.66, 0));
        mangas.add(new Manga(1L, "Street Fighter", 35.66, 2));
        mangas.add(new Manga(4L, "Buck", 25.88, 0));
        mangas.add(new Manga(4L, "Buck", 25.88, 0));
        mangas.add(new Manga(10L, "Aragon", 19.90, 0));
        mangas.add(new Manga(10L, "Araragon", 19.90, 0));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }


    }
}
