package com.company;

import java.util.Scanner;

class Publication {
    String title;
    int price ,copies ,quantity;
     void saleCopy(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Publication Name : ");
         String Pub = sc.nextLine();
    };

    void setprice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title :");
        title = sc.nextLine();
        System.out.print("Enter the price :");
        price = sc.nextInt();
        System.out.print("Enter the copies :");
        copies = sc.nextInt();
    }
    void display(){
        System.out.println(title+"\t"+price+"\t"+copies);
    }

}

class Book extends Publication{
    String author;
    void saleCopy(){
        System.out.println("********");
        System.out.println("Book name :"+title);
        System.out.println("Author name :"+author);
        System.out.println("Price per book :"+price);
        System.out.println("Copies ordered :"+copies);
        System.out.println("\n *** Total sale  :  :"+(copies*price));

    }
    void setAuthor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Author Name :");
        author = sc.nextLine();
    }

    void orderQty(){
        System.out.println("Enter the quantity of the books :");
        Scanner sc=new Scanner(System.in);
        quantity=sc.nextInt();
    }
    void displayBook(){
        display();
        System.out.println("\t"+author);
    }
}

class Magazine extends Publication{
    String currIssue;

    void saleCopy(){
        System.out.println("********");
        System.out.println("Magazine name :"+title);
        System.out.println("Price per book :"+price);
        System.out.println("Copies ordered :"+copies);
        System.out.println("\n *** Total sale  :  :"+(copies+quantity)*price);
    }
    void issue(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the issue :");
        currIssue=sc.next();
    }

    void orderQty(){
        System.out.println("Enter the quantity of magazine :");
        Scanner sc = new Scanner(System.in);
        quantity=sc.nextInt();
    }

    void display_magazine(){
        display();
    }
    void receiveIssue(){
        System.out.println("You will receive magazine in :"+currIssue);

    }
}


public class Polymorphism {

    public static void main(String[] args) {

        Publication p = new Publication();
        p.saleCopy();

        Book b=new Book();
        b.setprice();
        b.setAuthor();
        b.orderQty();
        b.saleCopy();


        Magazine m = new Magazine();
        m.setprice();
        m.issue();
        m.receiveIssue();
        m.orderQty();
        m.saleCopy();



    }
}
