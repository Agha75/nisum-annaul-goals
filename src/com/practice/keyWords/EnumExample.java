package com.practice.keyWords;

enum Color{
    RED,
    GREEN,
    BLUE;
}
public class EnumExample {
    enum MoreColor{
        Yellow,
        black,
        white

    }
    public static void main(String[] args) {
        Color c=Color.RED;
        System.out.println(c);

        MoreColor moreColor=MoreColor.black;
        System.out.println(moreColor);

    }
}
  /*  The first line inside the enum should be a list of constants and then other things like methods, variables, and constructors.
        According to Java naming conventions, it is recommended that we name constant with all capital letters*/
