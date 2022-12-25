package com.sunil.file.processing;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		File file = null;
		// String array to store all the file paths
		String[] paths;

		try {
			// create new file object by passing folder path
			file = new File("/Users/Sunil/workspace2022/example-one/src/com/sunil/file/processing");

			// store the file names and paths array of files and directory
			paths = file.list();

			// for each name in the path array
			for (String path : paths) {
				// prints filename and directory name
				System.out.println(path);
			}
		} catch (Exception e) {
			// if any error occurs
			System.out.println(e.getMessage());
		}
	}
}
