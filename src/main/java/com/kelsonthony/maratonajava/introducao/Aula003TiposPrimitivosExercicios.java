package com.kelsonthony.maratonajava.introducao;

/**
 * Criar variaveis para campos abaixo
 * Eu <nome>, morando no endereco <endereco>
 * nome, endereço
 * salario
 * data
 */
public class Aula003TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Goku";
        String endereco = "Rua 20 Sul";
        double salario = 2000.12;
        String dataRecebimentoSalario = "20/02/2022";
        String relatorio = "Eu " + nome + " morando no endereco " + endereco + " confirmo que " +
                "recebi o salário de " + salario + "na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
