package com.java.datatype;

import java.util.LinkedList;

public class LinkedListType {

    static LinkedList<String> letterList = new LinkedList<>();

    public static void main(String args[]){
        addElements();
        removeElements();
        findOrSetElement();
        iterateElements();
    }

    static void addElements(){
        letterList.add("A");
        letterList.add("B");
        letterList.addLast("C");
        letterList.addFirst("D");
        letterList.add(2, "E");
        letterList.add("F");
        letterList.add("G");
        System.out.println("Linked after adding elements : " + letterList);
    }

    static void removeElements(){
        letterList.remove("B");
        letterList.remove(3);
        letterList.removeFirst();
        letterList.removeLast();
        System.out.println("Linked list after deletion: " + letterList);
    }

    static void findOrSetElement(){
        boolean status = letterList.contains("E");
        System.out.println("Linked List contains element: - " + status);

        String element = letterList.get(2);
        System.out.println("Element returned by get: " + element);

        letterList.set(2, "Y");
        System.out.println("Linked list after change: " + letterList);
    }

    static void iterateElements(){
        System.out.println("Iterating elements");
        for (String item : letterList) {
            System.out.println(item);
        }
    }

}
