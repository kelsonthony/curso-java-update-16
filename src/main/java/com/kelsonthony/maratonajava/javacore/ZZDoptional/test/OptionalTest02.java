package com.kelsonthony.maratonajava.javacore.ZZDoptional.test;

import com.kelsonthony.maratonajava.javacore.ZZDoptional.dominio.Manga;
import com.kelsonthony.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("DBZ");
        mangaByTitle.ifPresent(m -> m.setTittle("Dragon Ball Z"));

        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga mangaNew = MangaRepository.findByTitle("Samurai X")
                //.orElse(new Manga(3, "Samurai X", 201));
                .orElseGet((() -> new Manga(3, "Samurai X", 201)));

        System.out.println(mangaNew);

    }
}
