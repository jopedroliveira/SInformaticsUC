
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMath extends Remote
{
	public int add(int a, int b) throws RemoteException;

	public int sub(int a, int b) throws RemoteException;
	
	public int mult(int a, int b) throws RemoteException;
	
	public int div(int a, int b) throws RemoteException;
	
}
