package com.grhn.iosample.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class AvailableAndSkipMethods {

	public static void main(String[] args) {
		available();
		skip();
	}

	public static void available() {
		try {
			InputStream is = new FileInputStream("file.txt");
			int readableByteCount = is.available();
			System.out.println("Readable byte count: " + readableByteCount);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void skip() {
		try {
			InputStream is = new FileInputStream("file.txt");
			int b;
			while ((b = is.read()) != -1) {
				is.skip(1);
				System.out.println(b + "-" + (char) b);
			}
			is.close();
		} catch (Exception e) {
		}
	}
}
