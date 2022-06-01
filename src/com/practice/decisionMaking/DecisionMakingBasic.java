package com.practice.decisionMaking;

public class DecisionMakingBasic {
    public static void main(String[] args) {
        DecisionMakingBasic d = new DecisionMakingBasic();
        // d.simpleDecision();
        // DecisionMakingBasic.nestedDecisions();
        // DecisionMakingBasic.switchCase();
        // DecisionMakingBasic.breakLoop();
        // DecisionMakingBasic.breakLoop2();
        // DecisionMakingBasic.continueDemo();
        // DecisionMakingBasic.continueDemo();
        // DecisionMakingBasic.returnDemo();
        // DecisionMakingBasic.exampleOne();
    }
    public static void exampleOne(){
        String str = "Welcome Agha";
        int a=4;
        if (a==4){
            a++;
            System.out.println(a);
            if (a==5){
                System.out.println(str);
            }
        }

        if (str == "Welcome"){
            System.out.println("Hello");
        }else {
            System.out.println("Hey");
        }

    }
    public static void returnDemo(){
        boolean a= true;
        System.out.println("before condition");
        if (a)
            return;
            System.out.println("after condition");

    }
    public static void continueDemo(){
        for (int i=1; i<=10; i++){
            if (i%2==0)
                continue;
                System.out.println(i+" = *******");
        }
    }
    public static void breakLoop2()
    {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break statement");
                    if (t)
                        break third;
                    System.out.println("This won't execute. 3");
                }
                System.out.println("This won't execute. 2");
            }
            System.out.println("This is after second block. 1");
        }
    }
    public static void breakLoop(){
        for (int i=1; i<10; i++){
            System.out.println(i);
            if (i==5){
                break;
            }
        }
    }

    public void simpleDecision() {
        int a = 10;
        int b = 11;
        if (a < 10 || b > 10) {
            System.out.println("a=" + a + " is smaller or equal to 10");
        } else {
            System.out.println("a=" + a + " is greater than 10");
        }
    }

    public static void nestedDecisions() {
        int a = 59;
        if (a == 10) {
            if (a <= 10) {
                System.out.println("a=" + a + " is smaller or equal to 10");
            } else {
                System.out.println("a=" + a + " is greater than 10");
            }
        } else if (a != 10) {
            if (a > 50) {
                System.out.println("a=" + a + " is greater than 50");
            } else if (a < 50) {
                System.out.println("a=" + a + " is smaller than 50");
            }
        }
    }

    public static void switchCase() {
        int i = 3;
        switch (i) {
            case 0:
                System.out.println("i is zero");
                break;


            case 1:
                System.out.println("i is one");
                break;


            case 2:
                System.out.println("i is two");
                break;


            case 3:
                System.out.println("i is three");
                break;


        }

    }
}