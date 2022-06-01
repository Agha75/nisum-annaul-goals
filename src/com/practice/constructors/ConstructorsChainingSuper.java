package com.practice.constructors;

public class ConstructorsChainingSuper {
    {
        //This is init block. init block is always executed before constructor
        System.out.println("init executed base");
    }
    String name;
    ConstructorsChainingSuper(){
        System.out.println("no args super base");
    }
    ConstructorsChainingSuper(String name){
        this.name = name;
        System.out.println("parametrized called base");
    }
}
class Derived extends ConstructorsChainingSuper{
    {
        //This is init block. init block is always executed before constructor
        System.out.println("init executed derived");
    }
    Derived(){
        System.out.println("no args super derived");
    }
    Derived(String name){
        super(name);
        System.out.println("parametrized called derived === "+name);
    }
    public static void main(String[] args) {
        Derived d=new Derived("Agha");

    }
}