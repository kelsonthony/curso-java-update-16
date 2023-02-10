package com.kelsonthony.maratonajava.javacore.ZGenerics.test;

import com.kelsonthony.maratonajava.javacore.ZGenerics.dominio.Barco;
import com.kelsonthony.maratonajava.javacore.ZGenerics.dominio.Carro;
import com.kelsonthony.maratonajava.javacore.ZGenerics.service.BarcoRentavelService;
import com.kelsonthony.maratonajava.javacore.ZGenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"), new Carro("Mercedes")));

        List<Barco> barcosDisponveis = new ArrayList<>(
                List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Buscando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("----------------------------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponveis);

        Barco barco= rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Buscando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
