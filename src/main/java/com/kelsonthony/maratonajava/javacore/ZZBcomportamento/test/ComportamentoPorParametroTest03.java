package com.kelsonthony.maratonajava.javacore.ZZBcomportamento.test;

import com.kelsonthony.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import com.kelsonthony.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static final List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

        //lambda
        List<Car> greenCars = filter(cars, (Car car) -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> oldCars = filter(cars, car -> car.getYear() < 2015);
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,0);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(oldCars);
        System.out.println(filter(integers, num -> num % 2 == 0));

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;

    }



}
