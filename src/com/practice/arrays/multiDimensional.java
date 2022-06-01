package com.practice.arrays;

public class multiDimensional {

    public static void main(String[] args) {
        // multiDimensional.multiArray();

        int arr[] = {1, 2, 3, 4};
        // passArrayInMethods(arr);

        // int array1[]=returnArrayFromMethod();
        // for (int i=0; i < array1.length ; i++)
        // System.out.print(arr[i] + " ");


        // cloneArray();


    }

    public static void cloneArray() {
        int arr[] = {1, 2, 3, 4, 5};
        int cloneArr[] = arr.clone();
        for (int i = 0; i < cloneArr.length; i++) {
            System.out.print(cloneArr[i]);
        }
    }

    public static int[] returnArrayFromMethod() {
        return new int[]{1, 2, 3};
    }

    public static void passArrayInMethods(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }


    public static void multiArray() {
        int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
