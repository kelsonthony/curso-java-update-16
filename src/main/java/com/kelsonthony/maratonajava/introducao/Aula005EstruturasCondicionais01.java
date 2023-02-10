package com.kelsonthony.maratonajava.introducao;

public class Aula005EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        // Instrucao independente
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        boolean c = false;

        if (c == true) {
            System.out.println("Nunca será executado");
        }



        System.out.println("Fora do IF");
    }
}

