package com.bnta.week_one_fri;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Exercise5 {
    /*
       Write a program that takes arguments from the program args and loops through args and prints each item in args
       Compile using: javac and run using: java
       i.e. javac Exercise5.java | java Exercise5 foo bar baz
     */
    public static void main(String[] args) {
        // loop through args here
        int [] numebrs = { 1, 9, 9 ,7};
        int seven = numebrs[3];
        int four = numebrs [1];
        System.out.println(seven);
        System.out.println(four);
    }
}
