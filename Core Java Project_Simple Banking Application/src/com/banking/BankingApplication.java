package com.banking;

import java.util.Scanner;

 public class BankingApplication{
	  public static void main(String[] args) {
		  BankAccount ba=new BankAccount("ABC","B789541");//"Accountholder name","Account number"
		  ba.BankMenu();
   }
 }
   class BankAccount{ 
 //Fields
   int balance;
   int previousTransaction;
   String customerName;
   String customerId;
  //Constructor
    BankAccount(String cName, String cId) {
	customerName = cName;
	customerId = cId;
}
   //Deposit method
    void deposit(int amount) {
    	if(amount!=0) {
	   balance=balance+amount;
	   previousTransaction=amount;
    	}
   }
    //Withdraw method
    void withdraw(int amount) {
    	if(amount!=0) {
	   balance=balance-amount;
	   previousTransaction=-amount;
    	}
   }
    //getPrevious Transaction method
    void getpreviousTransaction() {
    	if(previousTransaction>0) {
    		System.out.println("Deposited: "+previousTransaction);
    	}
    	else if(previousTransaction<0) {
    		System.out.println("Withdraw: "+Math.abs(previousTransaction));
    	}
    	else {
    		System.out.println("No Transaction occured");
    	}
    }
    //showmenu method
    void BankMenu() {
	   
	    char option='\0';
	    //Scanner class
		Scanner sc=new Scanner(System.in);
		//options
	    System.out.println("WELCOME "+customerName);
	    System.out.println("Your ID is "+customerId);
	    System.out.println("\n");
		System.out.println("A.Check Balance:");
		System.out.println("B.Deposit:");
		System.out.println("C.Withdraw:");
		System.out.println("D.Previous transaction");
		System.out.println("E.Exit");
	
	   do {
		   System.out.println("***************************");
		   System.out.println("Enter an option");
		   System.out.println("***************************");
		   option=sc.next().charAt(0);
		   
    switch(option) {
     case 'A':
       System.out.println("--------------------------");
	   System.out.println("Balance :"+balance);
	   System.out.println("===========================");
	   break;
     case 'B':
       System.out.println("---------------------------");
       System.out.println("Enter an amount to Deposit :");
       System.out.println("===========================");
       int amount=sc.nextInt();
       deposit(amount);
       break;
     case 'C':
       System.out.println("---------------------------");
       System.out.println("Enter amount to Withdraw :");
       System.out.println("===========================");
       int amount2=sc.nextInt();
       withdraw(amount2);
       break;
     case 'D':
       System.out.println("---------------------------");
       getpreviousTransaction();
       System.out.println("===========================");
    	 break;
     case 'E':
    	 System.out.println("=========================");
    	 break;
      default:
    	  System.out.println("Invalid option || Please enter again");
        break;
     }
   }
    while(option!='E');
    System.out.println("ThankYou for using our services");
     
    }	  		
   }
 
 
  

