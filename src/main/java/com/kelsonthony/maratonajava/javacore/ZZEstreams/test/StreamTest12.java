package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.Category;
import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();

        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }

        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.ROMANCE, romance);

        System.out.println(categoryListMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
