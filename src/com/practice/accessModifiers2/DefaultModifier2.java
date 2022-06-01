package com.practice.accessModifiers2;
import com.practice.accessModifiers.*;

public class DefaultModifier2 {
    public static void main(String[] args) {
        DefaultModifier d =new DefaultModifier();
        // will throw error because of diff package and class
        // hover to get better understanding
        // d.display();
    }

    // Rules of default
    // same class = yes
    // same package diff class = yes
    // diff package diff class = No
}
