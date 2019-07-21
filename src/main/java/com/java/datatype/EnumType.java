package com.java.datatype;

public class EnumType {

    public static void main(String args[]){
        accessElementsInEnum();
        iterate();
    }

    static void accessElementsInEnum(){
        System.out.println("----- access elements ------");
        System.out.println(Vowels.A);
        System.out.println(Vowels.I);
        System.out.println(Vowels.E);
    }

    static void iterate(){
        System.out.println("----- iterate over enums ------");
        for (Vowels letter : Vowels.values()) {
            System.out.println(letter);
        }
    }

}
