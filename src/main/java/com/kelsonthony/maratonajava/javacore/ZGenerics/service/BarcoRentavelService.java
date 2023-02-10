package com.kelsonthony.maratonajava.javacore.ZGenerics.service;

import com.kelsonthony.maratonajava.javacore.ZGenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponveis = new ArrayList<>(
            List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Barcos disponiveis: " + barcosDisponveis);
        System.out.println("Buscando barco disponível...");
        Barco barco = barcosDisponveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponveis);
        return barco;

    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco: " + barco);
        barcosDisponveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponveis);
    }

}
