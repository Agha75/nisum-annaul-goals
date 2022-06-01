package com.practice.keyWords;
enum Color5 {
    RED,
    GREEN,
    BLUE;

    // enum constructor called separately for each
    // constant
    private Color5()
    {
        System.out.println("Constructor called for : "
                + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}
public class EnumExample5 {
    public static void main(String[] args) {
        Color5 c1 = Color5.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}

/*enum and constructor:

enum can contain a constructor and it is executed separately for each enum constant at the time of enum class loading.
We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.*/
