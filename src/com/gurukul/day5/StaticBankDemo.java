package com.gurukul.day5;

class Bankk {
	private String name;
	private int accNo;
	private String branch;
	private int bal;
	private static int count = 1000;
	private static int total = 0;
	
	Bankk() {}

	Bankk(String name, String branch, int bal) {
		this.name = name;
		accNo = count++;
		this.branch = branch;
		this.bal = bal;
		total += bal;
	}
	
	int getAccNo() {
		return accNo;
	}
	
	
	int getBal() {
		return bal;
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
		total += depo;
	}
	
	void withdraw(int amount) {
		bal = bal - amount;
		total -= amount;
	}
	
	public String toString() {
		return "Name : " + getName() + "\nAccount Number: " + getAccNo()+ "\nBalance: " + getBal()+ "\nBranch: " + getBranch() + "\n";
	}
	
	
	static int getTotal() {
		return total;
	}
	
}


public class StaticBankDemo {


		public static void main(String[] args) {
			Bankk acc1 = new Bankk("Ram", "Bandra", 2500);
			Bankk acc2 = new Bankk("Sita", "Bandra", 3500);
			Bankk acc3 = new Bankk("Rahim", "Bandra", 2800);
			Bankk acc4 = new Bankk("Rita", "Bandra", 5500);
			acc1.deposit(5000);
			acc2.deposit(2500);
			acc3.withdraw(1200);
			System.out.println(acc1);
			//Name: Ram Account Number 1001   Balance Rs.7500 Branch: Bandra 
			System.out.println(acc2);
			//Name: Sita Account Number 1002   Balance Rs.6000 Branch: Bandra 

			System.out.println(acc3);
			//Name: Rahim Account Number 1003   Balance Rs.1600 Branch: Bandra 
			System.out.println(acc4);
			//Name: Rita Account Number 1004   Balance Rs.5500 Branch: Bandra 
			
			System.out.println("Amount Available in the bank " + Bankk.getTotal());
			//20600
	}
	
}
