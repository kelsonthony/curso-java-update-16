package com.kelsonthony.maratonajava.javacore.ZGenerics.test;

import com.kelsonthony.maratonajava.javacore.ZGenerics.dominio.Carro;
import com.kelsonthony.maratonajava.javacore.ZGenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
