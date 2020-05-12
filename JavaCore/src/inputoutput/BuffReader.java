package inputoutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) {
		try (BufferedReader bufferedReader = new BufferedReader(
                                             new FileReader("File2.txt"));) 
		{ int i;
		while((i=bufferedReader.read())!=-1){
			System.out.print((char)i);
		}
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}

	}

}
