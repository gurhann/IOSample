package com.grhn.iosample.checkedinputstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class CRC32Sample {

	public static void main(String[] args) {
		try {
			CRC32 crc32r = new CRC32();
			InputStream is = new FileInputStream("file.txt");
			CheckedInputStream cis = new CheckedInputStream(is, crc32r);
			int b;
			while ((b = cis.read()) != -1) {
				System.out.println(b + "-" + (char) b);
			}
			Checksum cs = cis.getChecksum();
			System.out.println("CRC32:" + cs.getValue());
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
