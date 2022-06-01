package com.practice.keyWords;

class Vehicle
{
    int maxSpeed = 120;
}

class Car extends Vehicle
{
    int maxSpeed = 180;

    void display()
    {
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}

public class Super {
    public static void main(String[] args) {
        Car small = new Car();
        small.display();
    }
}

// In the above example, both base class and subclass have a member maxSpeed.
// We could access maxSpeed of base class in subclass using super keyword.
