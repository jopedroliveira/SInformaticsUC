
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathImpl extends UnicastRemoteObject implements IMath
{
	public MathImpl() throws RemoteException
	{
		// empty
	}

	public int add(int a, int b) throws RemoteException
	{
		return a + b;
	}
	
	public int sub(int a, int b) throws RemoteException
	{
		return a - b;
	}
	
	public int mult(int a, int b) throws RemoteException
	{
		return a * b;
	}
	
	public int div(int a, int b) throws RemoteException
	{
		return a / b;
	}
	
}
