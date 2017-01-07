package com.grhn.iosample.filereader;

import java.io.FileReader;
import java.io.IOException;

import javax.tools.ToolProvider;

public class Sample {

	public static void main(String[] args) {
		try {
			// read();
//			read(new char[3]);
			read(new char[3], 0, 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void read() throws IOException {
		FileReader fr = new FileReader("file2.txt");
		System.out.println("encoding:" + fr.getEncoding());
		if (!fr.ready()) {
			throw new IOException("The file is not yet ready to read.");
		}
		int c;
		int totalRowEnd = 0;
		while ((c = fr.read()) != -1) {
			if (c == '\r') {
				totalRowEnd++;
			}
		}
		System.out.println("total row end:" + totalRowEnd);
	}

	private static void read(char[] cBuf) throws IOException {
		FileReader fr = new FileReader("file2.txt");
		System.out.println("encoding:" + fr.getEncoding());
		if (!fr.ready()) {
			throw new IOException("The file is not yet ready to read.");
		}
		int totalRowEnd = 0;
		int readedCharCount = 0;
		while ((readedCharCount = fr.read(cBuf)) != -1) {
			System.out.println("readed char count:" + readedCharCount);

			for (int i = 0; i < readedCharCount; i++) {
				if (cBuf[i] == '\r') {
					totalRowEnd++;
				}
				System.out.println(cBuf[i]);
			}
			System.out.println("-----------");
		}
		System.out.println("total row end:" + totalRowEnd);
	}

	private static void read(char[] cBuf, int off, int len) throws IOException {
		FileReader fr = new FileReader("file2.txt");
		System.out.println("encoding:" + fr.getEncoding());
		if (!fr.ready()) {
			throw new IOException("The file is not yet ready to read.");
		}
		int totalRowEnd = 0;
		int readedCharCount = 0;
		while ((readedCharCount = fr.read(cBuf, off, len)) != -1) {
			System.out.println("readed char count:" + readedCharCount);

			for (int i = 0; i < readedCharCount; i++) {
				if (cBuf[i] == '\r') {
					totalRowEnd++;
				}
				System.out.println(cBuf[i]);
			}
			System.out.println("-----------");
		}
		System.out.println("total row end:" + totalRowEnd);

	}

}
