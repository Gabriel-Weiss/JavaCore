package exceptii;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ClasaNoua {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException, FileNotFoundException {
		try {
			int array[] = {1,2,3,4};
			System.out.println(array[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Printare ceva");
		
		System.out.println();
		
		try (PrintWriter printWriter = new PrintWriter("test.txt");) {
			printWriter.println("creat/salvat");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("Printare altceva");
	}

}
