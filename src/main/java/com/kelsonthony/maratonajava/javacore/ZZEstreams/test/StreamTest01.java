package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order lighNOvel by Tytle
//2. Retrieve the first 3 titles lights novels with price less than 4
public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Samrurai X", 8.99),
            new LightNovel("Cavaleiros do Zodiaco", 3.99),
            new LightNovel("Sakura Card Captors", 2.99),
            new LightNovel("Super Campeões", 5.99),
            new LightNovel("Samurai Warriors", 5.99),
            new LightNovel("Shurato", 1.99),
            new LightNovel("Dragon Ball Z", 4.00)
    ));

    public static void main(String[] args) {

        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }

            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
