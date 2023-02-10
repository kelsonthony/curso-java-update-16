package com.kelsonthony.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static  {
        System.out.println("Dentro do bloco estático de funcionário.");
    }
    {
        System.out.println("Dentro do bloco não estático de funcionário 1.");
    }
    {
        System.out.println("Dentro do bloco não estático de funcionário 2.");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário.");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu: " + this.nome + " rebebi: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
