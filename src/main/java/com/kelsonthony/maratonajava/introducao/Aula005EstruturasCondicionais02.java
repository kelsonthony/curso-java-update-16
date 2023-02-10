package com.kelsonthony.maratonajava.introducao;

public class Aula005EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenul
        // idade >= 18 categoria adulto

        int idade = 12;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
