package com.grhn.iosample.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadMethods {

	public static void main(String[] args) {
		// read();
		read(new byte[3]);
		// read(new byte[3], 1, 2);
	}

	private static void read() {
		try {
			InputStream is = new FileInputStream("file.txt");
			int b;
			while ((b = is.read()) != -1) {
				System.out.println(b + "-" + (char) b);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void read(byte[] byteArray) {
		try {
			InputStream is = new FileInputStream("file.txt");
			int readByteCount;
			while ((readByteCount = is.read(byteArray)) != -1) {
				for (int i = 0; i < readByteCount; i++) {
					System.out.println(byteArray[i] + "-" + (char) byteArray[i]);
				}
				System.out.println("--------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void read(byte[] byteArray, int start, int end) {
		try {
			InputStream is = new FileInputStream("file.txt");
			while (is.read(byteArray, start, end) != -1) {
				for (int i = 0; i < byteArray.length; i++) {
					System.out.println(byteArray[i] + "-" + (char) byteArray[i]);
				}
				System.out.println("--------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
