package com.kelsonthony.maratonajava.javacore.Npolimorfismo.test;

import com.kelsonthony.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import com.kelsonthony.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();
    }
}
