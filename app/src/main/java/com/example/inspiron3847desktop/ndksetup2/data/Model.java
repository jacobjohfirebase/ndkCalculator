package com.example.inspiron3847desktop.ndksetup2.data;

/**
 * Created by Inspiron3847Desktop on 1/17/2018.
 */

public class Model {

    public enum Operation {EQUALS, CLEAR, ADD, MINUS, MULTIPY, DIVIDE}


    public static native int add(int number1, int number2);

    public static native int minus(int number1, int number2);

    public static native int multiply(int number1, int number2);

    public static native int divide(int number1, int number2);






}
