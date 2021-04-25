import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


public class Server {
	public static void main(String args[]){
		try{
			AdderRemote stub = new AdderRemote();
			Naming.rebind("rmi://localhost:5000",stub);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}