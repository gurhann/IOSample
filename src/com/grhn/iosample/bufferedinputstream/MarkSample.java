package com.grhn.iosample.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class MarkSample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("file.txt");
			// uclu bloklara bolunuyor
			BufferedInputStream bis = new BufferedInputStream(is, 3);
			int b;
			while ((b = bis.read()) != -1) {
				System.out.println(b + "-" + (char) b);
				if (b == 68) {
					// ilk uclu blogun disinda kaldigi icin buffer icindeki
					// tampon buyultuluyor
					bis.mark(4);
				}
			}
			System.out.println("-----------");
			bis.reset();
			while ((b = bis.read()) != -1) {
				System.out.println(b + "-" + (char) b);
			}
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
