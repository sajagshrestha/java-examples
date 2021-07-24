import java.io.*;
import java.net.*;

public class Client {
	public static void main(String args[]) {
		try {
			Socket socket = new Socket("localhost", 8000);

			DataInputStream recievedData = new DataInputStream(socket.getInputStream());
			DataOutputStream sendData = new DataOutputStream(socket.getOutputStream());
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

			String msgFromServer = "";
			String msgToServer = "";

			// Client must initiate chat
			while (true) {

				msgFromServer = recievedData.readUTF();
				if (msgFromServer.equals("stop"))
					break;
				System.out.println("message from server: " + msgFromServer);

				msgToServer = input.readLine();
				sendData.writeUTF(msgToServer);
				sendData.flush();
			}
			sendData.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}