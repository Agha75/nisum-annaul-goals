package com.practice.inheritance;

interface one {
    public void print_geekOne();
}

interface two {
    public void print_for();
}

interface three extends one, two {
    public void print_geekOne();
    public void print_geekThree();

}

class child implements three{

    @Override
    public void print_for() {
        System.out.println("Print for");
    }

    @Override
    public void print_geekOne() {
        System.out.println("GeekOne");
    }

    @Override
    public void print_geekThree() {
        System.out.println("GeekThree");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        child c = new child();
        c.print_geekOne();
        c.print_for();
        c.print_geekOne();
    }
}
