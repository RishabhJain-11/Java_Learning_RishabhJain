package com.company;

import java.util.Scanner;

//public class Inheritance {
    class employee{
        Scanner sc  = new Scanner(System.in);
        String name,add,mail;
        float id ,mobile,basic;

        void getdata(){
            System.out.print("Enter name of employee : ");
            name = sc.nextLine();
            System.out.print("Enter mail id of employee : ");
            mail = sc.nextLine();
            System.out.print("Enter address of the employee : ");
            add = sc.nextLine();
            System.out.print("Enter mobile number of employee : ");
            mobile = sc.nextInt();

        }

        void display(){
            System.out.println("\nEmp name :"+name);
            System.out.println("\nEmp mail id :"+mail);
            System.out.println("\nEmp address :"+add);
            System.out.println("\nEmp mobile number :"+mobile);
        }

        void salary(){
            float da , hra , cf , pf , gross;
            da=basic*97/100;
            hra=basic*10/100;
            pf=basic*12/100;
            cf=basic*0.1f/100;
            gross=basic+da+hra-pf-cf;
            System.out.println("Basic salary of employee : "+basic);
            System.out.println("Gross salary of employee :"+gross);

        }
    }

//    class Programmer extends emp {
//        float salary;
//        void getprogrammer(){
//            System.out.print("Enter the basic pay: ");
//            basic=sc.nextFloat();
//        }
//    }
//    class APM extends emp {
//        float salary;
//        void getass(){
//            System.out.print("Enter basic pay : ");
//            basic=sc.nextFloat();
//        }
//    }
//    class TeamLead extends emp {
//        float salary;
//        void getteam(){
//            System.out.println("Enter basic pay : ");
//            basic=sc.nextFloat();
//        }
//    }
//    class ProjectManager extends emp {
//        float salary;
//        void getmanager(){
//            System.out.println("Enter basic pay : ");
//            basic=sc.nextFloat();
//        }
//    }
    public class Inheritance{
        public static void main(String[] args) {
            int choice=0;
            do{
                System.out.println("Enter from the following : ");
                System.out.println("\n1)Programmer"+"\n2)Assistant Project Manager"+"\n3)Team Lead"+"\n4)Project Manager");
                Scanner c=new Scanner (System.in);
                System.out.print("Enter your choice: ");
                choice=c.nextInt();
                switch(choice){
                    case 1:
//                        Programmer p=new Programmer();
//                        p.getdata();
//                        p.getprogrammer();
//                        p.display();
//                        p.salary();
//                        break;
//                    case 2:
//                        APM ass=new APM();
//                        ass.getdata();
//                        ass.getass();
//                        ass.display();
//                        ass.salary();
//                        break;
//                    case 3:
//                        TeamLead tl=new TeamLead();
//                        tl.getdata();
//                        tl.getteam();
//                        tl.display();
//                        tl.salary();
//                    case 4:
//                        ProjectManager s=new ProjectManager();
//                        s.getdata();
//                        s.getmanager();
//                        s.display();
//                        s.salary();

//                    default:
//                        System.out.println("Enter correct choice number !");
                }
            }while(choice==1);
        }
    }


