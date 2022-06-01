package com.practice.encapsulation;

class Demo{
    private String name;
    private int age;
    private int rollNumber;

    public String getName(){return name;}
    public int getAge(){return age;}
    public int getRollNumber(){return rollNumber;}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAllData(){
        return "name is "+name+" age is "+age+" roll Number "+rollNumber;
    }

}
public class Example {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.setName("Geeks");
        d.setAge(19);
        d.setRollNumber(1005);
        System.out.println(d.getAllData());
    }
}
