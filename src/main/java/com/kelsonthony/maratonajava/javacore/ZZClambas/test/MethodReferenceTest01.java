package com.kelsonthony.maratonajava.javacore.ZZClambas.test;

import com.kelsonthony.maratonajava.javacore.ZZClambas.dominio.Anime;
import com.kelsonthony.maratonajava.javacore.ZZClambas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
// Reference to a static method

public class MethodReferenceTest01 {
    private static Comparator<Anime> animeComparator;

    public static void main(String[] args) {
        List<Anime> animesList = new ArrayList<>(List.of(new Anime("DBZ", 3000), new Anime("Cavaleiros", 200),
                new Anime("Naruto", 500)));

        System.out.println(animesList);
        System.out.println("---------------------------");
        //Collections.sort(animesList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //Method Refenence
        animesList.sort(AnimeComparator::compareToTitle);
        System.out.println("compareToTitle: " + animesList);

        Collections.sort(animesList, AnimeComparator::compareToEpisodes);

        System.out.println("compareToEpisodes " + animesList);

    }
}
