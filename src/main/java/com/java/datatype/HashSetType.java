package com.java.datatype;

import java.util.HashSet;

public class HashSetType {

    static HashSet<String> citySet = new HashSet<>();

    public static void main(String args[]){
        addElements();
        removeElements();
        iterateElements();
    }

    static void addElements(){
        citySet.add("Makati");
        citySet.add("Manila");
        citySet.add("Davao");
        citySet.add("Cebu");
        citySet.add("Davao");
        System.out.println("HashSet after adding elements: " + citySet);
    }

    static void removeElements(){
        boolean isRemoved = citySet.remove("Manila");
        System.out.println("Is Manila removed: " + isRemoved);

        isRemoved = citySet.remove("Batangas");
        System.out.println("Is Batangas removed: " + isRemoved);

        System.out.println("HashSet after removing elements: " + citySet);
    }

    static void iterateElements(){
        System.out.println("Iterating elements");
        for (String city : citySet) {
            System.out.println(city);
        }
    }
}
