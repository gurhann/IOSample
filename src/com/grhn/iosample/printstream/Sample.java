package com.grhn.iosample.printstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Sample {

	private static String[] stringArray = { "KOCAELÝ", "SAKARYA", "ERZURUM" };
	private static double[] doubleArray = { 10.2, 11.6, 13.1 };
	private static int[] intArray = { 6, 8, 10 };

	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		PrintStream ps = null;

		os = new FileOutputStream("write_file.txt");
		ps = new PrintStream(os);
		for (int i = 0; i < 3; i++) {
			ps.print(stringArray[i]);
			ps.print("-");
			ps.print(doubleArray[i]);
			ps.print("-");
			ps.print(intArray[i]);
			ps.println();

			if (ps.checkError()) {
				throw new IOException("there is an exception");
			}
		}
		
		ps.close();
	}
}
