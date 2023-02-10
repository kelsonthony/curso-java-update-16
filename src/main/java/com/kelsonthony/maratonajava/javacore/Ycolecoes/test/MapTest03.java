package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Kelson");
        Consumidor c2 = new Consumidor("Mchilannny");

        Manga manga1 = new Manga(5L, "Dragon Ball Z", 19.90);
        Manga manga2 = new Manga(2L,"Pokemon", 23.9);
        Manga manga3 = new Manga(3L,"Cavaleiros do Zodiaco", 25.66);
        Manga manga4 = new Manga(1L,"Street Fighter", 35.66);
        Manga manga5 = new Manga(4L,"Buck", 25.88);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor1List2 = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(c1, mangaConsumidor1List);
        consumidorMangaMap.put(c2, mangaConsumidor1List2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga);
            }

        }

    }
}
