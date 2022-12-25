package com.sunil.file.processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			File inputFile = new File("input1.txt");
			File outputFile = new File("outputFile1.txt");
			inputStream = new FileReader(inputFile);
			outputStream = new FileWriter(outputFile);
			int input;
			// If c is -1, program reached end of stream
			while ((input = inputStream.read()) != -1) {
				outputStream.write(input);
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		} catch (IOException ie) {
			System.out.println("An error has occurred.");
			ie.printStackTrace();
		}
	}
}
