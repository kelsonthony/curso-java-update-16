package com.kelsonthony.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Mchilanny"; // String constant pool
        String nome2 = "Mchilanny";
        nome = nome.concat(" Menezes"); // nome += " Menezes"

        System.out.println(nome.equals(nome2));
        System.out.println(nome == nome2);
        System.out.println(nome);

        String nome3 = new String("Mchilanny");
        // 1 variavel de ferencia, 2 objeto do tripo string, 3 uma string no pool de strings

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
