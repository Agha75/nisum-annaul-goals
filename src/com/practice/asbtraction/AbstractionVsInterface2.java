package com.practice.asbtraction;

interface Shape2 {

    void draw2();
    double area2();
}

class Rectangle2 implements Shape2 {

    int length, width;
    Rectangle2(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override public void draw2()
    {
        System.out.println("Rectangle has been drawn ");
    }

    @Override public double area2()
    {
        return (double)(length * width);
    }
}
class Circle2 implements Shape2 {

    double pi = 3.14;
    int radius;
    Circle2(int radius) { this.radius = radius; }

    @Override public void draw2()
    {
        System.out.println("Circle has been drawn ");
    }

    @Override public double area2()
    {

        return ((pi * radius * radius));
    }
}
public class AbstractionVsInterface2 {
    public static void main(String[] args) {
        Shape2 rect = new Rectangle2(2, 3);

        System.out.println("Area of rectangle: "
                + rect.area2());

        // Creating the Objects of circle class
        Shape2 circle = new Circle2(2);

        System.out.println("Area of circle: "
                + circle.area2());
    }
}
