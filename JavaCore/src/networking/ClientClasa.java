package networking;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientClasa {

	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 1234);) {
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataOutputStream.writeUTF("Mesaj de salut");
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
