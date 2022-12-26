package com.sunil.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class ExceptionExample {

	public static void main(String[] args) {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		catchAllExceptoins(inputStream, outputStream);
		catchAllExceptoins1(inputStream, outputStream);

		throwAnotherException(inputStream, outputStream);

		try {
			throwAnotherException2(inputStream, outputStream);
		} catch (IOException ie) {
			System.out.println("catching exception thrown at method level");
			ie.printStackTrace();
		}
	}

	public static void catchAllExceptoins(FileReader inputStream, FileWriter outputStream) {
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

	public static void catchAllExceptoins1(FileReader inputStream, FileWriter outputStream) {
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
			throw new FileSystemException("file system exception");
			// We do not need to catch FileSystemException exception because
			// IOException is the superclass of FileSystemException and it is already caught
		} catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		} catch (IOException ie) {
			System.out.println("An error has occurred.");
			ie.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param inputStream
	 * @param outputStream
	 */
	public static void throwAnotherException(FileReader inputStream, FileWriter outputStream) {

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
			throw new FileSystemException("file system exception");
			// We do not need to catch FileSystemException exception because
			// IOException is the superclass of FileSystemException and it is already caught
		} catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
			// If we want to throw another exception in catch block
			// we should either add throws FileSystemException to the method or
			// add another try catch block within catch
			try {
				throw new FileSystemException("file system exception");
			} catch (IOException ie) {
				System.out.println("An error has occurred.");
				ie.printStackTrace();
			}

		} catch (IOException ie) {
			System.out.println("An error has occurred.");
			ie.printStackTrace();
		}
	}

	/**
	 * 
	 * @param inputStream
	 * @param outputStream
	 */
	public static void throwAnotherException2(FileReader inputStream, FileWriter outputStream) 
			throws IOException {

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
			throw new FileSystemException("file system exception");
			// We do not need to catch FileSystemException exception because
			// IOException is the superclass of FileSystemException and it is already caught
		} catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
			
			// If we want to throw another exception in catch block
			// we should either add throws FileSystemException to the method or
			// add another try catch block within catch
			throw new FileSystemException("file system exception");

		} catch (IOException ie) {
			System.out.println("An error has occurred.");
			ie.printStackTrace();
		}
	}

}
