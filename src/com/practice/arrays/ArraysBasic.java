package com.practice.arrays;


public class ArraysBasic {
    public int roll_no;
    public int age;
    ArraysBasic(int roll_no, int age){
        this.roll_no = roll_no;
        this.age = age;
    }
    public static void main(String[] args) {
       // ArraysBasic.basicArray();
        ArraysBasic.example2();
    }
    public static void example2(){
        ArraysBasic arr[] = new ArraysBasic[3];
        arr[0] = new ArraysBasic(1,10);
        arr[1] = new ArraysBasic(2,20);
        arr[2] = new ArraysBasic(3,30);

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i].roll_no +"   "+ arr[i].age);
        }
    }

    public static void basicArray(){
        int newArray[]= new int[5];
        newArray[0]=1;
        newArray[1]=2;
        newArray[2]=3;
        newArray[3]=4;
        newArray[4]=5;
        for (int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
}
