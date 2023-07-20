
package com.gurukul.day4;

class Employee {
	private String name;
	private int empId;
	private int salary;
	private String dept;
	
	Employee(String name, int eid, int salary, String dept){
		this.name = name;
		this.empId = eid;
		this.salary = salary;
		this.dept = dept;
	}
	
	String getName() {
		return name;
	}
	
//	String getId() {
//		return empId;
//	}
	
	int getSal() {
		return salary;
	}
	
	void setSal(int updatedSal) {
		this.salary = updatedSal;
	}
	
	String getDept() {
		return dept;
	}
	
//	String toString() {
//		return "Name = " + name + " EmpId" + empId +  
//	}
	
}

public class Object {
	
	public static void main(String[] args) {
		Employee x = new Employee("Aditya", 1, 500, "Development");
		Employee y = new Employee("Krishna", 2, 600, "Testing");
		Employee z = new Employee("Miroy", 3, 700, "Designing");
	
		Employee highSal = x;
		if(x.getSal() > y.getSal()) 
			highSal = x;
		 else 
			highSal = y;
		
		
		if(z.getSal() > highSal.getSal()) 
			highSal = z;
		
		System.out.println("Employee with Highest Salary = " + highSal.getName());
		
		
		int xUpdate = x.getSal() + (x.getSal() * 20/100);
		int yUpdate = y.getSal() + (y.getSal() * 20/100);
		int zUpdate = z.getSal() + (z.getSal() * 20/100);
		
		
		x.setSal(xUpdate);
		System.out.println(x.getSal());
		
		y.setSal(yUpdate);
		System.out.println(y.getSal());

		z.setSal(zUpdate);
		System.out.println(z.getSal());
		
		
		System.out.println("Department with Highest Salary = " + highSal.getDept());
		
	}

}
