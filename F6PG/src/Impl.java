
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Impl extends UnicastRemoteObject implements I
{
	
	private ArrayList<Operands> ArrayOps = new ArrayList<Operands>();

	public Impl() throws RemoteException{
		// empty
	}

	public boolean addone(Operands op) throws RemoteException{
		
		if(ArrayOps.contains(op)){
			
			return false;
		}
		else{
			
			ArrayOps.add(op);
			return true;
			
		}
		
	}

	public boolean remove(Operands op) throws RemoteException
	{
		if(ArrayOps.contains(op)){
			ArrayOps.remove(op);
			
			return true;
		}
		else{
			
			return false;
		}
	}
	
	//Getter
	public ArrayList<Operands> getArrayOps(){
		return ArrayOps;
	}


	@Override
	public int mostra() throws RemoteException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	
}
