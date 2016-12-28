package com.grhn.iosample.fileoutputstream;

import java.io.FileOutputStream;

public class FileOutputStreamSample {

	public static byte[] dataArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };

	public static void main(String[] args) {
//		write();
//		writeArray();
		write(1,5);
	}

	public static void write() {
		try {
			FileOutputStream fos = new FileOutputStream("write_file.txt");
			for (int i = 0; i < dataArray.length; i++) {
				fos.write(dataArray[i]);
			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeArray() {
		try {
			FileOutputStream fos = new FileOutputStream("write_file.txt");
			fos.write(dataArray);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void write(int off, int len) {
		try{
			FileOutputStream fos = new FileOutputStream("write_file.txt");
			fos.write(dataArray, off, len);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
