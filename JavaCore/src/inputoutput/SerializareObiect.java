package inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializareObiect {
	
	public static void main(String[] args) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                                                     new FileOutputStream("File3.txt"));) 
		{
		ObiectSerializabil obiectSerializabil = new ObiectSerializabil(01,"Nume");
		objectOutputStream.writeObject(obiectSerializabil);
		System.out.println("Obiectul a fost serializat");
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}

	}

}
