package com.kelsonthony.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao05 {

    public static void main(String[] args) {
        /**
         * Dado um valor de um  carro, descubra em quantas vezes pode ser parcelado
         * Condição valorParcela >= 1000
         */
        double valorTotal = 30000;
        for (int parcela =  (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
