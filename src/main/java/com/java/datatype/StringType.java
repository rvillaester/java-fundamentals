package com.java.datatype;

public class StringType {

    static String s;

    public static void main(String args[]){
        System.out.println(s);
        stringOperations();
        escapeSequence();
    }

    static void stringOperations(){
        String hello = "hello";
        String world = "world";
        String helloWorld = hello + " " + world;
        System.out.println(helloWorld);
        System.out.println(hello.concat(world));

        System.out.println(helloWorld.toLowerCase());
        System.out.println(helloWorld.toUpperCase());
        System.out.println(helloWorld.length());
        System.out.println(helloWorld.indexOf(hello));
    }

    static void escapeSequence(){
        String str = "The character \\ is called backslash.";
        System.out.println(str);

        str = "first line\nnew line";
        System.out.println(str);

        str = "hello\tworld";
        System.out.println(str);
    }
}
