package com.grhn.iosample.dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Sample {

	public static void main(String[] args) {
		writeFile();
		readFile();
	}

	private static void writeFile() {
		OutputStream os = null;
		DataOutputStream dos = null;

		try {
			os = new FileOutputStream("write_file.txt");
			dos = new DataOutputStream(os);
			dos.writeBoolean(false);
			dos.writeDouble(10.2);
			dos.writeInt(8);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void readFile() {
		InputStream is = null;
		DataInputStream dis = null;

		try {
			is = new FileInputStream("write_file.txt");
			dis = new DataInputStream(is);
			while(true) {
				boolean b1 = dis.readBoolean();
				double d1 = dis.readDouble();
				int i1 = dis.readInt();
				System.out.println(b1 + "-->" + d1 + "-->" + i1);
				
			}
		}catch (EOFException exeof) {
			System.out.println("\nSatir bitti");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
