package ex2;

import java.util.Scanner;
import java.util.Random;

public class Pessoa {
	
	public static void main(String[] args){
		Pessoa p1 = new Pessoa("Jose ", 20, 0);
		Pessoa p2 = new Pessoa("Antonio ",45,253546852);
		
		if(p1.mobile == 0){
			p1.setTelefone();
		}
		System.out.println("Nome: "+p1.nome + " Idade: "+p1.idade + " Telemove: "+p1.mobile);
		System.out.println("Nome: "+p2.nome + " Idade: "+p2.idade + " Telemove: "+p2.mobile);
		System.out.println("A pessoa mais velha é a p1? " + p1.isOlder(p2)); 
	}

	public  String nome;
	public  int idade;
	public  int mobile;

	public Pessoa(String a, int b, int c){
		
		this.nome = a;
		this.idade = b;
		this.mobile = c;
	}

	public String toString(){
		String s = "";
		s = s +"\n"+ nome+"\n" + idade+ "\n" + mobile;
		return s;
	}
	public String getTelefone(){
		String m = "";
		return m + mobile;
	}

	public int setTelefone(){
		if(mobile > 0 ){
			System.out.println("Alterar numero de telefone: ");
			Scanner nmobile = new Scanner(System.in);
			mobile = nmobile.nextInt();
			return mobile;
		}
		else{
			System.out.println("Sera gerado um numero de telefone aleatorio ");
			Random rand = new Random();
			this.mobile = rand.nextInt((999999999 - 100000000) + 1) + 100000000;
			return mobile;
		}

	}

	public boolean isOlder(Pessoa outraPessoa){

		if(this.idade > outraPessoa.idade){
			return true;
		}
		else{
			return false;
		}
	}
}

