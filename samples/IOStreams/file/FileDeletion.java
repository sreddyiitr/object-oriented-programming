package com.sunil.file.processing;

import java.io.File;

public class FileDeletion {
	public static void main(String[] args) {
		File file = new File("myfile.txt");
		if (file.delete()) {
			System.out.println("The deleted file is : " + file.getName());
		} else {
			System.out.println("Failed in deleting the file.");
		}
	}
}
