package com.bnta.data_structure;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WorkingWithArrayLists {
    public static  void main (String [] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.contains(0));
        list.forEach(e -> {});{
            System.out.println("list = " + list);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
