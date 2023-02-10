package com.kelsonthony.maratonajava.javacore.Dconstrutores.test;

import com.kelsonthony.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("DBZ", "TV", 12, "Acao", "Production");
        //anime.init("DBZ", "TV", 12);
        //anime.init("DBZ", "TV", 12, "Acao");
        //anime.setGenero("Ação");
        /*anime.setNome("DBZ");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/

        anime.imprime();
    }
}
