package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.Category;
import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samurai X", 8.99, Category.FANTASY),
            new LightNovel("Cavaleiros do Zodiaco", 3.99, Category.FANTASY),
            new LightNovel("Sakura Card Captors", 12.99, Category.DRAMA),
            new LightNovel("Super Campeões", 5.99, Category.FANTASY),
            new LightNovel("Samurai Warriors", 5.99, Category.FANTASY),
            new LightNovel("Shurato", 1.99, Category.FANTASY),
            new LightNovel("Shurato", 1.99, Category.FANTASY),
            new LightNovel("Dragon Ball Z", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect3);
        //lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));

    }
}
