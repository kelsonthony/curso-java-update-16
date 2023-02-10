package com.kelsonthony.maratonajava.javacore.Bintroducaometodos.teste;

import com.kelsonthony.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //pessoa.nome = "Kelson";
        pessoa.setNome("Kelson");
        //pessoa.idade = 36;
        pessoa.setIdade(36);

        pessoa.imprime();
        //System.out.println(pessoa.getNome());
        //System.out.println(pessoa.getIdade());
    }
}
