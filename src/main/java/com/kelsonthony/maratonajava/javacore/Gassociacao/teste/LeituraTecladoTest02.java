package com.kelsonthony.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Previsão do Futuro");
        System.out.println("Digite a sua pergunta eu vou responder sim ou não");

        String pergunta = entrada.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("Não");
        }
    }
}
