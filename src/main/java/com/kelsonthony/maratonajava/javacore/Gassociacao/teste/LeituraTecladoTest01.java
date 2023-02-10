package com.kelsonthony.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome abaixo: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para o seu sexo: ");
        char sex = entrada.next().charAt(0);

        System.out.println("Relatório");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sex);
    }
}
