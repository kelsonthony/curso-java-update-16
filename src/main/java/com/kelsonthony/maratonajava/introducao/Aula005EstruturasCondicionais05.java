package com.kelsonthony.maratonajava.introducao;

public class Aula005EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprimir o dia da semana, considerando 1 como domingo
        byte dia = 50;
        //char, int, bye, short, enum, String
        switch (dia) {
            default:
                System.out.println("Opção Inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;

        }
    }
}
