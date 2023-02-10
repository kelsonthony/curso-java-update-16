package com.kelsonthony.maratonajava.javacore.Npolimorfismo.test;

import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate cereja", 30);
        tomate.setDataValidade("11/12/2022");

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("---------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
