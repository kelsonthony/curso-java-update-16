package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
public class MangaSortTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "Dragon Ball Z", 19.90));
        mangas.add(new Manga(2L,"Pokemon", 23.9));
        mangas.add(new Manga(3L,"Cavaleiros do Zodiaco", 25.66));
        mangas.add(new Manga(1L,"Street Fighter", 35.66));
        mangas.add(new Manga(4L,"Buck", 25.88));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("Ordenar por Nome-------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("Ordenar por ID-------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
