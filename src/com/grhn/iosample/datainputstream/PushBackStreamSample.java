package com.grhn.iosample.datainputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class PushBackStreamSample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("file.txt");
			PushbackInputStream pis = new PushbackInputStream(is);
			int b;
			b = pis.read(); //A
			System.out.println(b + "->" + (char)b);
			b = pis.read(); //B
			System.out.println(b + "->" + (char)b);
			b = pis.read(); //C
			System.out.println(b + "->" + (char)b);
			b = pis.read();	//D
			System.out.println(b + "->" + (char)b);
			b = pis.read(); //E
			System.out.println(b + "->" + (char)b);
			pis.unread(b);
			//push back input stream's array default size 1
			//pis.unread(b);
			b = pis.read();
			System.out.println(b + "->" + (char)b + "-->read again");
			b = pis.read(); //F
			System.out.println(b + "->" + (char)b);
			b = pis.read();	//G
			System.out.println(b + "->" + (char)b);
			pis.close();
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
