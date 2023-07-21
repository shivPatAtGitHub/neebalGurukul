package com.gurukul.day4;


class Time{
	private int hrs;
	private int min;
	private int sec;

	//default Constructer
	Time(){}
	
	//Constructer
	Time(int x, int y, int z){
		hrs = x;
		min = y;
		sec = z;
	}
	
	int getHrs() {
		return hrs;
	}

	int getMin() {
		return min;
	}
	
	int getSec() {
		return sec;
	}
	
	void setHrs(int updHrs) {
		hrs = updHrs;
	}

	void setMin(int updMin) {
		min = updMin;
	}
	
	void setSec(int updSec) {
		sec = updSec;
	}
	
	public String toString() {
		return hrs + ":" + min + ":" + sec;
	}

	String convertIn12Hours() {

		hrs = getHrs();
		if(hrs%12 != 0) {
			hrs = hrs%12;
		}
		
		min = getMin();
		if(min >=60) {
			hrs = hrs+1;
			min = min%60;
		}
		
		sec = getSec();
		if(sec >=60) {
			min = min+1;
			sec = sec%60;
		}
		
		return hrs + ":" + min + ":" + sec;
	}
	
//	Time add(Time t) {
//		Time a = new Time();
//			hrs = getHrs() + t.getHrs();
//			min = getMin() + t.getMin();
//			sec = getSec() + t.getSec(); 
//			return a;
// 		}

}

public class TimeDemo {

	public static void main(String[] args) {
		Time x = new Time(12, 30, 25);
		Time y = new Time(19, 20, 35);
//		Time z = x.add(y);

		System.out.println(x.toString());
		System.out.println(y.toString());
//		System.out.println(z.toString());
		
		String timeMessage1 = x.convertIn12Hours();		
		String timeMessage2 = y.convertIn12Hours();		
		
		
		System.out.println(timeMessage1);
		System.out.println(timeMessage2);
		
	}

}




//public class TimeDemo {
//
//	public static void main(String[] args) {
//		Time x=new Time(12,30,25);
//		Time y=new Time(19,20,35);
//		Time z=x.add(y);
//		String timeMessage1= x.convertIn12Hours();
//		String timeMessage2=y.convertIn12Hours();
//		System.out.println(x);  // 12:30:25
//		System.out.println(y);  //19:20:35
//		System.out.println(z);  // 7:51:10
//		System.out.println(timeMessage1);  //12:30:25 PM
//		System.out.println(timeMessage2);  //7:20:35 PM
//
//
//	}
//
//}