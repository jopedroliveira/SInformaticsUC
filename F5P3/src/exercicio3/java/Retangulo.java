package exercicio3.java;

import java.util.Random;

public class Retangulo {
	
	public static void main(String[] args){
		Retangulo Retang0 = new Retangulo();
		//Retangulo Retang1 = new Retangulo();
		System.out.println("altura: "+ Retang0.altura+" largura: "+ Retang0.largura +" area: "+ Retang0.calculaArea(Retang0.altura, Retang0.largura));
		
	}
	
		
	//atributos
	public int altura;
	public int largura;
	public double posicaox;
	public double posicaoy;
	
	public Retangulo(){
		this.altura = 10;
		this.largura = 20;
		this.posicaox = 0.0;
		this.posicaoy = 0.0;
	}
	
	public Retangulo(int altura, int largura, double posicaox, double posicaoy){
		this.altura = altura;
		this.largura = largura;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public double getPosicaox() {
		return posicaox;
	}

	public void setPosicaox(double posicaox) {
		this.posicaox = posicaox;
	}

	public double getPosicaoy() {
		return posicaoy;
	}

	public void setPosicaoy(double posicaoy) {
		this.posicaoy = posicaoy;
	}
	
	public int calculaArea(int altura, int largura){
		int area = altura*largura;
		return area;
	}
	
	public double distancia(Retangulo outroRetangulo){
		double dx = this.posicaox - outroRetangulo.posicaox;
		double dy = this.posicaoy - outroRetangulo.posicaoy;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public boolean isBiggerThan(Retangulo outroRetangulo){
		int area1 = calculaArea(this.altura, this.largura );
		int area2 = calculaArea(outroRetangulo.altura, outroRetangulo.largura );
		if(area1>area2){
			return true;
		}
		else
			return false;
		}



}

