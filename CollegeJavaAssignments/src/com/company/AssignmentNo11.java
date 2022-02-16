package com.company;
import java.util.Scanner;

interface PaymentProcessor {
	  void pay(int amount);
}

class CreditCard implements PaymentProcessor {
	  Scanner sc =new Scanner (System.in);
	  String name,ExpDate;
	  double CardNo;

	  CreditCard(){
		  super();
		  System.out.println("----------------------------------------------------------");
		  System.out.print("\tCard holder Name :: ");
		  this.name =sc.next();
		  System.out.print("\tCard Number :: ");
		  this.CardNo =sc.nextDouble();
		  System.out.print("\tCard Expiry Date :: ");
		  this.ExpDate =sc.next();
		  System.out.println("----------------------------------------------------------");
	  }

	  @Override
	  public void pay(int amount) {
		  System.out.println("----------------------------------------------------------");
	      System.out.println("Paying through Credit Card payment: Charging $" + amount);
	      System.out.println("----------------------------------------------------------");
	  }
}

class PayPal implements PaymentProcessor {

	PayPal(){
		super();
		System.out.println("\nChecking Internet Connection........");
	   }

	@Override
	 public void pay(int amount) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Paying through PayPal payment: Charging $" + amount);
		System.out.println("----------------------------------------------------------");
	  }
	}

class BitCoin implements PaymentProcessor {
	Scanner sc =new Scanner (System.in);
	String add;

	BitCoin(){
		   super();
		   System.out.print("\nEnter Transaction 'Input Address' :: ");
		   add= sc.next();
	   }

	@Override
	public void pay(int amount) {
		  System.out.println("----------------------------------------------------------");
		    System.out.println("Paying through BitCoin payment: Charging $" + amount);
		    System.out.println("----------------------------------------------------------");
	  }
}

class Order {

	private final PaymentProcessor paymentProcessor;
	private final int amount;

	public Order(int amount, PaymentProcessor paymentProcessor) {
	     this.amount = amount;
	     this.paymentProcessor = paymentProcessor;
	   }

	public void process() {
	     paymentProcessor.pay(amount);
	   }
}

public class AssignmentNo11 {
	public static void main(String[] args) {
		int c,amt=0;
		Order order;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("**** SHOPPING CART ****");
			System.out.print("1.Credit Card \n2.PayPal \n3.BitCoin \n4.Exit");
			System.out.print("\n\nEnter your Choice ::");
			c=sc.nextInt();
			System.out.println("----------------------------------------------------------");
			if(c==1||c==2||c==3) {
				 System.out.print("\nEnter the amount to be Transfer :: ");
				 amt = sc.nextInt();
				 System.out.println("----------------------------------------------------------");
			}
			switch (c) {
				case 1 -> {
					order = new Order(amt, new CreditCard());
					order.process();
				}
				case 2 -> {
					order = new Order(amt, new PayPal());
					order.process();
				}
				case 3 -> {
					order = new Order(amt, new BitCoin());
					order.process();
				}
				case 4 -> {
					System.out.println("\nThank you For Shopping !!!! ");
					System.out.println("----------------------------------------------------------");
					return;
				}
				default -> {
					System.out.println("Invalid Payment Mode !!!");
					System.out.println("----------------------------------------------------------");
				}
			}
		}
	}
}
