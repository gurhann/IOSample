package com.grhn.iosample.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class SampleTwo {

	private static byte[] dataArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', '1', '2', '3', '4', '5', '6', '7' };

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("write_file.txt");
			bos = new BufferedOutputStream(fos);
			for (int i = 0; i < dataArray.length; i++) {
				bos.write(dataArray[i]);
				if (i > 0 && i % 5 == 0) {
					bos.flush();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
