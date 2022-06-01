package com.practice.asbtraction;

abstract class Shape{
    String color;
    abstract double area();
    public abstract String toString();

    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color=color;
    }

    public String getColor(){
        return color;
    }
}

class Circle extends Shape{
    double radius;

    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle Constructor called");
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor()
                + " and area is : " + area();
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("Rectangle Constructor called");
        this.length=length;
        this.width=width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor()
                + " and area is : " + area();
    }
}
public class Example {
    public static void main(String[] args) {
        Shape s = new Circle("red",2.2);
        System.out.println(s);


        Shape r = new Rectangle("blue",2,4);
        System.out.println(r);

        Circle c=new Circle("yellow",2.2);
        System.out.println(c);

    }
}
// An abstract class is a class that is declared with an abstract keyword.
// An abstract method is a method that is declared without implementation.
// An abstract class may or may not have all abstract methods. Some of them can be concrete methods
// A method defined abstract must always be redefined in the subclass, thus making overriding compulsory OR either make the subclass itself abstract.
// Any class that contains one or more abstract methods must also be declared with an abstract keyword.
// There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
// An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.