package com.gurukul.day7;

import java.util.ArrayList;
import java.util.List;

class StudentClass{
	private int id;
	private String name;
	private int age;
	
	StudentClass(){}
	
	StudentClass(int id, String name, int age){
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


public class ArrayListDemo {
	
		public static void main(String[] args) {
			
		ArrayList <StudentClass> studList = new ArrayList<StudentClass>();
		
		studList.add(new StudentClass(1213432, "Raj", 20));
		studList.add(new StudentClass(1213432, "Rajesh", 21));
		studList.add(new StudentClass(1213432, "Ram", 22));
		studList.add(new StudentClass(1213432, "Ramesh", 31));
		studList.add(new StudentClass(1213432, "Sham", 11));
		studList.add(new StudentClass(1213432, "Rahim", 27));
		
		studList.get(4).setAge(50);
		studList.get(4).setName("Ravi");
		
		for(int i=0; i < studList.size(); i++ ) {
			System.out.println(studList.get(i));
		}
		
		System.out.println();
		
		for(int i=0; i<studList.size(); i++) {
			for(int j=0; j<studList.size()-1; j++) {
				if(studList.get(j).getAge() > (studList.get(j+1).getAge())) {
					StudentClass t = studList.get(j);
					studList.set(j, studList.get(j+1));
					studList.set((j+1), t);
				}
			}
		}
		

		for(int i=0; i < studList.size(); i++ ) {
		System.out.println(studList.get(i));
		}
	
		
		for(int j=0; j < studList.size()/2; j++) {
			StudentClass t = studList.get(j);
			studList.set(j, studList.get(studList.size()-1));
			studList.set(studList.size()-1, t);
		}
		
		System.out.println();
		
		for(int i=0; i < studList.size(); i++ ) {
			System.out.println(studList.get(i));
		}
		
		
		
		
		
	}

}

