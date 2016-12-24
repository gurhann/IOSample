package com.grhn.iosample.bufferedinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputStream {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("file.txt");
			java.io.BufferedInputStream bis = new java.io.BufferedInputStream(is);
			int b;
			while ((b = bis.read()) != -1) {
				System.out.println(b + "-" + (char) b);
			}
			bis.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


