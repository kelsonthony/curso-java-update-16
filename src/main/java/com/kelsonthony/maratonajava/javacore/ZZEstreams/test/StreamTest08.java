package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samurai X", 8.99),
            new LightNovel("Cavaleiros do Zodiaco", 3.99),
            new LightNovel("Sakura Card Captors", 12.99),
            new LightNovel("Super Campeões", 5.99),
            new LightNovel("Samurai Warriors", 5.99),
            new LightNovel("Shurato", 1.99),
            new LightNovel("Shurato", 1.99),
            new LightNovel("Dragon Ball Z", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);

    }
}
