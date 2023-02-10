package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Kelson");
        Consumidor c2 = new Consumidor("Mchilannny");

        Manga manga1 = new Manga(5L, "Dragon Ball Z", 19.90);
        Manga manga2 = new Manga(2L,"Pokemon", 23.9);
        Manga manga3 = new Manga(3L,"Cavaleiros do Zodiaco", 25.66);
        Manga manga4 = new Manga(1L,"Street Fighter", 35.66);
        Manga manga5 = new Manga(4L,"Buck", 25.88);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();

        consumidorManga.put(c1, manga1);
        consumidorManga.put(c2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            //System.out.println(entry.getKey() + " - " + entry.getValue());
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
