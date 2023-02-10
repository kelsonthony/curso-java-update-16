package com.kelsonthony.maratonajava.javacore.Jmodificadorfinal.test;

import com.kelsonthony.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import com.kelsonthony.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);;
        System.out.println(carro.COMPRADOR);;
        carro.COMPRADOR.setNome("João");
        System.out.println(carro.COMPRADOR);;

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo Ferrari");
        ferrari.imprime();
    }
}
