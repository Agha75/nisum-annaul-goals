package com.practice.keyWords;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
public class EnumExample2 {
    Day day;

    // Constructor
    public EnumExample2(Day day) { this.day = day; }

    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    public static void main(String[] args) {
        String str = "MONDAY";
        EnumExample2 t1 = new EnumExample2(Day.valueOf(str));
        t1.dayIsLike();

    }
}
