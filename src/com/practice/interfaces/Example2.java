package com.practice.interfaces;

interface Vehicle {
    void speed(int a);
    void gear(int a);
    void brake(int a);
}
class Bike implements Vehicle{

    int speed;
    int brake;
    int gear;
    @Override
    public void speed(int increment) {
        this.speed=increment;
    }

    @Override
    public void gear(int gearAt) {
        this.gear=gearAt;
    }

    @Override
    public void brake(int decrement) {
        this.brake=decrement;

    }

    public void allStatus(){
        System.out.println("speed is "+speed+" gear is "+brake+" gear is"+gear);
    }
}

class Bicycle implements Vehicle {

    int speed;
    int gear;

    // to change gear
    @Override
    public void gear(int newGear){

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speed(int increment){

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void brake(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}
public class Example2 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.gear(1);
        bike.speed(40);
        bike.brake(3);

        System.out.println("Bike present state :");
        bike.allStatus();

        Bicycle bicycle = new Bicycle();
        bicycle.gear(2);
        bicycle.speed(3);
        bicycle.brake(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

    }
}
