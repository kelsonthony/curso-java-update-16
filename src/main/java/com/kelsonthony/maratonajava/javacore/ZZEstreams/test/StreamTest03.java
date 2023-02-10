package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samurai X", 8.99),
            new LightNovel("Cavaleiros do Zodiaco", 3.99),
            new LightNovel("Sakura Card Captors", 2.99),
            new LightNovel("Super Campeões", 5.99),
            new LightNovel("Samurai Warriors", 5.99),
            new LightNovel("Shurato", 1.99),
            new LightNovel("Shurato", 1.99),
            new LightNovel("Dragon Ball Z", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream().forEach(System.out::println);

        long count = stream
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);
        System.out.println(count2);
    }
}
