package com.kelsonthony.maratonajava.javacore.ZZBcomportamento.interfaces;

import com.kelsonthony.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);

    // parametro -> <expressão>
    // (Car car) -> car.getColor().equals("green") // sempre retorna um booleano
    // lambdas são anonimas e são funções, tornar o código mais conciso
}
