package com.bnta.array;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        // QUESTION 4
        //4. Assigning a value to an array by index
        // adding onto your code from questions 1-3, reassign the second value in the array to the number `17`
        // print the array to the console
        //What happens if you try to assign a value to an index outwith the bounds of the array? Also, what happens if you try to put in a floating point number such as 6.7?

        int [] number = new int [3];
        Arrays.fill(number, 4);
        number [1] = 17;
        System.out.println(Arrays.toString(number));


    }

}
