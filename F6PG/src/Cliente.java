
import java.io.IOException;
import java.rmi.ConnectException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner scan = new Scanner (System.in);

		String a;
		String operacao;

		try
		{
			while (true){
				System.out.println("Escolha a operacao:\n1 - Adicionar 1 veiculo;\n2 - Adicionar varios veiculos;\n3 - Remover Veiculos;\n4 - Ver Lista;\n5 - Sair.");
				System.out.println("Inserir o tipo de operacao:");
				operacao = scan.nextLine();
				scan.nextLine();


				Registry registry = LocateRegistry.getRegistry("localhost", 8000);

				
				I myCol = (I) registry.lookup("aMinhaColecao");

				if (operacao.equals("1")){

					System.out.println("Inserir matricula");
					a = scan.nextLine();
					Operands Op = new Operands(a);
					scan.nextLine();
					myCol.addone(Op);

					if(myCol.addone(Op) == true){
						System.out.println("adicionado");
					}
					else{
						System.out.println("ja existe");
					}

				}
				else if (operacao.equals("2")){
					boolean cont = true;

					while(cont==true){
						System.out.println("Inserir matricula");
						a = scan.nextLine();
						Operands Op = new Operands(a);
						scan.nextLine();
						myCol.addone(Op);
						if(myCol.addone(Op) == true){
							System.out.println("adicionado");
						}
						else{
							System.out.println("ja existe");

							System.out.println("Deseja adicionar mais? S/N");
							String val = scan.nextLine();
							if(val=="S"){
								continue;
							}
							else if(val=="N"){
								cont = false;
								break;
							}
						}
					}
				}
				else if (operacao.equals("3")){
					System.out.println("Inserir matricula a remover");
					a = scan.nextLine();
					Operands Op = new Operands(a);
					scan.nextLine();
					myCol.remove(Op);
					if(myCol.addone(Op) == true){
						System.out.println("removido");
					}
					else{
						System.out.println("nao existe");
					}
				}

				else if (operacao.equals("5")){
					System.exit(0);
				}
				else if (operacao.equals("4")){
					ArrayList<Operands> list = myCol.getArrayOps();
					System.out.println(list);
				}
			}
		}


		catch(ConnectException e){
			System.err.println("Ocorreu um erro na ligacao! ");
		}
		catch(NotBoundException e2){
			System.out.println("Ocorreu um erro!");
		}
		catch (IOException e1) {
			System.err.println("Ocorreu um erro!");
		}
	}
}