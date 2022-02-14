package com.bnta.data_structure;

import java.lang.reflect.Array;
import java.util.*;

public class NumberOfOccurrences {
    //    Given the following array of strings.
//    String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
//    Find the number of occurrences for each element
//    Your method should return something like the following:
//         "1": 4,
//         "3": 1,
//         "4": 1,
//         "5": 1,
//         "6": 1,
//         "7": 3,
//         "8": 2
//    Think about the data structure that you should use
//    Create a method. Think about the return type and parameters
//    Write unit tests for your method
    public static void main(String[] args) {

        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
        Map<String, Integer> map = new HashMap<>();
        // First we need to split because we want the individual numbers it's currently a String and in this case .split will split the String everytime there is a comma
        String [] split = input.split(";");
        // enhanced for loop
        for (String e : split) // looping through the array called split and looking at each element in the array (e = element)
        {
            if (!map.containsKey(e)) // if the map doesn't contain "e" (element) then
            {
                map.put(e, 1); // put "e" in the map and set the value as 1 for each key
            } else{
                // if it does contain that element then add one to that key within the map
                int count = map.get(e) + 1; // creating the variable to add 1 each time there's a repeat of the same element
                map.put(e, count);
            }
        }
    }
}
