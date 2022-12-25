import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class OneLineIOStream {

	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try {
			FileReader fileReader = new FileReader("input1.txt");
			inputStream = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter("output1.txt");
			outputStream = new PrintWriter(fileWriter);
			
			String input;
			while ((input = inputStream.readLine()) != null) {
				outputStream.println(input);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
