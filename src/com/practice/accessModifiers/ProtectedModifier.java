package com.practice.accessModifiers;

public class ProtectedModifier {
    protected static void display(){
        System.out.println("hello protected");
    }


}
class C {
    public static void main(String[] args) {
        ProtectedModifier.display();
    }
}
