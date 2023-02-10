package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "Dragon Ball Z", 19.90));
        mangas.add(new Manga(2L,"Pokemon", 23.9));
        mangas.add(new Manga(3L,"Cavaleiros do Zodiaco", 25.66));
        mangas.add(new Manga(1L,"Street Fighter", 35.66));
        mangas.add(new Manga(4L,"Buck", 25.88));

        //Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(3L, "Cavaleiros do Zodiaco", 25.66);

        System.out.println(Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator));

    }
}
