package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        //permite somente elementos únicos
        //Set<Manga> mangas = new HashSet<>();
        //vai manter a ordem de inserção
        Set<Manga> mangas = new LinkedHashSet<>();

        mangas.add(new Manga(5L, "Dragon Ball Z", 19.90, 0));
        mangas.add(new Manga(2L,"Pokemon", 23.9, 5));
        mangas.add(new Manga(3L,"Cavaleiros do Zodiaco", 25.66, 0));
        mangas.add(new Manga(1L,"Street Fighter", 35.66, 2));
        mangas.add(new Manga(4L,"Buck", 25.88, 0));
        mangas.add(new Manga(4L,"Buck", 25.88, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
