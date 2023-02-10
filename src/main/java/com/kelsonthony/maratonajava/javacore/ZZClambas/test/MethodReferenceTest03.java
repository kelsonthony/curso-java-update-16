package com.kelsonthony.maratonajava.javacore.ZZClambas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> animes = new ArrayList<>(List.of("Goku", "Seiya", "Athena"));

        animes.sort(String::compareTo);
        System.out.println(animes);

        //Function<String, Integer> numStringTOInteger = s -> Integer.parseInt(s);
        Function<String, Integer> numStringTOInteger = Integer::parseInt;
        Integer num = numStringTOInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(animes, "Goku"));
    }
}
