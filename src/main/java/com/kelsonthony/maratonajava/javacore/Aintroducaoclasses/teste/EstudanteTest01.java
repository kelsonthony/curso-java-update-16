package com.kelsonthony.maratonajava.javacore.Aintroducaoclasses.teste;

import com.kelsonthony.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Kelson";
        estudante.idade = 36;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
