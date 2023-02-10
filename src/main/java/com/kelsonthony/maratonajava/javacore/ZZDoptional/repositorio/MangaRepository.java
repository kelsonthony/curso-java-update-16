package com.kelsonthony.maratonajava.javacore.ZZDoptional.repositorio;

import com.kelsonthony.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "DBZ", 300),
            new Manga(2, "Cavaleiros", 200));


    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);

    }
    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));

    }
    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTittle().equals(title));
    }

    //modo antigo
//    private static Optional<Manga> findById(Integer id) {
//        Manga found = null;
//        for (Manga manga : mangas) {
//            if (manga.getId().equals(id)) {
//                found = manga;
//            }
//        }
//
//        return Optional.ofNullable(found);
//
//    }
//    private static Optional<Manga> findByTitle(String title) {
//        Manga found = null;
//        for (Manga manga : mangas) {
//            if (manga.getTittle().equals(title)) {
//                found = manga;
//            }
//        }
//
//        return Optional.ofNullable(found);
//
//    }



}
