package com.kelsonthony.maratonajava.javacore.Npolimorfismo.servico;

import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public  static  void  calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;

            String dataValidade = ((Tomate) produto).getDataValidade();
            //System.out.println(tomate.getDataValidade());
            System.out.println(dataValidade);
        }


    }
}
