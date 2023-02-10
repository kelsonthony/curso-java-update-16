package com.kelsonthony.maratonajava.javacore.ZZBcomportamento.test;

import com.kelsonthony.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("-----------------------------");
        System.out.println(filterCarByAger(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static List<Car> filterCarByAger(List<Car> cars, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }


}
