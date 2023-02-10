package com.kelsonthony.maratonajava.javacore.Bintroducaometodos.teste;

import com.kelsonthony.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.kelsonthony.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Joao";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressoraEstudante.imprimeEstudante(estudante01);

        impressoraEstudante.imprimeEstudante(estudante02);
    }
}
