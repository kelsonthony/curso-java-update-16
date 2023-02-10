package com.kelsonthony.maratonajava.javacore.ZZEstreams.test;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest00 {
    public static void main(String[] args) {
        List<? extends Serializable> nome = List.of("nome", 1, true, 2);

        List<Number> collect = nome.stream()
                .filter(n -> n instanceof Number)
                .map(n -> (Number) n)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
