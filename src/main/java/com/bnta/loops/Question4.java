package com.bnta.loops;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args)
    {
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array

        int [] numbers = new int[11];
        for (int i = 0; i <=10; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));


    }
}
