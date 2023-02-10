package com.kelsonthony.maratonajava.javacore.Aintroducaoclasses.teste;

import com.kelsonthony.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;
import com.kelsonthony.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Kakaroto";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
