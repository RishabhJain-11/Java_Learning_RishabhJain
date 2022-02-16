package com.company;

import java.util.Scanner;

abstract class Shape{
    double a,b;
    Scanner in = new Scanner(System.in);
    void input(){
        System.out.print("\nEnter the first variable:");
        a=in.nextDouble();
        System.out.print("Enter the second variable:");
        b=in.nextDouble();
    }
    abstract public void compute_area();
}


class Triangle extends Shape{
    public void compute_area(){
        double area;
        area = (double)(a*b*0.5);
        System.out.printf("Area of Triangle =  %f",area);
    }
}
class Rectangle extends Shape{
    public void compute_area(){
        double area;
        area = a*b;
        System.out.printf("Area of Rectangle =  %f ",area);
    }
}

public class Assignmnet4 {
    public static void main(String[] args) {
        Shape s;
        Rectangle r = new Rectangle();
        s=r;
        System.out.print("Enter the dimensions for rectangle  : ");
        s.input();
        s.compute_area();


        Triangle t = new Triangle();
        s=t;
        System.out.println("\nEnter the dimensions for triangle  :");
        s.input();
        s.compute_area();
    }
}
