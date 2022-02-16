package com.rishabh;

public class Main {

    public static void main(String[] args) {

         //if - else statements
        int salary = 25000;
        if(salary > 10000){
            salary += 2000;
        }
        else if (salary > 5000){
            salary += 1000;
        }
        else{
            salary += 500;
        }
        System.out.println(salary);

    }

}
