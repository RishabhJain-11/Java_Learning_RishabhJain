package com.company;
//#help
import java.util.Scanner;

interface Vehicles{
     void gearChange(int a);
     void speedUp(int b);
     void applyBreaks(int c);
}

class Bicycle implements  Vehicles{
    int speed;
    int gears;

    public void gearChange(int newGear){
        System.out.print("Enter the gears  in the bicycle :");
        Scanner in = new Scanner(System.in);
        int gears = in.nextInt();
        gears = newGear;
    }
    public void speedUp(int increment){
        System.out.print("Enter the speed  of the bicycle :");
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        speed = speed + increment;
    }
    public void applyBreaks(int decrement){
        speed = speed-decrement;
    }
    public void print(){
        System.out.println("Speed = "+speed+"\nGear = "+gears);
    }
}

class Bike implements  Vehicles{
    int speed;
    int gears;


    public void gearChange(int newGear){
        System.out.print("Enter the gear  in the bike :");
        Scanner in = new Scanner(System.in);
        int gears = in.nextInt();
        gears = newGear;
    }
    public void speedUp(int increment){
        System.out.print("Enter the speed  of the bike :");
        Scanner in = new Scanner(System.in);
        int speed1 = in.nextInt();
        speed1 = speed + increment;
    }
    public void applyBreaks(int decrement){
        speed = speed-decrement;
    }

    public void print(){
        System.out.println("Speed of bike = "+speed+"\nGear = "+gears);
    }
}


class Car implements  Vehicles{
    int speed1;
    int gears;


    public void gearChange(int newGear){
        System.out.print("Enter the gear  of the car :");
        Scanner in = new Scanner(System.in);
        int gears = in.nextInt();
        gears = newGear;

    }
    public void speedUp(int increment){
        System.out.print("Enter the speed  of the car :");
        Scanner in = new Scanner(System.in);
        int speed1 = in.nextInt();
        speed1 = speed1 + increment;
    }
    public void applyBreaks(int decrement){
        speed1 = speed1-decrement;
    }
    public void print(){
        System.out.println("Speed of the car = "+speed1+"\nGear = "+gears);
    }
}

public class Assignment5 {
    public static void main(String[] args) {


        Bicycle b = new Bicycle();
        System.out.println("For Bicycles --------------------");
        b.gearChange(b.gears);
        b.speedUp(b.speed);
        b.applyBreaks(10);
        b.print();

        Bike bi = new Bike();
        System.out.println("For Bikes ----------------");
        bi.gearChange(bi.gears);
        bi.speedUp(bi.speed);
        bi.applyBreaks(25);
        bi.print();

        Car c = new Car();
        System.out.println("For Cars ---------------------");
        c.gearChange(c.gears);
        c.speedUp(c.speed1);
        c.applyBreaks(35);
        c.print();

    }
}
