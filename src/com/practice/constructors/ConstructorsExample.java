package com.practice.constructors;

public class ConstructorsExample {
    // Todo:: Kye Differences between constructors and methods
    // Constructors must have the same name as the class within which it is defined while it is not necessary for the method in Java.
    // Constructors do not return any type while method(s) have the return type or void if does not return any value.
    // Constructors are called only once at the time of Object creation while method(s) can be called any number of times.

    /*The rules for writing constructors are as follows:
    Constructor(s) of a class must have the same name as the class name in which it resides.
    A constructor in Java can not be abstract, final, static, or Synchronized.
    Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.*/

    int age;
    String name;
    ConstructorsExample(){
        System.out.println("cons called");
    }
    public static void main(String[] args) {
        ConstructorsExample c = new ConstructorsExample();
        // Note: Default constructor provides the default values to the object like 0, null, etc. depending on the type.
        System.out.println(c.age);
        System.out.println(c.name);

    }
}
