package com.kelsonthony.maratonajava.javacore.Ycolecoes.test;

import com.kelsonthony.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();


        map.put("D", "Letra D");
        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");


        System.out.println("Resultado A-Z:");
        for (Map.Entry<String, String> entry: map.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //System.out.println("headMap: " +map.headMap("C").remove("A"));
        System.out.println("headMap: " +map.headMap("C", true));
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        //System.out.println("Map final: " + map);
    }
}
