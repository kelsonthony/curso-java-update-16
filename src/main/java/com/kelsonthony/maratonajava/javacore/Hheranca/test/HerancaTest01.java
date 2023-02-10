package com.kelsonthony.maratonajava.javacore.Hheranca.test;

import com.kelsonthony.maratonajava.javacore.Hheranca.dominio.Endereco;
import com.kelsonthony.maratonajava.javacore.Hheranca.dominio.Funcionario;
import com.kelsonthony.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 20");
        endereco.setCep("71925-360");

 /*       Pessoa pessoa = new Pessoa();

        System.out.println("Pessoa");
        pessoa.setNome("Kakaroto");
        pessoa.setCpf("000000000");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("John");
        funcionario.setCpf("1111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        System.out.println("Funcionario");
        funcionario.imprime();*/
    }
}
