package com.kelsonthony.maratonajava.introducao;

public class Aula002TiposPrimitivos {

    public static void main(String[] args) {
        /**
         * 8 tipos primitivos
         * int, double, float, char, byte, short, long, boolean
         */
        int idade = (int) 10000000000L;
        long numeroGrande = 10000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        //char caractere = 65;
        char caractere = '\u0041';

        String nome = "John";

        //var nome2 = "Goku";

        System.out.println("byte " + idadeByte);
        System.out.println(verdadeiro);
        System.out.println("caractere " + caractere);
        System.out.println("salarioFloat " + salarioFloat);
        System.out.println("idade  " + idade);
        System.out.println("nome  " + nome);
    }

}
