package com.kelsonthony.maratonajava.javacore.ZZClambas.test;


import com.kelsonthony.maratonajava.javacore.ZZClambas.dominio.Anime;
import com.kelsonthony.maratonajava.javacore.ZZClambas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {

        AnimeComparator animeComparator = new AnimeComparator();

        List<Anime> animesList = new ArrayList<>(List.of(new Anime("DBZ", 3000), new Anime("Cavaleiros", 200),
                new Anime("Naruto", 500)));

        //animesList.sort((a1, a2) -> animeComparator.compareToEpisodesNonStatic(a1, a2));
        animesList.sort(animeComparator::compareToEpisodesNonStatic);
        System.out.println(animesList);
    }
}
