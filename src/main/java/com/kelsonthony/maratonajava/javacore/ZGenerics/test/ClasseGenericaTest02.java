package com.kelsonthony.maratonajava.javacore.ZGenerics.test;

import com.kelsonthony.maratonajava.javacore.ZGenerics.dominio.Barco;

import com.kelsonthony.maratonajava.javacore.ZGenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
