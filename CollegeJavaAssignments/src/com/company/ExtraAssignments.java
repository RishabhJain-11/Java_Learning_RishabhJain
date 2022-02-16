package com.company;
/*
import java.util.Scanner;

class Pallindrome1 extends ExtraAssignments{
    int r,sum=0;
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();

    int temp=n;
        while(n>0){
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
        if(temp==sum)
            System.out.println("It is a palindrome number ");
        else
                System.out.println("It is not a palindrome");

}
class Pallindrome2 extends ExtraAssignments {
    String original, reverse = "";
//    Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome");
    original = in.nextLine();

        for ( int i = length - 1; i >= 0; i-- )
    reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
                System.out.println("Entered string isn't a palindrome.");

}
abstract class PrimeExample2{
    static void checkPrime(int n){
        int i,m=0,flag=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }
}
public class ExtraAssignments {
    public static void main(String[] args) {
        int choice=0;
        do{
            System.out.println("Enter from the following : ");
            System.out.println("\n1)Pallindrome - Number"+"\n2)Pallindrome - String"+"\n3)Prime NUmber or not");
            Scanner c=new Scanner (System.in);
            System.out.print("Enter your choice: ");
            choice=c.nextInt();
            switch(choice){
                case 1:
                    Pallindrome1 p=new Pallindrome1();

                    break;
                case 2:
                    APM ass=new APM();

                    break;
                case 3:
//                    PrimeExample2 pr=new PrimeExample2(n);
                    PrimeExample2.checkPrime();


                default:
                        System.out.println("Enter correct choice number !");
            }
        }while(choice==1);
    }



}
*/

