package com.kelsonthony.maratonajava.javacore.Npolimorfismo.servico;

import com.kelsonthony.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
