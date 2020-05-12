package inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BuffInStream {

	public static void main(String[] args) {
		try (BufferedInputStream bufferedinputStream = new BufferedInputStream(
                new FileInputStream("File.txt"));) 
		{ int i;
		while((i=bufferedinputStream.read())!=-1){
			System.out.print((char)i);
		}
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}


	}

}
