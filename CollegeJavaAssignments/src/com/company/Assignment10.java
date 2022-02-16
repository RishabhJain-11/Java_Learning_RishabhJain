//package com.company;
//
//import java.util.Scanner;
//
//abstract class Car_Factory{
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
////        System.out.print("Rough Budget(in Lakhs)- ");
////        budget=scan.nextDouble();
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
//
//    protected abstract void access();
//}
//class smallCar extends Car_Factory{
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
//class Sedan extends Car_Factory{
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
//class Luxury extends Car_Factory{
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
//public class Assignment10 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
////        int ch;
//
//        Car_Factory obj;
//        while (true) {
//
//            System.out.println("Which Car type  you want to See ?- ");
//            System.out.println("\nWe have these available car types which you want to choose\n\t1].Small Car\n\t2].Sedan Car\n\t3].Luxary Car");
//            System.out.println("Lets see which one will be best one for you !!!");
//            System.out.print("Enter your Budget Please ! = ");
//            int bud = scan.nextInt();
//
//            while (true) {
//                if (bud >= 2 && bud <= 6) {
//                    System.out.println("\n\nSmall Cars are suitable for your suggested Price Range !");
//                    obj = new smallCar();
//                    obj.input();
//                    obj.display(obj);
//
//                }
//                if (bud >= 6 && bud <= 10) {
//                    System.out.println("\n\nSmall Cars as well as Sedan Cars are suitable for your suggested Price Range !");
//                    int ch;
//                    System.out.println("\n\t1].Small Car\n\t 2].Sedan Car");
//                    ch = scan.nextInt();
//                    System.out.println("\n");
//                    if (ch == 1) {
//                        obj = new smallCar();
//                        obj.input();
//                        obj.display(obj);
//                    } else {
//                        obj = new Sedan();
//                        obj.input();
//                        obj.display(obj);
//                        break;
//                    }
//                }
//
//                if (bud >= 10 && bud <= 14) {
//                    System.out.println("\n\nSmall Cars,Sedan Cars as well as Luxury Cars are suitable for your suggested Price Range !");
//                    System.out.println("\n\t1].Small Car\n\t 2].Sedan Car\n\t3].Luxury Car");
//                    int ch;
//                    ch = scan.nextInt();
//                    System.out.println("\n");
//
//
//                    if (ch == 1) {
//                        obj = new smallCar();
//                        obj.input();
//                        obj.display(obj);
//                    } else if (ch == 2) {
//                        obj = new Sedan();
//                        obj.input();
//                        obj.display(obj);
//                        break;
//                    } else  {
//                        obj = new Luxury();
//                        obj.input();
//                        obj.display(obj);
//                        break;
//                    }
//
//                }
//            }
//        }
//    }
//}
