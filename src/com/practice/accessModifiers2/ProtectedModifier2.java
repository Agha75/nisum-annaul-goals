package com.practice.accessModifiers2;

import com.practice.accessModifiers.ProtectedModifier;

public class ProtectedModifier2 extends ProtectedModifier {
    public static void main(String[] args) {
        ProtectedModifier2 p =new ProtectedModifier2();
        p.display();

        // same class = yes
        // same package sub class =yes
        // same package diff class = yes
        // diff package sub class = yes
        // diff package diff class = No
    }
}
