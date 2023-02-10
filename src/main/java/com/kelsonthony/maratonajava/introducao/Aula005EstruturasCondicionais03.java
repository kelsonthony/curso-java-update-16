package com.kelsonthony.maratonajava.introducao;

public class Aula005EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000.
        double salario = 9000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condicões";
        //String resultado;

        /*if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }*/

        /**
         * operador ternario
         * (condiocao) ? verdadeiro : falso
         */
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
