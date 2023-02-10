package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();

        mangas.add(new Manga(5L, "Dragon Ball Z", 19.90, 0));
        mangas.add(new Manga(2L,"Pokemon", 23.9, 5));
        mangas.add(new Manga(3L,"Cavaleiros do Zodiaco", 25.66, 0));
        mangas.add(new Manga(1L,"Street Fighter", 35.66, 2));
        mangas.add(new Manga(4L,"Buck", 25.88, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }



        //1.8
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);

    }
}
