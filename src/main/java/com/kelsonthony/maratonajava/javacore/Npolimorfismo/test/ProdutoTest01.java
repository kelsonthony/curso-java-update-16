package com.kelsonthony.maratonajava.javacore.Npolimorfismo.test;

import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Mac", 11000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        Televisao tv = new Televisao("Samsung 55\" ", 5000);

        System.out.println("================================");
        CalculadoraImposto.calcularImposto(computador);

        System.out.println("================================");
        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("================================");
        CalculadoraImposto.calcularImposto(tv);
    }
}
