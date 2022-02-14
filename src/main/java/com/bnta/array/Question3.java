package com.bnta.array;

import java.util.Arrays;

public class Question3 {// QUESTION 3

    public static void main(String[] args) {
        //3. Putting information into our array with .fill()

        // using your array from Q1, fill it with the number `4`
        // print the array to the console
        int [] number = new int [3];
        Arrays.fill(number, 4);
        System.out.println(Arrays.toString(number));

    }

}
