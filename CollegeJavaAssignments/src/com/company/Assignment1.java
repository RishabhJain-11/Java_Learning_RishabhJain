package com.company;
import java.util.Scanner;

class Assignment1 {
    public static void main(String[] args) {
        int ch = 0;
        float num1, num2, answer;
        Complex cal = new Complex();
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("\n1.Addition");
            System.out.println("\n2.Subtraction");
            System.out.println("\n3.Multiplication");
            System.out.println("\n4.Division");
            System.out.println("\n5.Exit");
            System.out.print("\nEnter the choice --> ");
            ch = input.nextInt();
            if(ch>0 && ch <5) {
                System.out.print("\nEnter the first Number\n");
                System.out.print("Real Number :");
                num1 = input.nextInt();
                System.out.print("Imaginary Number : ");
                num2 = input.nextInt();
                Complex First = new Complex(num1, num2);

                System.out.print("\nEnter the Second Number\n");
                System.out.print("Real Number : ");
                num1 = input.nextInt();
                System.out.print("Imaginary Number :");
                num2 = input.nextInt();
                Complex Second = new Complex(num1, num2);


                switch (ch) {
                    case 1 -> cal.Addition(First, Second);
                    case 2 -> cal.Subtraction(First, Second);
                    case 3 -> cal.Multiplication(First, Second);
                    case 4 -> cal.Division(First, Second);
                    default -> System.out.println("\n Your Choice of operation is not available , Try another operation !");
                }
            }

            else{
               System.out.println("\nYou Have Chosen to exit !!! \n\n");
            break;
            }

        }while (!(ch == 5)) ;
    }
}

class Complex
{
    private float real,img;
    Complex()
    {
        real=0;
        img=0;
    }
    Complex(float Comp1,float Comp2)
    {
        real=Comp1;
        img=Comp2;
    }
    void   CollectNumbers(){

    }
    void  Addition(Complex C1,Complex C2)
    {
        float real,img;
        this.real = (C1.real + C2.real);
        this.img = (C1.img + C2.img);
        System.out.println("\nThe Addition of the two numbers is =  "+this.real+" + "+this.img+" i\n" );
    }
    void Subtraction(Complex C1,Complex C2)
    {
        float real,img;
        this.real = (C1.real - C2.real);
        this.img = (C1.img - C2.img);
        System.out.println("\nThe Subtraction of the numbers is = "+this.real+" + "+this.img+" i\n" );
    }
    void Multiplication(Complex C1,Complex C2)
    {
        float real,img;
        this.real = (C1.real*C2.real) - (C1.img*C2.img);
        this.img = (C1.real*C2.img) + (C2.real*C1.img);
        System.out.println("\nThe Multiplication of the two numbers is = "+this.real+" + "+this.img+" i\n" );
    }
    void Division(Complex C1,Complex C2)
    {
        float real,img,denominator;
        denominator = (C2.real*C2.real) + (C2.img*C2.img);
        this.real = ((C1.real*C2.real) + (C1.img*C2.img))/denominator;
        this.img = ((C2.real*C1.img) - (C1.real*C2.img))/denominator;
        System.out.println("\nThe Division of the two numbers is =  "+this.real+" + "+this.img+" i\n" );
    }
}

