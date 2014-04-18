package ex5;

import java.util.Random;


public class Retangulo {
	//atributos
	public int altura;
	public int largura;
	public ex5.position position;
//ver posicao
	public int x;
	public int y;

	public Retangulo(){
		Random rand = new Random();
		this.altura = rand.nextInt(10) + 1;
		this.largura = rand.nextInt(20)+1;
		position posi = new position();
		this.position = posi;
	}
	
	public int calculaArea(int altura, int largura){
		int area = altura*largura;
		return area;
	}
	public String toString(){
		return "R";
	}

	public double distancia(Triangulo tri){
		double dx = this.x - tri.x; 
		double dy = this.y - tri.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
}
