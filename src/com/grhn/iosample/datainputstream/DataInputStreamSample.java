package com.grhn.iosample.datainputstream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamSample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("file.txt");
			DataInputStream dis = new DataInputStream(is);
			byte c;
			while (true) {
				c = dis.readByte();
				System.out.println(c + "-->" + (char) c);
			}
		} catch (EOFException e) {
			System.out.println("Doysa sonu");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
