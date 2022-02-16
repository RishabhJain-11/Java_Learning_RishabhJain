package com.company;
//
//import java.util.Scanner;
//
//abstract class Car_Factory1{
//    String compnay,car_name;
//    double budget;
//
//
//    abstract void getprice(double price);
//    abstract void detail(String company_name,String car_name);
//    abstract void accessories();
//
//    void input() {
//        Scanner scan =new Scanner (System.in);
//        System.out.print("Company- ");
//        compnay=scan.next();
//        System.out.print("Car- ");
//        car_name=scan.next();
//        System.out.print("Rough Budget(in Lakhs)- ");
//        budget=scan.nextDouble();
//    }
//    void display(Car_Factory obj1) {
//
//        obj1.getprice(budget);
//        System.out.println("\n-----------------------------------");
//        obj1.detail(compnay, car_name);
//        System.out.println("\n-----------------------------------");
//        obj1.accessories();
//        System.out.println("\n-----------------------------------");
//    }
//}
//class smallCar1 extends Car_Factory{
//    String Ans;
//
//    public void getprice(double price) {
//        if(price>2&&price<5)
//            Ans="No";
//        else
//            Ans="Yes";
//
//    }
//
//    public void detail(String company_name,String car_name) {
//        System.out.println("Company- "+company_name);
//        System.out.println("Name of Car- "+car_name);
//        System.out.println("Color- Black/White/Orange/Red");
//        System.out.println("Fuel- Petrol");
//        System.out.println("Gears- Manual");
//    }
//
//    //method to display accessories of car//
//    public void accessories() {
//        System.out.println("Types of Tyres- Alloy Wheels");
//        System.out.println("Airbags- "+Ans);
//        System.out.println("Back Wiper- "+Ans);
//        System.out.println("Side Mirror- Two");
//        System.out.println("Touch Screen Music Player- "+Ans);
//    }
//}
//
//class Sedan1 extends Car_Factory{
//    String Ans;
//
//
//    public void getprice(double price) {
//        if(price>6&&price<10)
//            Ans="No";
//        else
//            Ans="Yes";
//    }
//
//
//    public void detail(String company_name,String car_name) {
//        System.out.println("Company- "+company_name);
//        System.out.println("Name of Car- "+car_name);
//        System.out.println("Color- Black/White/Orange/Red");
//        System.out.println("Fuel- Petrol/Diesel");
//        System.out.println("Gears- Auto/Manual");
//    }
//
//    public void accessories() {
//        System.out.println("Types of Tyres- Alloy Wheels");
//        System.out.println("Airbags- YES");
//        System.out.println("Back Wiper- YES");
//        System.out.println("Side Mirror- Two");
//        System.out.println("Touch Screen Music Player- YES");
//        System.out.println("Roof Window- "+Ans);
//    }
//}
//
//class Luxury1 extends Car_Factory{
//    String Ans;
//
//
//    public void getprice(double price) {
//        if(price>10&&price<14)
//            Ans="No";
//        else
//            Ans="Yes";
//    }
//
//
//    public void detail(String company_name,String car_name) {
//        System.out.println("Company- "+company_name);
//        System.out.println("Name of Car- "+car_name);
//        System.out.println("Color- Black/White/Orange/Red");
//        System.out.println("Fuel- Diesel");
//        System.out.println("Gears- Auto");
//    }
//
//
//    public void accessories() {
//        System.out.println("Types of Tyres- Alloy Wheels");
//        System.out.println("Airbags- YES");
//        System.out.println("Back Wiper- YES");
//        System.out.println("Side Mirror- Two");
//        System.out.println("Touch Screen Music Player- YES");
//        System.out.println("Roof Window- YES");
//        System.out.println("Automotive Garbage Cans- "+Ans);
//        System.out.println("Automotice Air Freshner- "+Ans);
//        System.out.println("Button Start- "+Ans);
//    }
//}
//
//public class Assignmewnt10 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int ch;
//
//        Car_Factory obj;
//        while(true){
//
//            System.out.print("Please Mention Your Budget : ");
//            int bud = scan.nextInt();
//            System.out.println("\n\t1](Budget -- 2 lakh to 5 lakh Rs)\n\t2].(Budget -- 6 lakh to 10 lakh Rs)\n\t3].(Budget -- 10 lakh to 15 lakh Rs)\n\t4].Exit");
//            ch=scan.nextInt();
//            System.out.println();
//
//            switch (ch) {
//                case 1 -> {
//                    System.out.println("Have your choice amongst the two :");
//                    if(bud>=2 && bud <= 5) {
//                        obj = new smallCar1();
//                        obj.input();
//                        obj.display(obj);
//                    }
//                    obj = new Sedan1();
//                    obj.input();
//                    obj.display(obj);
//                }
//                case 2 -> {
//                    obj = new Sedan1();
//                    obj.input();
//                    obj.display(obj);
//                }
//                case 3 -> {
//                    obj = new Luxury1();
//                    obj.input();
//                    obj.display(obj);
//                }
//                case 4 -> {
//                    System.out.println("\n-----------------------------------");
//                    return;
//                }
//                default -> {
//                    System.out.println("INVALID CHOICE !!");//default
//                    System.out.println("\n-----------------------------------");
//                }
//            }
//        }
//    }
//}
//
//
///*
//
//public class Assignmewnt10 {
//
//}*/
//
////
////            ch=scan.nextInt();
////            System.out.println();
////
////            switch (ch) {
////                case 1 -> {
////                    obj = new smallCar();
////                    obj.input();
////                    obj.display(obj);
////                }
////                case 2 -> {
////                    obj = new Sedan();
////                    obj.input();
////                    obj.display(obj);
////                }
////                case 3 -> {
////                    obj = new Luxury();
////                    obj.input();
////                    obj.display(obj);
////                }
////                case 4 -> {
////                    System.out.println("\n-----------------------------------");
////                    return;
////                }
////                default -> {
////                    System.out.println("INVALID CHOICE !!");//default
////                    System.out.println("\n-----------------------------------");
////                }
////            }

import java.util.Scanner;
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
//public class Assignmewnt10 {
//    public static void main(String[] args){
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