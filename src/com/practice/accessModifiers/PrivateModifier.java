package com.practice.accessModifiers;

public class PrivateModifier {
    public static void main(String[] args) {
        PrivateModifier2 p =new PrivateModifier2();
        // Todo :: Error will be thrown
        // p.display();

        // Rules of private
        // same class = yes
        // same package sub class = No
        // same package diff class = No
        // diff package sub class = No
        // diff package diff class = No
    }
}
class PrivateModifier2 {
    private void display(){
        System.out.println("Hello private");
    }

}
