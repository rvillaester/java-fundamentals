package com.java.datatype;

import java.util.ArrayList;

public class ArrayListType {

    static ArrayList<String> animals = new ArrayList<>();

    public static void main(String args[]){
        addElements();
        removeElements();
        findOrSetElement();
        iterateElements();
    }

    static void addElements(){
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Cow");
        System.out.println("Arraylist after adding elements : " + animals);
    }

    static void removeElements(){
        animals.remove("Cow");
        animals.remove(0);
        System.out.println("Arraylist after removing elements: " + animals);
    }

    static void findOrSetElement(){
        String animal = animals.get(1);
        System.out.println("Getting animal at index 1: " + animal);
    }

    static void iterateElements(){
        System.out.println("Iterating elements");
        for (String item : animals) {
            System.out.println(item);
        }
    }
}
