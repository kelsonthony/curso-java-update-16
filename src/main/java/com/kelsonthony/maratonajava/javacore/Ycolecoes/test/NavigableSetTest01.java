package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;


import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Manga;
import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmarthphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneMarcaComparator());
        Smartphone s1 = new Smartphone("123", "Nokia");
        set.add(s1);
        //System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());

        mangas.add(new Manga(5L, "Dragon Ball Z", 19.90, 0));
        mangas.add(new Manga(2L, "Pokemon", 3.9, 5));
        mangas.add(new Manga(3L, "Cavaleiros do Zodiaco", 25.66, 0));
        mangas.add(new Manga(1L, "Street Fighter", 35.66, 2));
        mangas.add(new Manga(4L, "Buck", 25.88, 0));
        mangas.add(new Manga(4L, "Buck", 25.88, 0));
        mangas.add(new Manga(10L, "Aragon", 19.90, 0));
        mangas.add(new Manga(10L, "Araragon", 19.90, 0));

        //lista ao contrário
        /*for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }*/
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 8, 5);

        System.out.println("--------------------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

    }
}
