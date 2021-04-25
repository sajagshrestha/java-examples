import java.rmi.*;

public interface IADDER extends Remote{
	public int add(int x ,int y ) throws RemoteException;
}