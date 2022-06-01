package com.practice.interfaces;

class Abc implements Cloneable
{
    int i;
    String s;

    // A class constructor
    public Abc(int i,String s)
    {
        this.i = i;
        this.s = s;
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class CloneableInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        Abc a = new Abc(20, "GeeksForGeeks");

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        Abc b = (Abc)a.clone();

        System.out.println(b.i);
        System.out.println(b.s);
    }
}
