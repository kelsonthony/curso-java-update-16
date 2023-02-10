package com.kelsonthony.maratonajava.javacore.ZZClambas.test;

import com.kelsonthony.maratonajava.javacore.ZZClambas.dominio.Anime;
import com.kelsonthony.maratonajava.javacore.ZZClambas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        //AnimeComparator animeComparator = new AnimeComparator();
        Supplier<AnimeComparator> newAnimeComparator = AnimeComparator::new;
        AnimeComparator animeComparator = newAnimeComparator.get();

        List<Anime> animesList = new ArrayList<>(List.of(new Anime("DBZ", 3000), new Anime("Cavaleiros", 200),
                new Anime("Naruto", 500)));

        animesList.sort(animeComparator::compareToEpisodesNonStatic);
        System.out.println(animesList);

        //BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes)-> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Samurai X", 40));
    }
}
