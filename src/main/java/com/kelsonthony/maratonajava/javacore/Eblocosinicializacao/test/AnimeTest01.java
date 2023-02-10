package com.kelsonthony.maratonajava.javacore.Eblocosinicializacao.test;

import com.kelsonthony.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Teste anime");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
