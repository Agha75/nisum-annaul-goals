package com.practice.accessModifiers;

public class PublicModifier {
    public void display(){
        System.out.println("Hello public");
    }
    // Rules of public
    // same class = yes
    // same package sub class =yes
    // same package diff class = yes
    // diff package sub class = yes
    // diff package diff class = yes
}
