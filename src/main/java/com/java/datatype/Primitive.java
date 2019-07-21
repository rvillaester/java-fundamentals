package com.java.datatype;

public class Primitive {

    static final String DEFAULT_VALUE_FORMAT =  "Default value of %s is %s";
    static final String VALUE_FORMAT =  "Value of %s is %s";

    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bb;
    static char c;

    public static void main(String args[]){
        System.out.println("-------------- Print default values --------------");
        printValue(DEFAULT_VALUE_FORMAT);
        assignValue();
        primitiveValueAssignToWrapperType();
        wrapperValueAssignToPrimitiveType();
        wideningCasting();
        narrowingCasting();
    }

    static void printValue(String formatter){
        System.out.println(String.format(formatter, "byte", b));
        System.out.println(String.format(formatter, "short", s));
        System.out.println(String.format(formatter, "int", i));
        System.out.println(String.format(formatter, "long", l));
        System.out.println(String.format(formatter, "float", f));
        System.out.println(String.format(formatter, "double", d));
        System.out.println(String.format(formatter, "boolean", bb));
        System.out.println(String.format(formatter, "char", c));
    }

    static void assignValue(){
        System.out.println("-------------- Assigning value to primitive data type --------------");
        b = 1;
        s = 2;
        i = -454523244;
        l = 453452523l;
        f = -0.98f;
        d = 76.8654;
        bb = true;
        c = 'c';
        printValue(VALUE_FORMAT);
    }

    static void primitiveValueAssignToWrapperType(){
        System.out.println("-------------- Assigning primitive value to a wrapper data type --------------");
        Byte b = 1;
        Short s = 2;
        Integer i = -454523244;
        Long l = 453452523l;
        Float f = -0.98f;
        Double d = 76.8654;
        Boolean bb = true;
        Character c = 'c';
        System.out.println(String.format(VALUE_FORMAT, "byte", b));
        System.out.println(String.format(VALUE_FORMAT, "short", s));
        System.out.println(String.format(VALUE_FORMAT, "int", i));
        System.out.println(String.format(VALUE_FORMAT, "long", l));
        System.out.println(String.format(VALUE_FORMAT, "float", f));
        System.out.println(String.format(VALUE_FORMAT, "double", d));
        System.out.println(String.format(VALUE_FORMAT, "boolean", bb));
        System.out.println(String.format(VALUE_FORMAT, "char", c));
    }

    static void wrapperValueAssignToPrimitiveType(){
        System.out.println("-------------- Assigning wrapper value to a primitive data type --------------");
        b = 1;
        b = new Byte(b);

        s = 2;
        s = new Short(s);

        i = new Integer(-3);
        l = new Long(4l);
        f = new Float(-0.98f);
        d = new Double(76.8654);
        bb = new Boolean(true);
        c = new Character('c');
        printValue(VALUE_FORMAT);
    }

    static void wideningCasting(){
        System.out.println("-------------- Widening casting--------------");

        short s = 3;
        long l = s;
        System.out.println("long value is " + l);

        Byte b = 4;
        int i = b;
        System.out.println("int value is " + i);

        Integer n = -56;
        float f = n;
        System.out.println("float value is " + f);
    }

    static void narrowingCasting(){
        System.out.println("-------------- Narrowing casting--------------");
        int i = 3;
        byte b = (byte)i;
        System.out.println("byte value is " + b);

        double myDouble = 9.78;
        int myInt = (int) myDouble;
        System.out.println("int value is " + myInt);

        i = 300;
        Byte b1 = (byte)i;
        System.out.println("byte value is " + b1);

        long l = -40000L;
        Short s = (short)l;
        System.out.println("short value is " + s);
    }
}
