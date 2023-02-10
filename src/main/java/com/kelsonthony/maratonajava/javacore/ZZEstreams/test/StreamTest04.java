package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import com.kelsonthony.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> escola = new ArrayList<>();
        List<String> graphicDesigners = List.of("João Santos", "Catarina Santos", "Sandy Candor");
        List<String> developers = List.of("Kelson", "José");
        List<String> students = List.of("Guilherme", "Maria", "Joana");

        escola.add(graphicDesigners);
        escola.add(developers);
        escola.add(students);

        for (List<String> people : escola) {
            for (String person : people) {
                System.out.println(person );
            }

        }
        System.out.println("---------------------");
//        Stream<String> stringStream = escola.stream()
//                .flatMap(l -> l.stream());
        escola.stream()
                .flatMap(Collection::stream).forEach(System.out::println);

    }
}
