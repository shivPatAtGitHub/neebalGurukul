package com.gurukul.day16;

import java.util.ArrayList;
import java.util.HashSet;

class Student implements Comparable<Student>{
	private String name;
	private int Math;
	private int Physics;
	private int Chem;
	private int RollNo;
	
	Student() {}
	
	Student(String name, int math, int phy, int chem, int rollno) {
		this.name = name;
		this.Math = math;
		this.Physics = phy;
		this.Chem = chem;
		this.RollNo = rollno;
	}

	public String getName() {
		return name;
	}

	public int getMath() {
		return Math;
	}

	public int getPhysics() {
		return Physics;
	}

	public int getChem() {
		return Chem;
	}

	public int getRollNo() {
		return RollNo;
	}

//	
//	public int findFails() {
//		if(Math < 35 && Chem < 35 && Physics < 35) {
//			return 3;
//		}
//		
//		if(Math < 35 && Chem < 35 || Physics < 35 && Chem < 35|| Math < 35 && Physics < 35 ) {
//			return 2;
//		}
//		
//		if(Math < 35 || Chem < 35 || Physics < 35) {
//			return 1;
//		}
//		return 0;		
//	}
	
	@Override
	public String toString() {
		return "\nStudent [name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return RollNo-o.RollNo;
	}
	
	public boolean isFail(int sub) {
		return sub < 35;
	}
}


public class HashsetDemo2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Rupendra", 40, 35, 30, 100);
		Student s2 = new Student("Tipendra", 50, 45, 20, 100);
		Student s3 = new Student("Jitendra", 20, 30, 10, 100);
		Student s4 = new Student("Narendra", 10, 65, 50, 100);
		Student s5 = new Student("surendra", 40, 35, 70, 100);
		
		Student [] studentArray = {s1,s2,s3,s4,s5};
		
		ArrayList <Student> StudFMath = new ArrayList<>();
		ArrayList <Student> StudFPhysics = new ArrayList<>();
		ArrayList <Student> StudFChem = new ArrayList<>();
		
		for(Student s:studentArray) {
			if(s.isFail(s.getMath()))
				StudFMath.add(s);
		}
		
//		ArrayList<Student> studentPhyFailed = new ArrayList<Student>();
		for(Student s:studentArray) {
			if(s.isFail(s.getPhysics()))
				StudFPhysics.add(s);
		}
		
//		ArrayList<Student> studentChemFailed = new ArrayList<Student>();
		for(Student s:studentArray) {
			if(s.isFail(s.getChem()))
				StudFChem.add(s);
		}

//		
//		 for(Student s:studentMathFailed) {
//	            System.out.println(s.getName());
//	        }
//		 System.out.println();
//		 for(Student s:studentPhyFailed) {
//	            System.out.println(s.getName());
//	        }
//		 System.out.println();
//		   for(Student s:studentChemFailed) {
//	            System.out.println(s.getName());
//	        }
		
		HashSet<Student> set1 = new HashSet<Student>();
		
		HashSet<Student> set2 = new HashSet<Student>();
		HashSet<Student> set3 = new HashSet<Student>();
		set1.addAll(StudFMath);
		set2.addAll(StudFPhysics);
		set3.addAll(StudFChem);
		
		set1.retainAll(set2);
		set1.retainAll(set3);
	
		
	
		System.out.println(set1);
			
			
		
		
		
		
	}

}
