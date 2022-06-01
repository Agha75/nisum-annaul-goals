package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    // The difference between a built-in array and an ArrayList in Java,
    // is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).
    // While elements can be added and removed from an ArrayList whenever you want
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0, "Opel");
        System.out.println(cars);
        cars.add(0,"Toyota");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.size());


        LoopArraylist();
        sortArraylist();
    }
    public static void LoopArraylist(){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i)+" ");
        }

        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void sortArraylist(){
        System.out.println("Sort Method called ****************************");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
