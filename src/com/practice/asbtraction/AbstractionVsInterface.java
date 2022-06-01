package com.practice.asbtraction;

/*Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
        Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
        Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
        Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.
        Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
        Multiple implementations: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
        Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.*/
abstract class Shape1{
    String objName;
    Shape1(String ojName){
        this.objName=ojName;
    }
    public void moveTo(int x,int y){
        System.out.println(this.objName + " "
                + "has been moved to"
                + " x = " + x + " and y = " + y);
    }
    abstract public double area();
    abstract public void draw();
}
class Rectangle1 extends Shape1{
    int length,width;
    Rectangle1(String objName,int length,int width){
        super(objName);
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return (double)length*width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has drawn");
    }
}
class Circle1 extends Shape1{
    double pi = 3.14;
    int radius;

    Circle1(int radius, String name)
    {
        super(name);
        this.radius = radius;
    }

    @Override public void draw()
    {
        System.out.println("Circle has been drawn ");
    }

    @Override public double area()
    {
        return (pi * radius * radius);
    }
}
public class AbstractionVsInterface {
    public static void main(String[] args) {
        Shape1 rect = new Rectangle1("Rectangle",2, 3);

        System.out.println("Area of rectangle: "
                + rect.area());

        rect.moveTo(1, 2);

        System.out.println(" ");


        Shape1 circle = new Circle1(2, "Circle");

        System.out.println("Area of circle: "
                + circle.area());

        circle.moveTo(2, 4);
    }
}
