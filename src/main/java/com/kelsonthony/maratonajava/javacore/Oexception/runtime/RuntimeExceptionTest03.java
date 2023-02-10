package com.kelsonthony.maratonajava.javacore.Oexception.runtime;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        lendoArquivo2();
    }

    private static String lendoArquivo() {
        try {
            System.out.println("Abrindo arquivo");
            //throw new RuntimeException();
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            //System.out.println("Fechando o recurso liberado pelo SO");
            e.printStackTrace();
        } finally {
            //System.out.println("Finally sempre é executado");
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }

    private static void lendoArquivo2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            //throw new RuntimeException();
        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }

    }
}
