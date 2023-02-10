package com.kelsonthony.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao02 {

    public static void main(String[] args) {
        /**
         * Imprimir todos os numeros pares de 0 até 100000
         */
        for (int i = 0; i < 1000000; i++) {
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }

        
    }
}
