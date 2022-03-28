package com.banking;

import java.util.Scanner;

 public class BankingApplication2{
	  public static void main(String[] args) {
		  Account1 ac1=new Account1(23563070, "XYZ");
		  ac1.BankMenu();
   }
 }
   class Account1{ 	  
   int balance;
   int AccountNo;
   String CustomerName;
  
    Account1(int aNo, String cName) {
	AccountNo = aNo;
	CustomerName = cName;
   }       	
      
     
    void checkbalance() {
	   balance=balance+0;
   }
    void deposit(int amount) {
	   balance=balance+amount;
   }
    void withdraw(int amount) {
	   balance=balance-amount;
   }
    void BankMenu() {
	   
	    char option='\0';
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("WELCOME "+CustomerName);
	    System.out.println("Your accNo is "+AccountNo);
	    System.out.println("\n");
		System.out.println("A.Check Balance:");
		System.out.println("B.Deposit:");
		System.out.println("C.Withdraw:");
		System.out.println("D.Exit");
	
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
       int amount1=sc.nextInt();
       deposit(amount1);
       break;
     case 'C':
       System.out.println("---------------------------");
       System.out.println("Enter amount to Withdraw :");
       System.out.println("===========================");
       int amount2=sc.nextInt();
       withdraw(amount2);
       break;
     case 'D':
    	 System.out.println("-------------------------");
    	 break;
      default:
    	  System.out.println("Invalid option || Please enter again");
        break;
     }
   }
    while(option!='D');
    System.out.println("ThankYou for using our services");
     
    }	  		
   }
 
 
  

