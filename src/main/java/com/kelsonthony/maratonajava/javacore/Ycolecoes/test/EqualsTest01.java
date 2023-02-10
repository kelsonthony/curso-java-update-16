package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Mchilanny Bussinguer";
        String nome2 = new String("Mchilanny Bussinguer");

        System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone"); //return false
        //Smartphone s2 = s1; //return true

        System.out.println(s1.equals(s2));

    }
}
