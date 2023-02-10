package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1. Order lighNOvel by Tytle
//2. Retrieve the first 3 titles lights novels with price less than 4
public class StreamTest02 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samurai X", 8.99),
            new LightNovel("Cavaleiros do Zodiaco", 3.99),
            new LightNovel("Sakura Card Captors", 2.99),
            new LightNovel("Super Campeões", 5.99),
            new LightNovel("Samurai Warriors", 5.99),
            new LightNovel("Shurato", 1.99),
            new LightNovel("Dragon Ball Z", 4.00)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);

    }
}
