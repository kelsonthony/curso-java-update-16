package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.Category;
import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        //System.out.println(collect);

        //Map<Catagoriy, List<Promotion>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(StreamTest15::getPromotion)));

        System.out.println(collect1);
        System.out.println("-------------------------------------------------------");


        Map<Category, List<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion,
                                Collectors.toList())));

        System.out.println(collect2);
        System.out.println("-------------------------------------------------------");
        Map<Category, Set<Promotion>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion,
                                Collectors.toSet())));

        System.out.println(collect3);
        System.out.println("-------------------------------------------------------");

        Map<Category, LinkedHashSet<Promotion>> collect4 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion,
                                Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect4);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
