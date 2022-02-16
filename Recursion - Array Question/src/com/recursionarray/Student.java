package com.recursionarray;

import java.util.Scanner;
class all{
    abstract class paint_cost {
        public static void cost_input() {
//            int i, m = 0, flag = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the cost of the paint per sq m :");
            int n = in.nextInt();
            }
    }
}

class Shapes {
    public void area(){
        System.out.println("the formula for the area of ");
    }
}

class Triangle extends Shapes{
    public void area(){
        System.out.println("Triangle is 0.5 * base * height = ");
    }
}

class Circle extends Shapes{
    public void area(){
        System.out.println("Circle is 3.14 * radius * radius = ");
    }
}



    /*
    class Triangle extends paint_cost{
            public void area(){

            }
     */
public class Student {
    public static void main(String[] args) {
        Shapes myShape = new Shapes();  // Create a Shapes object
        Shapes myTriangle = new Triangle();  // Create a Triangle object
        Shapes myCircle = new Circle();  // Create a Circle object
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
    }
}
