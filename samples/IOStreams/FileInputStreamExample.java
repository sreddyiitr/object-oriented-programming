package com.sunil.sample.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("input1.txt");
			System.out.println("Remaining bytes that can be read : " + inputStream.available());
			// You can pass the number of bytes to read instead of reading 1 byte at a time
			byte[] bytes = new byte[8];   // Passing 8 bytes
			while (inputStream.read(bytes) != -1) {
				// convert bytes to string for demo
                System.out.println(new String(bytes, StandardCharsets.UTF_8));
				System.out.println("Remaining bytes that can be read : " + inputStream.available());
			}
		} finally {
			if (inputStream != null) {	inputStream.close();	}
		}
	}
}
