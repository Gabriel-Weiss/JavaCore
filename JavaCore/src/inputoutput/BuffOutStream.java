package inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffOutStream {

	public static void main(String[] args) {
		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                                                         new FileOutputStream("File.txt"));) 
		{
			String s = "Mesaj de testare";
			byte [] arrray = s.getBytes();
			bufferedOutputStream.write(arrray);
			System.out.println("Mesaj inscris");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
