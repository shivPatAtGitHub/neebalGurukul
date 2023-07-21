package assignmentsDay4;

import java.lang.Math;

class Complex{
	private int real;
	private int imag;
	
	Complex() {
		
	}

	Complex(int x, int y) {
		real = x;
		imag = y;
	}

//	Complex(double x, double y) {
//		real = (int)x;
//		imag = (int)y;
//	}
	
	int getReal() {
		return real;
	} 
	int getImag() {
		return imag;
	} 
	void setReal(int re) {
		real = re;
	} 
	void setImag(int im) {
		imag = im;
	} 
	
	
	Complex add(Complex t) {
			int a = getReal() + t.getReal();
			int b = getImag() + t.getImag();
			Complex n = new Complex(a, b);
		
		return n;
	}
	
	Complex sub(Complex t) {
		int a = getReal() - t.getReal();
		int b = getImag() - t.getImag();
		Complex n = new Complex(a, b);
	
		return n;
	}

	Complex mul(Complex t) {
		int a = (getReal() * t.getReal()) - (getImag() * t.getImag()) ;
		int b = (getReal() * t.getImag()) + (t.getReal() * getImag());
		Complex n = new Complex(a, b);
		
		return n;
	}
	
	Complex div(Complex t) {
//		
//		int a = (int) ((getReal() * t.getReal()) + (getImag() * t.getImag()) / ((Math.pow(t.getReal(), 2)) + (Math.pow(t.getImag(), 2))));
//	
//		int b = (int) ((t.getReal() * getImag()) - (getReal() * t.getImag()) / ((Math.pow(t.getReal(), 2)) + (Math.pow(t.getImag(), 2))));
//	
		int a1 = getReal();
		int a2 = t.getReal();
		int b1 = getImag();
		int b2 = t.getImag();
		
		int a = ((a1 * a2) + (b1*b2)) / ((a2 * a2) + (b2 * b2));
		int b = ((a2*b1) - (a1*b2))/ ((a2 * a2) + (b2 * b2));
		Complex n = new Complex(a,b);
		
		return n;
	}
	
	public String toString() {
//		int sign = 1;
//		if(getImag() != 1)
//			sign = 1;
//		return getReal() + " " + (sign  * getImag()) + "i";

		return getReal() + " + " + getImag() + "i";
	}

}

public class ComplexNumbersDemo {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	           Complex x=new Complex(3,4); // a = 3 ,b = 4
	           Complex y=new Complex(4,5); // c = 4 ,d = 5
	           Complex ad=x.add(y);
	           Complex s=x.sub(y); 
	           Complex m=x.mul(y); // (ac - bd) + i(ad + bc)
	           Complex di=x.div(y); // ((ac + bd) / c^2 + d^2) + i((bc - ad) / c^2 + d^2)
	           System.out.println(x); //3+i4
	           System.out.println(y); //4+i5
	           System.out.println(ad);//7+i9
	           System.out.println(s);//-1-i
	           System.out.println(m);//-8+i31
	           System.out.println(di);//.78+i0.02
			
		
	}

}
