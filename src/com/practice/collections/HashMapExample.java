package com.practice.collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);
        capitalCities.size();
        System.out.println(capitalCities);

        // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        //Print Keys
        for (String i : capitalCities.keySet()) {
            System.out.println("Keys*********"+i);
        }


        // Print values
        for (String i : capitalCities.values()) {
            System.out.println("Values********"+i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("***key: " + i + " and "+ "***value: " + capitalCities.get(i));
        }

        capitalCities.clear();
        System.out.println(capitalCities);



        LinkedListExample2();
    }
    public static void LinkedListExample2(){
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
