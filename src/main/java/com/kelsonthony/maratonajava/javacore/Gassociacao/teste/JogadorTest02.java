package com.kelsonthony.maratonajava.javacore.Gassociacao.teste;

import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        j1.setTime(time);

        j1.imprime();


    }
}
