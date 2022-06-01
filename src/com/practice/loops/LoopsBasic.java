package com.practice.loops;

import java.util.ArrayList;

public class LoopsBasic {
    public static void main(String[] args) {
        // LoopsBasic.whileLoop();
        // LoopsBasic.forOfLoop();
        // LoopsBasic.doWhile();
        // LoopsBasic.infiniteLoop();
        LoopsBasic.infiniteLoop2();
    }
    public static void infiniteLoop2(){
//        ArrayList<Integer> arr=new ArrayList<>();
//        for (int i = 0; i < Integer.MAX_VALUE; i++)
//        {
//            System.out.println(arr.add(i));
//        }


    }

    public static void infiniteLoop(){
        for (int i=5; i!=0; i-=1){
            System.out.println(i);
        }

    }
    public static void forOfLoop(){
        //used only for iteration
        String arr[]={"hi","hello","hey"};
        for (String a:arr){
            System.out.println(a);
        }
    }

    public static void whileLoop(){
        int a=1;
        while (a<=4){
            System.out.println("*** "+a);
            a++;
        }
    }
    public static void doWhile(){
        int a=20;
        do {
            System.out.println("value of "+a);
            a++;
        }while (a<25);
    }
    public static void doWhile2(){
        int x = 12, sum = 0;

        do {
            sum += x;
            x--;

        } while (x > 10);
        System.out.println("Summation: " + sum);
    }
}
