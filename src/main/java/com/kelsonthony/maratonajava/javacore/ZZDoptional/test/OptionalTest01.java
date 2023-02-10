package com.kelsonthony.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hahahaah");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println("o1: " + o1);
        System.out.println("o2: " + o2);
        System.out.println("o3: " + o3);
        System.out.println("------------------------");


        //String name = findName("Kelson");
        Optional<String> nameOptional = findName("Kelson");
        String empty = nameOptional.orElse("EMPTY");

        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));



        //System.out.println("nameOptional: " + nameOptional);
        //System.out.println("empty: " + empty);
        //nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
    private static Optional<String> findName(String name) {
        List<String> list = List.of("Kelson", "Mchilanny");


        int i = list.indexOf(name);

        if (i != -1) {
            return Optional.of(list.get(i));
        }

        return Optional.empty();

    }

    /*private static String findName(String name) {
        List<String> list = List.of("Kelson", "Mchilanny");

        int i = list.indexOf(name);

        if (i != 1) {
            return list.get(i);
        }

        return null;

    }*/
}
