import java.io.*;
import java.net.*;

public class Server{
	public static void main(String args[]){
		try{
			//create server
			ServerSocket server = new ServerSocket(8000);

			//accept connect from client
			Socket socket = server.accept();

			//data stream and input
			DataInputStream recievedData = new DataInputStream(socket.getInputStream());
			DataOutputStream sendData = new DataOutputStream(socket.getOutputStream());
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

			//messges
			String msgToClient = "";
			String msgFromClient = "";

			//works until client sends "stop"
			while(!msgFromClient.equals("stop")){
				//read clients message
				msgFromClient = recievedData.readUTF();
				System.out.println("message from client: " + msgFromClient);
				
				//send message to client
				msgToClient = input.readLine();
				sendData.writeUTF(msgToClient);
				sendData.flush();
				
			}
			//close all connections
			recievedData.close();
			socket.close();
			server.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}