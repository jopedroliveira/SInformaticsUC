package ex2;

import ex2.Pessoa;

public class teste {
	public static void main(String[] args){
		Pessoa p1 = new Pessoa("Joaquim ", 98, 85555223);
		Pessoa p2 = new Pessoa("Antonio ",45,253546852);
		
		if(p1.mobile == 0){
			p1.setTelefone();
		}
		if(p2.mobile == 0){
			p2.setTelefone();
		}
		
		System.out.println("Nome: "+p1.nome + " Idade: "+p1.idade + " Telemove: "+p1.mobile);
		System.out.println("Nome: "+p2.nome + " Idade: "+p2.idade + " Telemove: "+p2.mobile);
		System.out.println("A pessoa mais velha é o " + p1.nome +" ? " + p1.isOlder(p2)); 

	}
}
