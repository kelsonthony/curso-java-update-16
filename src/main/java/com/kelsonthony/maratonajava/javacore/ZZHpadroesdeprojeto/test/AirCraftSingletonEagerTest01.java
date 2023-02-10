package com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AirCraftSingletonEagerTest01 {
    public static void main(String[] args) {
       bookSeat("1A");
       bookSeat("1A");
       AirCraftTest01.bookSeat("1A");

    }
    private static void bookSeat(String seat) {
        // é o mesmo objeto em memória
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSingletonEager.bookSeat(seat));

    }
}
