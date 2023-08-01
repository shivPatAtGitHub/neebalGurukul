package com.gurukul.day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	private static void readUsingReader() {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data;
		try {
			data = reader.readLine();
			System.out.println(data);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				throw new RuntimeException(e);			
			}
		}
	}
	
//	private static void readUsingFileReader() {
//		
//		FileReader fileReader = new FileReader("C:\\Users\\raj17\\eclipse-workspace\\neebalGurukul\\src\\com\\gurukul\\day14\\testfile.txt");
//		String data;
//		{
//			char[] chars = new char[10];
//			int characterRead;
//			String fileData = "";
//			System.out.println(data);
//			while((characterRead = fileReader.read(chars)) != -1) {
//				fileData += new String(chars, 0, characterRead);
//			}
//			System.out.println(fileData);
//		} catch (IOException e) {
//			throw new RuntimeException("Error in reading file");
//		} 
//			
//	}
//	
	
	public static void main(String[] args) {
		readUsingReader();
//		readUsingFileReader();
	}

}
