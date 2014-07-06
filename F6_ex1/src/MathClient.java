
import java.rmi.ConnectException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class MathClient
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc= new Scanner(System.in);
		int a;
		int b;
		String op;
		
		while(true)
		{

			int result=0;

			
			try
			{
				// Returns a reference to the remote object Registry on the specified host and port.
				Registry registry = LocateRegistry.getRegistry("localhost", 8000);
			
				// 'lookup' returns the remote reference bound to the specified name in this registry.
				IMath myCalc = (IMath) registry.lookup("aMinhaCalculadoraDistribuida");

				//let's execute our remote operation and keep the return value in 'result'!
				System.out.print("Inteiro a: ");
				a=sc.nextInt();
				sc.nextLine();
				System.out.print("Operacao: ");
				op=sc.nextLine();
				System.out.print("Inteiro b: ");
				b=sc.nextInt();
				
				if(op.equals("+"))
				{
					result = myCalc.add(a, b);
				}
				else if(op.equals("-"))
				{
					result = myCalc.sub(a, b);
				}
				else if(op.equals("*"))
				{
					result = myCalc.mult(a, b);
				}
				else if(op.equals("/"))
				{
					result = myCalc.div(a, b);
				}
				
				System.out.println("result: " + result);
				
			}
			catch (ConnectException e) // catching Exception means that we are handling all errors in the same block
			{                   // usually it is advisable to use multiple catch blocks and perform different error handling actions
		                    	// depending on the specific exception type caught
				System.err.println("Ocorreu um erro: ");
				//e.printStackTrace(); // prints detailed information about the exception

				Thread.sleep(3000); // sleeps for 3 seconds
				System.out.println("Dormindo...");
				/*catch (InterruptedException e1)
				{
				// do nothing
				}*/
			}
			
			catch(Exception e1)
			{
				System.err.println("Ocorreu um erro2: ");
			}
		}
		
	}
}