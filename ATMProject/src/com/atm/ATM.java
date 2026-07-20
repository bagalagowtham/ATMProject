package com.atm;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			double balance = 5000;
			
			while(true){
			System.out.println("==== ATM MENU ====");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice: ");
				int choice =sc.nextInt();
				
				switch (choice) {
				
				case 1:
					System.out.println("Current Balance: $" + balance);
					break;
					
				case 2:
					System.out.println("Enter deposit amount: ");
						double deposit = sc.nextDouble();
						balance = balance + deposit;
						System.out.println("Amount Deposited Sucessfully.");
						System.out.println("New Balance: $" +balance);
					break;
				case 3:
					System.out.println("Enter withdraw amount: ");
					    double withdraw = sc.nextDouble();
					    if(withdraw <= balance) {
					    	balance = balance - withdraw;
					    	System.out.println("Please collect your cash.");
					    	System.out.println("Remaining Balance: $" + balance);
					    }
					    else {
					    	System.out.println("Insufficient Balance!");
					    }
					 break;
				case 4:
					System.out.println("Thank you for using our ATM!");
						sc.close();
						return;
						
				default:
					System.out.println("Invalid Choice!");
					    	
				    }
				
			}
			
	  }

}

