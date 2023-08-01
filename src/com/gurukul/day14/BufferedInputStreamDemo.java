package com.gurukul.day14;

import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	private static void readSingleByte() {			
		BufferedInputStream bis = new BufferedInputStream(System.in);
		try {
			System.out.println("Enter an Input");
			int a = bis.read();
			System.out.println("Input was " + a);
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error");
		}
	}

	private static void readByteArray() {			
		BufferedInputStream bis = new BufferedInputStream(System.in);
		
		try {
			System.out.println("Enter an Input");
			byte b[] = new byte[5];
			bis.read(b);
			System.out.println("Input was " + new String(b));
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error");
		}
	}
	
	private static void keepReadingByte() {
		
		BufferedInputStream bis = new BufferedInputStream(System.in);
		
		
		try {
			System.out.println("Enter an Input");
			byte b[] = new byte[5];
			String s = "";
			int pos;
			
			while(true) {
				pos = bis.read(b);
				if(pos == -1)
					break;
				s += new String(b, 0, pos);
				if(b[pos-1] == '\n')
					break;
				b = new byte[5];
			}
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}			
	

	public static void main(String[] args) {
		
		
//		readSingleByte();
//		readByteArray();
		keepReadingByte();

}
}