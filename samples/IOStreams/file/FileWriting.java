package com.sunil.file.processing;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		FileWriter writer = null;
		try {
			writer = new FileWriter("output2.txt");
			writer.write("Files in Java are seriously good!!");
			System.out.println("Successfully written.");
		} catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}
}
