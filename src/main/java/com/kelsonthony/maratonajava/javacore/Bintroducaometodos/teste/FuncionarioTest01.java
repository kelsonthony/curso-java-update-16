package com.kelsonthony.maratonajava.javacore.Bintroducaometodos.teste;

import com.kelsonthony.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Joao");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{100, 100, 100});

        funcionario.imprime();
        System.out.println("Media: " + funcionario.getMedia());

    }
}
