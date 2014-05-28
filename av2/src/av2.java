import java.util.Scanner;

public class av2 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		boolean validation = true;
		boolean a_=false;
		double a = 0;
		double b = 0;
		double x1=0;
		int it = 0;
		double eps = 0;
		double var = 0;
		double x2=0;
		double s=0;
		double dif=0;
		double dif1=0;
		double t=0;
		double z=0;
		s=10;


		//input de a e validação
		System.out.print("\nValor de a: ");
		a_ = sc.hasNextDouble();
		while(a_ != true){
			sc.nextLine();
			System.out.print("\nInsira novamente o valor de a: ");
			a_ = sc.hasNextDouble();
			
		}
		a = sc.nextDouble();
		
		//input de b e validação
		System.out.print("\nValor de b: ");
		boolean b_ = sc.hasNextDouble();
		while(b_ != true){
			sc.nextLine();
			System.out.print("\nInsira novamente o valor de b: ");
			b_ = sc.hasNextDouble();

		}
		b = sc.nextDouble();

		//input de x1 e validação
		System.out.print("\nValor da posicao inicial (x1): ");
		boolean x1_ = sc.hasNextDouble();
		while(x1_ != true){
			sc.nextLine();
			System.out.print("\nInsira novamente o valor de x1: ");
			x1_ = sc.hasNextDouble();

		}
		x1 = sc.nextDouble();
		
		//input de it e validação
		System.out.print("\nNumero maximo de iteracoes(it): ");
		boolean it_ = sc.hasNextInt();
		while(it_ != true){
			sc.nextLine();
			System.out.print("\nInsira novamente o valor de it: ");
			it_ = sc.hasNextInt();

		}
		it = sc.nextInt();
	
		//input de eps e validação
		System.out.print("\nValor do passo de validacao(eps): ");
		boolean eps_ = sc.hasNextDouble();
		while(eps_ != true && sc.nextDouble() > 0 && sc.nextDouble() <= 0.1){
			sc.nextLine();
			System.out.print("\nInsira novamente o valor de eps: ");
			eps_ = sc.hasNextDouble();
		}
		eps = sc.nextDouble();
		

		//input de var e validação
		Scanner vr = new Scanner(System.in);
		System.out.print("\nValor da variacao insignificante(var): ");
		boolean var_ = vr.hasNextDouble();
		while(var_ != true){
			vr.nextLine();
			System.out.print("\nInsira novamente o valor de var: ");
			var_ = vr.hasNextDouble();

		}
		var = vr.nextDouble();
		
		for (int i = 1; i <= it; i++){

			x2 = x1-eps*(2*a*x1+b);
			dif = Math.abs(x2-x1);
	
			if (i==2){
				dif1= Math.abs(x2-x1);
			}
			if (x2-x1<=var){	
				
				break;
			}
			System.out.print("It" + i +  "Variação=" + dif);
	
			x1=x2;
		}
	}
}

	