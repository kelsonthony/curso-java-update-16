package com.kelsonthony.maratonajava.javacore.Gassociacao.teste;

import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Mestre Kame");
        Professor professor2 = new Professor("Piccollo");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Shotokan", professores);

        escola.imprime();
    }
}
