package com.kelsonthony.maratonajava.javacore.Gassociacao.teste;

import com.kelsonthony.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pele");
        Jogador j2 = new Jogador("Romario");
        Jogador j3 = new Jogador("Cafu");

        Jogador[] jogadores = new Jogador[]{j1, j2, j3};

        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }


}
