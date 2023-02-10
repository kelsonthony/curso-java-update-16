package com.kelsonthony.maratonajava.javacore.ZZClambas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Kelson", "Mchilanny", "Kakaroto");
        List<Integer> integers = List.of(1, 2, 2, 3, 4, 5);

        forEach(names, (String s) -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));
        forEach(integers, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
