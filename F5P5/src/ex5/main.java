package ex5;

import java.util.Scanner;
import java.util.Random;

public class main {
	
	public static void main(String[] args){
				
		//UX
		System.out.print("poligonos a ser gerados ");
		Retangulo ret = new Retangulo();
		Triangulo tri = new Triangulo();
		
		//distancia
		double dis = ret.distancia(tri);
		System.out.print("\nDistancia entre os poligonos: "+dis);
			
		//mapa
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
