package ex5;

import java.util.Random;

public class Triangulo {
	//Attributes
	public int altura;
	public int largura;
	public double diagonal;
	public ex5.position position;
	public int x,y;
	

	public Triangulo(){
		Random rand = new Random();
		this.altura = rand.nextInt(10);
		this.largura = rand.nextInt(20);
		this.diagonal = Math.sqrt(altura*altura+largura*largura);
		position posi = new position();
		this.x = posi.x;
		this.y = posi.y;
	}
	
		
	
	public int calculaArea(int altura, int largura){
		return altura*largura/2;
	}
	
	public String toString(){
		return "T";
	}

	public double distancia(Retangulo outroPol){
		double dx = this.x - outroPol.x; 
		double dy = this.y - outroPol.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public boolean isBiggerThan(Retangulo tri){
		int area1 = calculaArea(this.altura, this.largura );
		int area2 = calculaArea(tri.altura, tri.largura );
		if(area1>area2){
			return true;
		}
		else{
			return false;
		}
	}
}