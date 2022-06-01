package com.practice.polymorphism;

class AA{
    public static int sum(int x,int y){
        return x+y;
    }
    public static int sum(int x,int y,int z){
        return x+y+z;
    }
    public static int sum(int x,int y,int z,int zz){
        return x+y+z+zz;
    }
}
class Demo{
    public void show(int x)
    {
        System.out.println("In int" + x);
    }
    public void show(String s)
    {
        System.out.println("In String" + s);
    }
    public void show(byte b)
    {
        System.out.println("In byte" + b);
    }
}
public class Overloading2 {
    public static void main(String[] args) {
        AA aa= new AA();
        int ans=aa.sum(3,3);
        System.out.println(ans);

        System.out.println(AA.sum(9,9,9,9));


        byte a = 25;
        Demo obj = new Demo();
        obj.show(a); // it will go to
        // byte argument
        obj.show("hello"); // String
        obj.show(250); // Int
        obj.show('A'); // Since char is
        // not available, so the datatype
        // higher than char in terms of
        // range is int.
        obj.show("A"); // String
    }
}
