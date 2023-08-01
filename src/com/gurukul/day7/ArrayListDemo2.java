
//add n students in array list. display all the students whose age is greater than 15.


package com.gurukul.day7;

import java.util.ArrayList;

class StudClass{
	int id;
	String name;
	int age;
	
	StudClass() {}
	StudClass(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Id:" + id + " Name:" + name + " Age:" + age;
	}
 	
}



public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList <StudClass> studL = new ArrayList<StudClass>();
		
		StudClass s1 = new StudClass(1,"Rupendra", 20);	
		StudClass s2 = new StudClass(2,"Narendra", 21);	
		StudClass s3 = new StudClass(3,"Jitendra", 13);	
		StudClass s4 = new StudClass(4,"Surendra", 24);	
		StudClass s5 = new StudClass(5,"Mahindra", 14);	
		

		studL.add(s1);
		studL.add(s2);
		studL.add(s3);
		studL.add(s4);
		studL.add(s5);
		
		for(int i=0; i<5; i++) {
			if(studL.get(i).getAge() > 15) {
				System.out.println(studL.get(i));
			}
		}
		
		
	}

}
