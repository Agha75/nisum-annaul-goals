package com.practice.inheritance;

class User{
    int age;
    User(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "One{" +
                "age=" + age +
                '}';
    }
}
class UserTwo extends User{
    String name;
    UserTwo(int age, String name) {
        super(age);
        this.name=name;
    }

    @Override
    public String toString() {
        return "age " +age+" "+
                "name='" + name + '\'' ;
    }
}

class UserThree extends UserTwo{
    int className;
    UserThree(int age, String name, int className) {
        super(age, name);
        this.className=className;
    }

    @Override
    public String toString() {
        return "age :" + age+ " name: "+name+
                " className :" + className;
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        UserThree u=new UserThree(15,"testUser",8);
        System.out.println(u);

        UserTwo userTwo=new UserTwo(10,"testUserTwo");
        System.out.println(userTwo);
    }
}
