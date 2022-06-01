package com.practice.inheritance;

class One{
    int age;
    One(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "One{" +
                "age=" + age +
                '}';
    }
}
class Two extends One{
    String name;
    Two(int age, String name) {
        super(age);
        this.name=name;
    }

    @Override
    public String toString() {
        return "age " +age+" "+
                "name='" + name + '\'' ;
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Two t=new Two(15,"user123");
        System.out.println(t.toString());
    }
}
