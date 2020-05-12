package networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClasa {

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(1234)) {
			Socket socket = serverSocket.accept();
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			String string = (String)dataInputStream.readUTF();
			System.out.println("Raspuns: "+string);
		} catch (IOException e) {
		e.printStackTrace();
		}

	}

}
