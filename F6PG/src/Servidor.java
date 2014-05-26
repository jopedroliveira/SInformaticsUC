import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor
{
	public static void main(String[] args)
	{
		try
		{
			Impl obj = new Impl();

			Registry registry = LocateRegistry.createRegistry(8000);

			registry.bind("aMinhaColecao", obj);

		}
		catch (Exception e){
			System.err.println("Ocorreu um erro:");
			e.printStackTrace();
		}
	}
}