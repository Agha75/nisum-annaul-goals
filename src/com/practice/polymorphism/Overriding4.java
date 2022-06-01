package com.practice.polymorphism;

class Employee{
    int base=10000;
    int salary(){
        return base;
    }
}

class Manager extends Employee{
    @Override
    int salary() {
        return super.salary()+20000;
    }
}
class Clerk extends Employee{
    int salary(){
        return base+10000;
    }
}
public class Overriding4 {
    public static void main(String[] args) {
        Employee e =new Employee();
        System.out.println(e.salary());

        Employee m =new Manager();
        System.out.println(m.salary());

        Employee c =new Clerk();
        System.out.println(c.salary());
    }
}
