package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        boolean prices = lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9);
        System.out.println(prices);
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
