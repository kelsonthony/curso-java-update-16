package com.kelsonthony.maratonajava.javacore.ZZBcomportamento.test;

import com.kelsonthony.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import com.kelsonthony.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });

        //lambda
        List<Car> greenCars2 = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> oldCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(greenCars2);
        System.out.println(redCars);
        System.out.println(oldCars);

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {

        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCars.add(car);
            }
        }
        return filterCars;
    }




}
