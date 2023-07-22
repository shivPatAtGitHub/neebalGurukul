package com.gurukul.day6;

import java.util.Scanner;

class person{
	private String name;
	private int age;
	
	person() {
		
	}
	
	person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Name:" + name + " Age:" + age;
	}
}


class employee extends person{
	private int empId;
	private int salary;
		
	employee() {
		
	}
	
	employee(String name, int age, int id, int sal) {
		super(name, age);
		empId = id;
		salary = sal;
	}
	
	public int getId() {
		return empId;
	}
	
	public int getSal() {
		return salary;
	}
	
	
	public String toString() {
		return super.toString() + " Emp Id:" + empId + " Salary:" + salary;
	}
	
}

class teacher extends employee{
	private String subject;
	
	teacher() {
		
	}
	
	teacher(String name, int age, int id, int sal, String sub) {
		super(name, age, id, sal);
		subject = sub;
	}
	
	public String getSub() {
		return subject;
	}
	
	public String toString() {
		return super.toString() + " Subject:" + subject;
	}
}

class principal extends teacher{
	private int exp;
	
	principal(){
		
	}
	
	principal(String name, int age, int id, int sal, String sub, int exp) {
		super(name, age, id, sal, sub);
		this.exp = exp;
	}
	
	public int getExp() {
		return exp;
	}
	
	public String toString() {
		return super.toString() + " Experience:" + exp;
	}
	
}

class officer extends employee{
	private String dept;
	
	officer() {
		
	}
	
	officer(String name, int age, int id, int sal, String dept) {
		super(name, age, id ,sal);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
}


public class ArrayObject {

	public static void main(String[] args) {

	teacher a = new teacher("Surendra", 20, 100, 5000, "Math");
	teacher b = new teacher("Narendra", 21, 101, 6000, "History");
	teacher c = new teacher("Jitendra", 22, 102, 7000, "English");

	principal x = new principal("Tipendra", 42, 201, 8000, "English" , 15);
	
	officer m = new officer("Rupendra", 55, 301, 10000, "Department of Science");	
	
	employee arr[] = new employee[5];
	arr[0] = a;
	arr[1] = b;
	arr[2] = c;
	arr[3] = x;
	arr[4] = m;
		
	int len = arr.length;
//	System.out.println(len);
	System.out.println("Original Array of Object: ");
	for(int i=0; i<len; i++) {
		System.out.print(arr[i].getName() + " ");
	}
	
	
	System.out.println();
	System.out.println("Sorted Array of Object: ");
	for(int i=0; i < len; i++) {
		for(int j=0; j < len; j++) {
			if(arr[i].getAge() > arr[j].getAge()) {
				employee t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}		
		}	
	}
	
	for(int i=0; i<len; i++) {
		System.out.print(arr[i].getName() + " ");
	}
	
	System.out.println();
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter Low Age Range: ");
	int lowRange = sc.nextInt(); 
	System.out.println("\nEnter High Age Range: ");
	int highRange = sc.nextInt(); 
	
	for(int i=0; i<len; i++) {
		if((arr[i].getAge() >= lowRange) && (arr[i].getAge() <= highRange)) {
			System.out.println(arr[i].getName());
		}
	}
	
	int lowSal = arr[0].getSal();
	int highSal = arr[0].getSal();
	int lowSalInd = 0;
	int highSalInd = 0;
		
	for(int i=0; i<len; i++) {
		if(arr[i].getSal() < lowSal) {
			lowSal = arr[i].getSal();
			lowSalInd = i;
		}
		
		if(arr[i].getSal() > highSal) {
			highSal = arr[i].getSal();
			highSalInd = i;
		}
	}
	
	System.out.println("\nHigh Salaried Employee: " + arr[highSalInd].getName());
	System.out.println("Details: " + arr[highSalInd].toString());
	System.out.println("\nLow Salaried Employee: " + arr[lowSalInd].getName());
	System.out.println("Details: " + arr[lowSalInd].toString());
	
	
	}
	
}
