package com.bnta.loops;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
// QUESTION 5
// using your answer from Question 4, create a for loop that goes through the values
// print each value individually

        int [] numbers = new int [11];
        for (int i = 0; i <=10; i++){
            numbers[i] = i;
        }

        for (int number : numbers){
            System.out.println(number);
        }

    }
}
