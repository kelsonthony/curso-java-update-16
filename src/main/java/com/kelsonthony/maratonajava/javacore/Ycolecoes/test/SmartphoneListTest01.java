package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("XXXXX", "Pixel");
        Smartphone s3 = new Smartphone("22222", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        //smartphones.clear();

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "Samsung");
        smartphones.add(0, s4);

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        //System.out.println(indexSmartphone4);
        System.out.println(smartphones.get(indexSmartphone4));

    }
}
