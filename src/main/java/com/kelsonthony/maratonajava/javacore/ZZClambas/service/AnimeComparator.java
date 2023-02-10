package com.kelsonthony.maratonajava.javacore.ZZClambas.service;

import com.kelsonthony.maratonajava.javacore.ZZClambas.dominio.Anime;

public class AnimeComparator {

    public static int compareToTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareToEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    // by objets
    public int compareToEpisodesNonStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
