package com.javaooplpractical;
/*
Name:Rishabh Jain
Roll No: SEITA047
 */
/*
4.Dynamic Binding
Design a base class shape with double type values and member functions to input the data and
compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated
area. Implement dynamic binding for given case study.
 */

import java.util.Scanner;
abstract class Shape{//created an abstract class shape
    double a,b;//initialized the variables
    Scanner in = new Scanner(System.in);
    void input(){//method to take dimensions as input from user
        System.out.print("\nEnter the first variable:");
        a=in.nextDouble();//take variable 1 from the user.
        System.out.print("Enter the second variable:");
        b=in.nextDouble();//take variable 2 from the user.
    }
    abstract public void compute_area();//abstract method to calculate area
}


class Triangle extends Shape{
    public void compute_area(){//overriding the abstract compute_method for triangle
        double area;//initializing the area function.
        area = (a*b*0.5);//computing the area for the triangle
        System.out.printf("\nArea of Triangle =  %f",area);//printing the area of the triangle
        System.out.println("\n-------------------------------------------------------------");
    }
}


class Rectangle extends Shape{
    public void compute_area(){//overriding the abstract compute_method for rectangle
        double area;//initializing the area function.
        area = a*b;//computing the area for the rectangle
        System.out.printf("\nArea of Rectangle =  %f ",area);//printing the area of the rectangle
        System.out.println("\n-------------------------------------------------------------");
    }
}


public class Main {

    public static void main(String[] args) {//main method
        //reference variable of super class Shape
        Shape s = new Rectangle();
        /*
        here the dynamic binding concept of java is being used as both rectangle and triangle have the same instance,
        so it gets decided at compile time, and it will call the compute_area of rectangle.
        */
        System.out.print("\nEnter the dimensions to calculate the area of the rectangle ");
        s.input();
        s.compute_area();


        s = new Triangle();
        System.out.println("\nEnter the dimensions to calculate the area of the triangle  :");
        s.input();
        s.compute_area();
    }
}