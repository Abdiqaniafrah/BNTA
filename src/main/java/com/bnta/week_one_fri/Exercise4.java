package com.bnta.week_one_fri;

import java.time.LocalDate;
import java.util.Arrays;

public class Exercise4 {
        public static void main(String[] args) {
        /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */
            String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            String[] inputArray = input.split(", ");
//            System.out.println(inputArray[3]);

            double sum = 0;
            for (int i = 0; i < inputArray.length; i++){
                sum = sum + Double.parseDouble(inputArray[i]);
//                System.out.println(sum);
                System.out.println(Arrays.toString(inputArray));
                System.out.println(inputArray[i]);
                System.out.println(i);
                sum = sum + Double.parseDouble(inputArray[1]);
                System.out.println(sum);


            }

    }

}
