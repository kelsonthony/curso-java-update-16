package com.kelsonthony.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    //public static final double VELOCIDADE_LIMITE;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println(this.nome);
    }

    /*static {
        VELOCIDADE_LIMITE = 250;
    }*/

    /*public Carro() {
        VELOCIDADE_LIMITE = 250;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
