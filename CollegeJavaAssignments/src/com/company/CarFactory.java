//package com.company;
//
//import java.util.Scanner;
//
//abstract class Car_Factory{
//
//    String company,cn, col;
//    double budget;
//
//    abstract void getprice(double price);
//    abstract void detail(String company_nane, String car_name, String co);
//    abstract void access ();
//
//    void input (){
//
//        Scanner sc =new Scanner (System.in);
//        System.out.print("Company Name : ");
//        company = sc.next();
//        System.out.print("Car: ");
//        cn=sc.next();
//        System.out.print("Budget Planned (in lakhs): ");
//        budget = sc.nextDouble();
//        System.out.print ("Enter Color of Car : ");
//        col=sc.next();
//    }
//
//    void display(Car_Factory c2){
//        c2.getprice(budget);
//        c2.detail(company,cn,col);
//        c2.access();
//    }
//}
//class Hatchback extends Car_Factory{
//    String rep;
//    public void getprice(double price){
//        if(price<2)
//            System.out.println("your buget is insufficient, plz increase your Budget");
//        else if(price>2&&price<5)
//            rep = "No";
//        else
//            rep = "Yes";
//    }
//    public void detail(String company_name, String car_name, String Color) {
//        System.out.println("\n********");
//        System.out.println("Company: "+company_name);
//        System.out.println("Name of Car : "+car_name);
//        System.out.println("Color : "+ Color);
//        System.out.println("Fule Type : Petrol");
//        System.out.println("Gears : Manual");
//    }
//    public void access(){
//        System.out.println("Type of wheels : Alloy Wheels");
//        System.out.println("Airbags : "+rep);
//        System.out.println("Back Wiper : "+rep);
//        System.out.println("Side Mirror : Two");
//        System.out.println("Touch Screen Music Player : "+rep);
//    }
//}
//abstract class Sedan implements Car_Factory{
//    String rep;
//    public void getprice(double price){
//        if(price<2)
//            System.out.println("your buget is insufficient, plz increase your Budget");
//        else if(price>6&&price<10)
//            rep = "No";
//        else
//            rep = "Yes";
//    }
//    public void detail(String company_name, String car_name, String Col) {
//        System.out.println("\n********");
//        System.out.println("Company: "+company_name);
//        System.out.println("Name of Car : "+car_name);
//        System.out.println("Color : "+ Col);
//        System.out.println("Fule Type : Petrol/Diesel");
//        System.out.println("Gears :Automatic/ Manual");
//    }
//    public void access(){
//        System.out.println("Type of wheels : Alloy Wheels");
//        System.out.println("Airbags : YES");
//        System.out.println("Back Wiper : YES");
//        System.out.println("Side Mirror : Two");
//        System.out.println("Touch Screen Music Player : YES");
//        System.out.println("Roof Window : "+rep);
//    }
//}
// class Luxuray extends Car_Factory{
//    String rep;
//    public void getprice(double price){
//        if(price<2)
//            System.out.println("your Budget is insufficient, pla increase your Budget");
//        else if(price>10&&price<14)
//            rep = "No";
//        else
//            rep = "Yes";
//    }
//    public void detail(String company_name, String car_name, String col) {
//        System.out.println("\n********");
//        System.out.println("Company: "+company_name);
//        System.out.println("Name of Car : "+car_name);
//        System.out.println("Color : "+ col);
//        System.out.println("Fule Type : Diesel");
//        System.out.println("Gears : Automatic");
//    }
//    public void access(){
//        System.out.println("Type of wheels : Alloy Wheels");
//        System.out.println("Airbags : YES");
//        System.out.println("Back Wiper : YES");
//        System.out.println("Side Mirror : Two");
//        System.out.println("Touch Screen Music Player : YES");
//        System.out.println("Panoramic Sun-Roof : YES");
//        System.out.println("Automative Garbage Cans : "+rep);
//        System.out.println("Automotive Air Freshenar : "+rep);
//        System.out.println("Button Start : "+rep);
//    }
//}
//public class CarFactory{
//    public static void main(String[] args){
//        Scanner sc1 = new Scanner(System.in);
//        int ch;
//        Car_Factory c1;
//        do{
//            System.out.println("\n1. Hatchback \n2.Sedan Car \n3.Luxury Car \n4. EXIT");
//            System.out.println("Enter Your Choice : ");
//            ch = sc1.nextInt();
//            System.out.println();
//            switch(ch){
//                case 1:
//                    c1 = new Hatchback();
//                    c1.input();
//                    c1.display(c1);
//                    break;
//                case 2:
//                    c1 = new Sedan();
//                    c1.input();
//                    c1.display(c1);
//                    break;
//                case 3:
//                    c1 = new Luxuray();
//                    c1.input();
//                    c1.display(c1);
//                    break;
//                case 4:
//                    System.out.println("\nThank You ");
//                    break;
//                default:
//                    System.out.println("INVALID CHOICE !!");
//                    break;
//            }
//        }while(ch!=4);
//    }
//}
