package com.company;

import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("\n1) PROGRAMMER"+"\n2) ASSISTANT PROJECT MANAGER"+"\n3) TEAM LEADER"+"\n4) PROJECT MANAGER\n"+"5) EXIT\n");
            Scanner c=new Scanner (System.in);
            System.out.print("Enter your choice: ");
            choice=c.nextInt();
            switch(choice){
                case 1:
                    Programmer p=new Programmer();
                    p.getdata();
                    p.input();
                    p.display();
                    p.salary();
                    break;
                case 2:
                    APM a=new APM();
                    a.getdata();
                    a.input();
                    a.display();
                    a.salary();
                    break;
                case 3:
                    TeamLead t=new TeamLead();
                    t.getdata();
                    t.input();
                    t.display();
                    t.salary();
                    break;
                case 4:
                    ProjectManager s=new ProjectManager();
                    s.getdata();
                    s.input();
                    s.display();
                    s.salary();
                    break;
            }
        }while(choice!=5);
        System.out.println("- - - EXITED - - -");
    }
}
class emp {
    Scanner sc = new Scanner(System.in);
    String name, add, mail;
    float id,  basic;
    long mobile;

    void getdata() {
        System.out.print("Enter the name of employee:");
        name = sc.nextLine();
        System.out.print("Enter employee MailID: ");
        mail = sc.next();
        System.out.print("Enter employee address: ");
        add = sc.next();
        System.out.print("Enter employee mobile no: ");
        mobile = sc.nextLong();
    }
    void input(){
        System.out.print("Enter the basic pay: ");
        basic=sc.nextFloat();
    }

    void display() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Name           : "+name);
        System.out.println("MailID         : "+mail);
        System.out.println("Address        : "+add);
        System.out.println("Mobile no    : "+mobile);
    }
    void salary(){
        float da,hra,cf,pf,gross;
        da=basic*97/100;
        hra=basic*10/100;
        pf=basic*12/100;
        cf=basic*0.1f/100;
        gross=basic+da+hra-pf-cf;
        System.out.println("Basic salary :"+basic);
        System.out.println("Gross salary of an employee    :"+gross);
    }
}
class Programmer extends emp {

}
class APM extends emp {

}
class TeamLead extends emp {

}
class ProjectManager extends emp {

}
