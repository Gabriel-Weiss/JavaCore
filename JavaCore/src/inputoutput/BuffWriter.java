package inputoutput;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BuffWriter {

	public static void main(String[] args) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(
				                     new FileWriter("File2.txt"));) 
		{
		String s = "Mesaj de testare";
		bufferedWriter.write(s);
		System.out.println("Mesaj inscris");
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}

	}

}
