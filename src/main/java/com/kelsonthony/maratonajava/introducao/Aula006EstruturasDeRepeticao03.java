package com.kelsonthony.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        /**
         * Imprimir os 25 primeiros números de um dadoo valor, Por exemplo
         */
        int valorMax= 50;
        for (int i = 0; i <= valorMax ; i++) {
            if (i > 25) {
                //System.out.println(i);
                break;
            }
            System.out.println("i = " +i);

        }
    }
}
