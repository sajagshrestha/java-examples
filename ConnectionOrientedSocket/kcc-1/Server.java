import java.io.*;
import java.net.*;

public class Server {
	public static void main(String args[]) {
		try {
			// create server
			ServerSocket server = new ServerSocket(8000);

			// accept connection from client
			Socket socket = server.accept();

			// data stream and input
			DataInputStream recievedData = new DataInputStream(socket.getInputStream());
			DataOutputStream sendData = new DataOutputStream(socket.getOutputStream());
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

			// messages
			String msgToClient = "";
			String msgFromClient = "";

			// works until client sends "stop"
			while (true) {
				// send message to client
				msgToClient = input.readLine();
				sendData.writeUTF(msgToClient);
				sendData.flush();

				// read clients message
				msgFromClient = recievedData.readUTF();

				if (msgFromClient.equals("stop"))
					break;
				System.out.println("message from client: " + msgFromClient);

			}
			// close all connections
			sendData.close();
			socket.close();
			server.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}