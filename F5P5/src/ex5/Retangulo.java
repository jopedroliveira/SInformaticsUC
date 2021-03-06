package ex5;

import java.util.Random;



public class Retangulo {
	//Attributes
	public int altura;
	public int largura;
	public ex5.position position;
	public int x,y;

	public Retangulo(){
		Random rand = new Random();
		this.altura = rand.nextInt(10);
		this.largura = rand.nextInt(20);
		position posi = new position();
		this.x = posi.x;
		this.y = posi.y;
	}
	
	
	public int calculaArea(int altura, int largura){
		int area = altura*largura;
		return area;
	}
	public String toString(){
		return "R";
	}

	public double distancia(Retangulo tria){
		double dx = this.x - tria.x; 
		double dy = this.y - tria.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public boolean isBiggerThan(Triangulo reta){
		int area1 = calculaArea(this.altura, this.largura );
		int area2 = calculaArea(reta.altura, reta.largura );
		if(area1>area2){
			return true;
		}
		else{
			return false;
		}
	}
}