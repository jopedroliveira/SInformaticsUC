package ex5;

import java.util.Random;

public class Triangulo {
	//atributos
	public int altura;
	public int largura;
	public double diagonal;
	public ex5.position position;

	public Triangulo(){
		Random rand = new Random();
		this.altura = rand.nextInt(10) + 1;
		this.largura = rand.nextInt(20)+1;
		this.diagonal = Math.sqrt(altura*altura+largura*largura);
		position posi = new position();
		this.position = posi;
		
	}
	public int calculaArea(int altura, int largura){
		int area = altura*largura/2;
		return area;
	}
	
	public String toString(){
		return "T";
	}

	public double distancia(Retangulo outroPol){
		double dx = this.x - outroPol.x; 
		double dy = this.y - outroPol.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
}