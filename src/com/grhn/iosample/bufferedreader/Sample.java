package com.grhn.iosample.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("file2.txt"));
			if (!br.ready()) {
				br.close();
				throw new IOException("The file is not yet ready to read.");
			}
			int totalRowEnd = 0;
			while(br.readLine() != null) {
				totalRowEnd++;
			}
			System.out.println("total row end:" + totalRowEnd);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
