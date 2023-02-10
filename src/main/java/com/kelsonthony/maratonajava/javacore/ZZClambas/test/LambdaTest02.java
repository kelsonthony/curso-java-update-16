package com.kelsonthony.maratonajava.javacore.ZZClambas.test;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Kakaroto", "Vegeta", "Gohan");
        List<Integer> integers = map(strings, (String s) -> s.length());
        List<String> map = map(strings, s -> s.toString());
        System.out.println(integers);
        System.out.println(map);

        //Metodo Refenence
        List<Integer> integers2 = map(strings, String::length);
        List<String> map2 = map(strings, String::toString);
        System.out.println(integers2);
        System.out.println(map2);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;

    }
}
