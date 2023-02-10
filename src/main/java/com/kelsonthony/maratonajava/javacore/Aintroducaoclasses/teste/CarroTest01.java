package com.kelsonthony.maratonajava.javacore.Aintroducaoclasses.teste;

import com.kelsonthony.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Marea";
        carro1.ano = 2009;
        carro1.modelo = "Turbo";

        carro2.nome = "Gol";
        carro2.ano = 2010;
        carro2.modelo = "Sport";

        carro1 = carro2;

        System.out.println(carro1.nome + carro1.modelo + carro1.ano);

        System.out.println(carro2.nome + carro2.modelo + carro2.ano);
    }
}
