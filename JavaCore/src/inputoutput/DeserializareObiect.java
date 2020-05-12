package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializareObiect {

	public static void main(String[] args) {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(
                                                   new FileInputStream("File3.txt"));) 
		{
		ObiectSerializabil obiectSerializabil = (ObiectSerializabil) objectInputStream.readObject();
		System.out.println(obiectSerializabil.id+" "+obiectSerializabil.nume);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
