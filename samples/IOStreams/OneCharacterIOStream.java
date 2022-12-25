package com.sunil.sample.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OneCharacterIOStream {

    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {         	
            inputStream = new FileReader("input1.txt"); //Assuming that input1.txt file exists
            outputStream = new FileWriter("output1.txt"); //Assuming that output1.txt file exists
            int input;
            while ((input = inputStream.read()) != -1) {  // If c is -1, program reached end of stream
                outputStream.write(input);
            }
        } finally {
            if (inputStream != null) {  inputStream.close();    }
            if (outputStream != null) {  outputStream.close();  }
        }
    }
}
