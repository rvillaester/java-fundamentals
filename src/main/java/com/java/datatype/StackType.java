package com.java.datatype;

import java.util.Stack;

public class StackType {

    static Stack<String> cardStack = new Stack<>();

    public static void main(String args[]){
        pushElements();
        popElements();
    }

    static void pushElements(){
        cardStack.push("King");
        cardStack.push("Queen");
        cardStack.push("Ace");
        cardStack.push("Jack");
        System.out.println("Stack after pushing elements: " + cardStack);
    }

    static void popElements(){
        String card = cardStack.pop();
        System.out.println("Card that pop: " + card);
        card = cardStack.pop();
        System.out.println("Card that pop: " + card);
        System.out.println("Stack after popping elements: " + cardStack);
    }
}
