package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");

        System.out.println(list);

        list.add(1,"To the");
        System.out.println(list);

        for (int a=0; a<list.size(); a++){
            System.out.println(a+" "+list.get(a));
        }


        // Using for-each loop
        for (String str : list){
            System.out.print(str+" ");
        }
    }
}
