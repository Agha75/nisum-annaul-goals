package com.practice.accessModifiers;

public class DefaultModifier {
    void display(){
        System.out.println("Hello default");
    }

    // Rules of default
    // same class = yes
    // same package sub class =yes
    // same package diff class = yes
    // diff package sub class = No
    // diff package diff class = No
}
