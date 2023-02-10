package com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPartternTest01 {
    public static void main(String[] args) {
        //new Person("Kelson", "Menezes", "kelsonthony", "k.thony@gmail.com");
        Person person = new Person.PersonBuilder()
                .firstName("Kelson")
                .lastName("Menezes")
                .username("kelsonthony")
                .email("k.thony@mail.com")
                .build();

        System.out.println(person);
    }
}
