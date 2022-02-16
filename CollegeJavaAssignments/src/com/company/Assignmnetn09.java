package com.company;

import java.util.Scanner;

class Customer{
    private String customerName;
    private int customerAge;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerAge(int customerAge){
        this.customerAge=customerAge;
    }
    public  int getCustomerAge(){
        return customerAge;
    }
}

abstract class Account{
    protected double balance ;
    protected int accountId;
    protected String accountType;   // here is account type
    protected Customer custObj;

    void setBalance(double balance){
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }

    void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    int getAccountId(){
        return accountId;
    }

    void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    String getAccountType(){//accounttype
        return accountType;
    }

    void setCustObj(Customer custObj) {
        this.custObj = custObj;
    }
    Customer getCustObj(){
        return custObj;
    }

    public abstract boolean withdraw(double amount);
}

class SavingAccount extends Account{
    private double minBalance;
    public void setMinBalance(double minBalance){
        this.minBalance = minBalance;
    }
    public double getMinBalance(){
        return minBalance;
    }

    public boolean withdraw(double amount){
        if((balance-amount)>minBalance){
            balance-=amount;
            return true;
        }
        else
            return false;
    }
}


class Bank{
    Scanner in = new Scanner(System.in);

    public SavingAccount a = new SavingAccount();
    public Customer c =new Customer();

    public SavingAccount createAccount(){
        in.nextLine();

        System.out.print("Enter your name = ");
        String customername = in.nextLine();
        c.setCustomerName(customername);

        System.out.print("Enter your age = ");
        int customerAge = in.nextInt();
        if(customerAge<18){
            do{
                System.out.println("Minimum age should be 18 to create a bank account !");
                customerAge = in.nextInt();
            }while(customerAge<18);
        }
        c.setCustomerAge(customerAge);

        a.setCustObj(c);
        System.out.print("Enter your account ID = ");
        int accountID = in.nextInt();
        a.setAccountId(accountID);


        System.out.print("Enter your account type = ");
        String accountype = in.next();
        a.setAccountType(accountype);


        System.out.print("\nEnter the balance  = ");
        double balance = in.nextDouble();
        a.setBalance(balance);

        System.out.print("Enter the minimum balance = ");
        double minbalance = in.nextDouble();
        a.setMinBalance(minbalance);

        return a;
    }
void getWithdrawAmount() {
    System.out.print("Enter the amount you want to withdraw = ");
    double amount = in.nextDouble();
    if (amount > 20000) {
        System.out.println("Withdrawal failed . Maximum limit of one withdrawal is Rs. 20000.");
    } else {
        if (a.withdraw(amount)) {
            System.out.println("Withdrawal successfully done . " + a.getBalance());
        } else {
            System.out.println("Sorry !! Not enough balance .");
        }
    }
}
    public void depositAmount(double amount){
        double bal = a.getBalance()+amount;
        a.setBalance(bal);
        System.out.println("Amount deposited successfully . Balance is = "+a.getBalance());
    }
    public void checkBalance(){
        System.out.println("Balance is = "+a.getBalance());
    }

    public void displayAccountInfo(){
        System.out.println("Welcome account holder :) "+c.getCustomerName()+" Following are your account details .");
        System.out.println("Age = "+c.getCustomerAge());
        System.out.println("Account ID = "+a.getAccountId());
        System.out.println("Account type = "+a.getAccountType());
        System.out.println("Account Balance = "+a.getBalance());
        System.out.println("Account Minimum Balance = "+a.getMinBalance());
    }

}

public class Assignmnetn09 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    SavingAccount a ;
    Bank bm = new Bank();

    do{
        System.out.println("\n\t1.Create Account\n\t2.Display Account\n\t3.Check Balance\n\t4.Deposit Amount\n\t5.Withdraw Amount\n\t6.Exit");
        System.out.print("Enter your choice = ");
        int choice = in.nextInt();
        System.out.println("");

        switch (choice) {
            case 1 -> {
                a = bm.createAccount();
                System.out.println("------------------------------------------------");
            }
            case 2 -> {
                bm.displayAccountInfo();
                System.out.println("------------------------------------------------");
            }
            case 3 -> {
                bm.checkBalance();
                System.out.println("------------------------------------------------");
            }
            case 4 -> {
                System.out.print("Enter the amount you deposit = ");
                double amt = in.nextDouble();
                bm.depositAmount(amt);
                System.out.println("------------------------------------------------");
            }
            case 5 -> {
                bm.getWithdrawAmount();
                System.out.println("------------------------------------------------");
            }
            case 6 -> {
                System.out.println("------------------------------------------------");
                return;
            }
            default -> {
                System.out.println("Invalid Input !");
                System.out.println("-------------------------------------------------");
            }
        }
    }while(true);


    }
}
