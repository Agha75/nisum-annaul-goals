package com.practice.keyWords;

enum Color4 {
    RED,
    GREEN,
    BLUE;
}
public class EnumExample4 {
    public static void main(String[] args) {
        // Calling values()
        Color4 arr[] = Color4.values();

        // enum with loop
        for (Color4 col : arr) {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                    + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}
