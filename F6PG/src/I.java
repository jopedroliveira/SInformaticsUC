
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface I extends Remote
{
	public ArrayList<Operands> getArrayOps() throws RemoteException;
	
	public boolean addone(Operands op) throws RemoteException;
	
	public boolean remove(Operands op) throws RemoteException;
	
	public int mostra() throws RemoteException;
}
