package com.kelsonthony.maratonajava.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {
        // + - / *
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println("Valor: " + resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        /**
         * operadores logicos
         *  < >
         *  <= >=
         *  ==
         *  !=
         */
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte: " + isDezDiferenteVinte);

        /**
         * && (AND)
         * || (OR)
         * ! (NOT)
         */
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlayStationCincoCompravel" + isPlayStationCincoCompravel);

        /**
         *  = += *= /= %=
         */
        double bonus = 1800;

        //bonus = bonus + 1000;
        bonus += 1000; // 2800
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus " + bonus);

        /**
         * operador unário
         */
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0;
        System.out.println(contador2++); // valor 0
        System.out.println(++contador2); // valor 0



    }
}
