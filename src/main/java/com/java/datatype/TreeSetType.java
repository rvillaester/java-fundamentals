package com.java.datatype;

import java.util.TreeSet;

public class TreeSetType {

    static TreeSet<String> letters = new TreeSet<String>();

    public static void main(String args[]){
        addElements();
    }

    static void addElements(){
        letters.add("G");
        letters.add("K");
        letters.add("S");
        letters.add("A");
        letters.add("C");
        letters.add("S");
        letters.add("G");
        System.out.println("TreeSet after adding elements: " + letters);
    }
}
