package test;

import calc.calculadora;

public class exercicio51 {
	public static void main(String[] args){

		double a = 9;
		double b = 2;
		System.out.println("soma: " + (double) calculadora.soma(a,b));
		System.out.println("subtraccao: " + (double) calculadora.sub(a,b));
		System.out.println("multiplicacao: " + (double) calculadora.mult(a,b));
		System.out.println("divisao: "+ calculadora.div(a,b));
	}
}