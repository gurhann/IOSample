package com.grhn.iosample.checkedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Checksum;

public class Sample {

	private static byte[] dataArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', '1', '2', '3', '4', '5', '6', '7' };

	public static void main(String[] args) {
		OutputStream os = null;
		CheckedOutputStream cos = null;
		try {
			CRC32 crc32 = new CRC32();
			os = new FileOutputStream("write_file.txt");
			cos = new CheckedOutputStream(os, crc32);
			cos.write(dataArray);
			System.out.println(cos.getChecksum().getValue());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				cos.close();
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
