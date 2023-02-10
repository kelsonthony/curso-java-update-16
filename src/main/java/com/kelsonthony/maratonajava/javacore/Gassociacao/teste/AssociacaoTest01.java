package com.kelsonthony.maratonajava.javacore.Gassociacao.teste;

import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Aluno;
import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Local;
import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Professor;
import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Figueiras");
        Aluno a1 = new Aluno("João", 20);
        Professor p1 = new Professor("Barba Branca", "Pirata");

        Aluno[] alunos = {a1};
        Seminario seminario = new Seminario("Sobre filmes", alunos, local);

        Seminario[] seminariosDisponiveis = {seminario};

        p1.setSeminarios(seminariosDisponiveis);

        p1.imprime();
    }
}
