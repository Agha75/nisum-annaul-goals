package com.practice.keyWords;

public class EnumExample3 {

}
enum Color2 {
    RED,
    GREEN,
    BLUE;

    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
/*Every enum constant is always implicitly public static final. Since it is static, we can access it by using the enum Name. Since it is final, we can’t create child enums.
We can declare the main() method inside the enum. Hence we can invoke enum directly from the Command Prompt.*/


/*Enum and Inheritance:

All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, so an enum cannot extend anything else.
toString() method is overridden in java.lang.Enum class, which returns enum constant name.
enum can implement many interfaces.*/