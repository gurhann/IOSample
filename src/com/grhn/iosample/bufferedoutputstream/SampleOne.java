package com.grhn.iosample.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SampleOne {

	public static byte[] dataArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("write_file.txt");
			bos = new BufferedOutputStream(fos);
			bos.write(dataArray);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
