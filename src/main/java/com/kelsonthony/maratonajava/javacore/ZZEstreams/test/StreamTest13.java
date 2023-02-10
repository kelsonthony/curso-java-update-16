package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.Category;
import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));
        System.out.println(collect);

        //Map<Catagory, Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                )));

        System.out.println(collect1);
    }
}
