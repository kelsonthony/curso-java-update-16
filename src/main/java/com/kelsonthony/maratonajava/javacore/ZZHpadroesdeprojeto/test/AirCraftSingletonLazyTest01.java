package com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import com.kelsonthony.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AirCraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);

        constructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);

    }

    private static void bookSeat(String seat) {
        // é o mesmo objeto em memória
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        AircraftSingletonLazy aircraftSingletonEager = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraftSingletonEager.bookSeat(seat));

    }
}
