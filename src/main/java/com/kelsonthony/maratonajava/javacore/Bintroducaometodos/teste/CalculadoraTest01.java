package com.kelsonthony.maratonajava.javacore.Bintroducaometodos.teste;

import com.kelsonthony.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
    }
}
