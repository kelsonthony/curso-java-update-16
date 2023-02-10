package com.kelsonthony.maratonajava.javacore.Oexception.runtime;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return int
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não aceita divisão por zero");
        }
       /* try {
            return a / b;
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0;*/
        return a / b;
    }
}
