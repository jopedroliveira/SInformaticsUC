package ex5;

public class mapa{
	public static void main(String[] args){
	int I_MAX = 10;
	int J_MAX = 20;

	for(int i =0; i<I_MAX; i++){
		if(i==0){
			System.out.print("\n\n");
		}
		for(int j = 0 ; j<J_MAX; j++){
			if(j==0){
				System.out.print("   ");
			}
			System.out.print(".");
		}
		System.out.print("\n");

	}
	}
}
