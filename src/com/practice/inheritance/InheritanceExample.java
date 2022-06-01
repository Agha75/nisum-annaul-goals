package com.practice.inheritance;

class Bicycle{
    public int speed;
    int gear;
    Bicycle(int speed,int gear){
        this.gear=gear;
        this.speed=speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void applySpeed(int increment ){
        speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}

class MountainBike extends Bicycle{
    int seatHeight;
    MountainBike(int seatHeight, int speed, int gear){
        super(speed, gear);
        this.seatHeight=seatHeight;
    }

    public void setSeatHeight(int newValue){
        seatHeight =newValue;
    }

    @Override
    public String toString() {
        return super.toString()+"MountainBike{" +
                "seatHeight=" + seatHeight +
                '}';
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        MountainBike m=new MountainBike(10,50,3);
        System.out.println(m);

        m.setSeatHeight(20);
        m.applyBrake(10);
        System.out.println(m);

        MountainBike n=new MountainBike(30, 60,5);
        System.out.println(n);

    }
}
