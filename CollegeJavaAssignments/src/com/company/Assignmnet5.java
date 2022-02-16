package com.company;

interface Vehicles1{
    void gearC(int a);
    void speedU(int b);
    void ApplyB(int c);
}

class Bicycles implements Vehicles1{
    int speed ;
    int gear ;
     public void gearC(int newGear){
         gear = newGear;

     }

     public void speedU(int increm){
         speed =  speed + increm;

     }
     public void ApplyB(int decrem){
         speed = speed - decrem;
     }

     public void print(){
         System.out.println("Speed = "+speed+"\n Gear = "+gear);
     }
}


class Biker implements Vehicles1{
    int speed ;
    int gear ;
    public void gearC(int newGear){
        gear = newGear;

    }

    public void speedU(int increm){
        speed =  speed + increm;

    }
    public void ApplyB(int decrem){
        speed = speed - decrem;
    }

    public void print(){
        System.out.println("Speed = "+speed+"\n Gear = "+gear);
    }
}


class Cars implements Vehicles1{
    int speed ;
    int gear ;
    public void gearC(int newGear){
        gear = newGear;

    }

    public void speedU(int increm){
        speed =  speed + increm;

    }
    public void ApplyB(int decrem){
        speed = speed - decrem;
    }

    public void print(){
        System.out.println("Speed = "+speed+"\n Gear = "+gear);
    }
}

public class Assignmnet5 {

    public static void main(String[] args) {
        Bicycles bs = new Bicycles();
        bs.gearC(5);
        bs.speedU(15);
        bs.ApplyB(5);
        System.out.println("The bicycle is at = ");
        bs.print();


        Biker bi = new Biker();
        bi.gearC(5);
        bi.speedU(45);
        bi.ApplyB(15);
        System.out.println("The bike is at = ");
        bi.print();


        Cars ca = new Cars();
        ca.gearC(5);
        ca.speedU(65);
        ca.ApplyB(10);
        System.out.println("The car is at = ");
        ca.print();



    }
}
