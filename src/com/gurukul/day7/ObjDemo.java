package com.gurukul.day7;

interface Show{
	int getId();
	
}
class Distance implements Show{
	int id; 
	int cm;
	int m;
	Distance(){}
	Distance (int id, int cm, int m){
		this.id=id;
		this.cm=cm;
		this.m=m;
		
	
}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return id+"  "+cm+"  "+m;
	}
	}
	class Student implements Show{
		int id;
		String name;
		int age;
		int fees;
		Student(int id, String name, int age, int fees){
			this.id=id;
			this.name=name;
			this.age=age;
			this.fees=fees;
		}
		public int getId() {
			return id;
		}
		public String toString() {
			return id+"  "+name+"  "+age+"  "+fees;
		}
		
	}
public class ObjDemo {

	public static void main(String[] args) {
		
		Show arr[] = new Show[5];
		arr[0] = new Distance(1, 100, 1000);
		arr[1] = new Distance(5, 100, 1000);
		arr[2] = new Distance(3, 100, 1000);
		arr[3] = new Student(2, "xxx", 1000, 10000);
		arr[4] = new Student(4, "yyy", 1000, 10000);
		
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j].getId()>arr[j+1].getId()) {
					Show t =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		
		
	}

}
