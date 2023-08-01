package com.gurukul.day14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	private void writeToFile() {
		String data = "123456789";
		try (OutputStream outputStream = new FileOutputStream("C:\\Users\\raj17\\eclipse-workspace\\neebalGurukul\\src\\com\\gurukul\\day14\\testfile.txt", true)){
			writeToStream(outputStream, data);
	} catch (IOException e) {
		throw new RuntimeException(e);
		}
	}
	
	
	private void writeToStream(OutputStream outputStream ,String s) {
		try {
			byte[] data = s.getBytes();
			outputStream.write(data);
			outputStream.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		FileOutputStreamDemo x = new FileOutputStreamDemo();
		x.writeToFile();
		
	}

}
