package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapAndArrayList {
    public static void main(String[] args) {

        Map<Integer,String > cars = new HashMap<>();
        cars.put(null,"haha");
        cars.put(null,"hehe");
        cars.put(1,"Volkswagen");
        cars.put(2,"Ferrari");
        cars.put(3,"Toyota");

        System.out.println(cars);


        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Papaya");

        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.size());
        System.out.println(fruits);





    }
}
