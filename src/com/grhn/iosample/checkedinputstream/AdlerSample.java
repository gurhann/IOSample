package com.grhn.iosample.checkedinputstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class AdlerSample {

	public static void main(String[] args) {
		try {
			Adler32 adler32 = new Adler32();
			InputStream is = new FileInputStream("file.txt");
			CheckedInputStream cis = new CheckedInputStream(is, adler32);
			int b;
			while ((b = cis.read()) != -1) {
				System.out.println(b + "-" + (char) b);
			}
			Checksum cs = cis.getChecksum();
			System.out.println("Adler32:" + cs.getValue());
			cis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
