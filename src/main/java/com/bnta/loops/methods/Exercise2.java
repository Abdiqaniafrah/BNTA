package com.bnta.loops.methods;

public class Exercise2 {
    public static int myNumber (int number) {
        //Write a method which takes a number as an argument and returns that number negated, e.g. passing 5 as an argument should return -5; passing -10 should return 10.
        return number *-1;
    }

    public static void main(String[] args) {
        System.out.println(myNumber(-1));
    }
}