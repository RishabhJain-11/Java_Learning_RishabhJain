//package com.company;
//import java.util.Scanner;
//public class A10 {
//    public static void main(String[] args) {
//        Bicycle bc=new Bicycle();
//        bc.gearchange(2);
//        bc.speedup(5);
//        bc.applybrakes(2);
//        System.out.println("The State of Bicycle: ");
//        bc.print();
//        Bike b=new Bike();
//        b.gearchange(4);
//        b.speedup(41);
//        b.applybrakes(1);
//        System.out.println("The State of Bike: ");
//        b.print();
//        Car c=new Car();
//        c.gearchange(5);
//        c.speedup(51);
//        c.applybrakes(1);
//        System.out.println("The State of Car: ");
//        c.print();
//    }
//}
//
//
//interface Vehicles{
//    void gearchange(int a);
//    void speedup(int b);
//    void applybrakes(int c);
//}
//class Bicycle implements Vehicles{
//    int gearbc,speedbc;
//    public void gearchange(int gear){
//        gearbc=gear;
//    }
//
//    public void speedup(int speedup){
//        speedbc=speedbc+speedup;
//    }
//    public void applybrakes(int brake){
//        speedbc=speedbc-brake;
//    }
//    void print(){
//        System.out.println("Speed: "+speedbc+"\tGear: "+gearbc);
//    }
//}
//class Car implements Vehicles{
//    int gearc,speedc;
//    public void gearchange(int gear){
//        gearc=gear;
//    }
//    public void speedup(int speedup){
//        speedc=speedc+speedup;
//    }
//    public void applybrakes(int brake){
//        speedc=speedc-brake;
//    }
//    void print(){
//        System.out.println("Speed: "+speedc+"\tGear: "+gearc);
//    }
//
//    @Override
//    public void gearChange(int a) {
//
//    }
//
//    @Override
//    public void speedUp(int b) {
//
//    }
//
//    @Override
//    public void applyBreaks(int c) {
//
//    }
//}
//class Bike implements Vehicles{
//    int gearb,speedb;
//    public void gearchange(int gear){
//        gearb=gear;
//    }
//    public void speedup(int speedup){
//        speedb=speedb+speedup;
//    }
//    public void applybrakes(int brake){
//        speedb=speedb-brake;
//    }
//    void print(){
//        System.out.println("Speed: "+speedb+"\tGear: "+gearb);
//    }
//}