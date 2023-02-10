package com.kelsonthony.maratonajava.javacore.ZGenerics.test;

import com.kelsonthony.maratonajava.javacore.ZGenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

class DoisAtributos<T, X, I> {
    private T t;
    private X x;
    private I i;

    public DoisAtributos(T t, X x, I i) {
        this.t = t;
        this.x = x;
        this.i = i;
    }
}

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(barcoList);
    }

    //    private static <T> void criarArrayComUmObjeto(T t) {
//        List<T> list = List.of(t);
//        System.out.println(list);
//    }
    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
//        List<T> list = List.of(t);
//        System.out.println(list);
//        return list;
    }

    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto2(T t) {
        return List.of(t);
//        List<T> list = List.of(t);
//        System.out.println(list);
//        return list;
    }
}
