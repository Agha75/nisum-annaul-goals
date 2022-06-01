package com.practice.collections;


import java.util.ArrayList;
import java.util.List;

public class ListExample3 {
    public static void main(String[] args) {
        // Size of ArrayList
        int n = 5;
        // Declaring the List with initial size n
        List<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new elements
        // at the end of the list
        for (int i = 1; i <= n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying the list after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (Integer integer : arrli)
            System.out.print(integer + " ");
    }
    public static void StackDataStructure(){

    }
}
