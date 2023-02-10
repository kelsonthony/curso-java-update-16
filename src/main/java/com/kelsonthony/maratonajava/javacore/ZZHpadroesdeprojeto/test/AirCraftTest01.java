package com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;

public class AirCraftTest01 {
    public static void main(String[] args) {
       bookSeat("1A");
       bookSeat("1A");


    }
    static void bookSeat(String seat) {


        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
