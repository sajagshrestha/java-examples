import java.rmi.*;
public class Client{
	public static void main(String args[]){
		try{
			IADDER stub = (IADDER)Naming.lookup("rmi://localhost:5000");
			//print result
			System.out.println(stub.add(1,2));
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}