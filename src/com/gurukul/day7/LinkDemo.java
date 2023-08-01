package com.gurukul.day7;

import java.util.*;

public class LinkDemo {

	static <T extends List<?>> void display (T t){
		Iterator <?> it =t.iterator();
		while (it.hasNext()) {
			it.next();
		}
		System.out.println(t);	
	}
				

		public static void main(String[] args) {
			// TODO Auto-gene rated method stub
	     ArrayList<Integer> arrList = new ArrayList<>();
	     arrList.add(10);
	     arrList.add(20);
	     arrList.add(30);
	     
	     Vector<Integer> vList= new Vector<>();
	     vList.add(40);
	     vList.add(50);
	     vList.add(60);
	     
	     Stack<Integer> sList= new Stack<>();
	     sList.add(70);
	     sList.add(80);
	     sList.add(90);
	     LinkDemo.display(arrList);
	     LinkDemo.display(vList);
	     LinkDemo.display(sList);
	   
	     

		}

}


//public class Student implements Comparable {
//	//instance variable
//	String name;
//	int age;
//	long contactNo;
//	
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", age=" + age + ", contactNo=" + contactNo + "]";
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public long getContactNo() {
//		return contactNo;
//	}
//
//	public void setContactNo(long contactNo) {
//		this.contactNo = contactNo;
//	}
//
//	public Student() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Student(String name, int age, long contactNo) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.contactNo = contactNo;
//@Override
//public int compareTo(Object o) {
//	System.out.println(o.getClass());
//	
//	return (this.getName()).compareToIgnoreCase(((Student) o).getName().toString());
//}
//
//}



//package day8;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//import day4.Student;
//
//
//
//public class StudentSort {
//
//	public StudentSort() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		ArrayList<Student> studlist = new ArrayList<Student>(5);
//		studlist.add(new Student("Raj", 20, 1234551));
//		studlist.add(new Student("Rajesh", 21, 1234552));
//		studlist.add(new Student("Ram", 22, 1234553));
//		studlist.add(new Student("Ramesh", 31, 1234554));
//		studlist.add(new Student("Sham", 11, 1234555));
//		studlist.add(new Student("Rahim", 9, 1234556));
//
//		System.out.println("Sorted Students:");
//		Collections.sort(studlist);
//		for(Student stud: studlist)
//			System.out.println(stud);
//	}
//
//}
