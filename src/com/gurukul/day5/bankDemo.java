package com.gurukul.day5;

import java.util.Scanner;

class Bank {
	private String name;
	private int accNo;
	private String branch;
	private int bal;
	
	Bank() {}

	Bank(String name, int acc, String branch, int bal) {
		this.name = name;
		this.accNo = acc;
		this.branch = branch;
		this.bal = bal;
	}
	
	int getBal() {
		return bal;
	}
	
	int getAcc() {
		return accNo;
	}
	
	String getBranch() {
		return branch;
	}
	
	String getName() {
		return name;
	}
	
	// setBal
	void deposit(int depo) { 
		bal = getBal() + depo; 
	}
	
	void withdraw(int amount) {
		bal = bal - amount;
	}
	
	public String toString() {
		return "Name : " + getName() + "\nAccount Number: " + getAcc()+ "\nBalance: " + getBal()+ "\nBranch: " + getBranch() ;
	}
	
	
}



public class bankDemo {

	public static void main(String[] args) {
				
		Bank acc1 = new Bank("Ram", 123456, "Bandra", 2500);
		
		acc1.deposit(2550);
		
		double bal = acc1.getBal();
		
		System.out.println(acc1.getName()+" has "+ (int)bal +" amount");
				// Ram has 5050 amount
		
		System.out.println("Enter the amount to withdraw");
		Scanner sc = new Scanner(System.in);
		int am=sc.nextInt();//4500
		System.out.println(am);
		
		if(acc1.getBal()>am)
			acc1.withdraw(am);
		else
			System.out.println("Insufficient fund");
		
		//output because Minimum balance 1000
		
		
		System.out.println("Details of the account holder"+ acc1);
		System.out.println("\n\n");
		// Name: Ram Account Number 123456   Balance Rs.5050 Branch: Bandra 

		
       Bank  acc2 = new Bank("Sita", 23456, "Bandra", 2000);
		
		acc2.deposit(2550);
		
		double bal2 = acc2.getBal();
		
		System.out.println(acc2.getName()+" has "+ (int) bal2 + " amount");
				// Sita has 4050 amount
		
		System.out.println("Enter the amount to withdraw");
		int am2 = sc.nextInt();//2500
		
		if(acc2.getBal()>am2)
			acc2.withdraw(am2);
		else
			System.out.println("Insufficient fund"); 
		
		System.out.println("Details of the account holder"+ acc2);
		
		// Name: Sita Account Number 23456   Balance Rs.2050 Branch: Bandra 

	}
	


}