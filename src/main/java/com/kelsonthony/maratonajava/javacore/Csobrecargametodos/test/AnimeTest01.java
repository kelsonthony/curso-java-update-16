package com.kelsonthony.maratonajava.javacore.Csobrecargametodos.test;

import com.kelsonthony.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //anime.init("DBZ", "TV", 12);
        anime.init("DBZ", "TV", 12, "Acao");
        //anime.setGenero("Ação");
        /*anime.setNome("DBZ");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/

        anime.imprime();
    }
}
