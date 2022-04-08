package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Auto auto0 = new Auto("LaFerrari", "Ferrari", 2016);
        Auto auto1 = new Auto("E36", "BMW", 2000);
        Auto auto2 = new Auto("Gle 53", "Mercedes Benz", 2022);
        Auto auto3 = new Auto("M5 CS", "BMW", 2021);
        Auto auto4 = new Auto("Range Rover Vogue", "Land Rover", 2019);

        ShowroomHashMap<Auto, Integer> map = new ShowroomHashMap<>();

        System.out.println("put key null: " + map.put(null, 1));
        System.out.println("put value null: " + map.put(auto0, null));
        System.out.println("put key year > 2022: " + map.put(new Auto("AMG GT", "Mercedes Benz", 2024), 0));
        System.out.println("put key year = 2022: " + map.put(new Auto("SL63", "Mercedes-Benz", 2022), 0));
        System.out.println("put val -1: " + map.put(auto0, -1));
        System.out.println("put auto0: " + map.put(auto0, 4));
        System.out.println("put auto1: " + map.put(auto1, 0));
        System.out.println("put auto2: " + map.put(auto2, 10));
        System.out.println("put auto3: " + map.put(auto3, 8));
        System.out.println(map);
        System.out.println("size: " + map.size());
        System.out.println("containsKey new auto - - 2000: " + map.containsKey(new Auto("-", "-", 2000)));
        System.out.println("get new auto - - 2000: " + map.get(new Auto("-", "-", 2000)));
        System.out.println("containsKey book2: " + map.containsKey(auto2));
        System.out.println("get auto2: " + map.get(auto2));
        System.out.println("remove auto2: " + map.remove(auto2));
        System.out.println(map);
        System.out.println("arr = " + Arrays.toString(map.toArray()));
        Integer[] arr1;
        arr1 = map.toArray();
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("isEmpty: " + map.isEmpty());
        System.out.println("Clear");
        map.clear();
        System.out.println("isEmpty: " + map.isEmpty());
        System.out.println(map);
    }
}