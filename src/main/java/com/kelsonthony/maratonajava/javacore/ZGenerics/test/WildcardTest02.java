package com.kelsonthony.maratonajava.javacore.ZGenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        // erro em tempo de compilação
        List<Animal> animals = new ArrayList<>();
        printConsulta(cachorros);
        printConsulta(gatos);
        printConsultaAnimal(animals);
        //printConsultaAnimal(cachorros);
    }
    //Type erasure
    //Wildcard = ? sinal de interrogação
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
        //animals.add(new Cachorro());

    }
    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
