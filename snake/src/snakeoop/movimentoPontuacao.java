package snakeoop;

import java.util.Scanner;

public class movimentoPontuacao {
	
	
	public movimentoPontuacao(String[][] mapaxx, sNake snakk, int ttll, int ttllb){
		Scanner com = new Scanner(System.in);
		int mov = com.nextInt();
		mapaxx[snakk.x][snakk.y]=".";
		new snakeMovv(snakk, mov);
		if(snakk.x==10 || snakk.x ==-1 || snakk.y == -1 || snakk.y == 20){
			System.out.println("Saiste do limite :( ");
		}
		if(mapaxx[snakk.x][snakk.y] =="."){
			mapaxx[snakk.x][snakk.y] = snakk.car;
			ttll = ttlllb(ttll, ttllb);
			System.out.println("ttll atual: "+ttll);
			new printMapa(mapaxx);
		}
		else if(mapaxx[snakk.x][snakk.y] == "c"){
			mapaxx[snakk.x][snakk.y] = snakk.car;
			ttll = ttlll(ttll);
			new printMapa(mapaxx);
		}
		else{
			System.out.println("Ohh morreste!");
			ttll = -1;
		
		}
	
	if(ttll <= 0){
		System.out.println("Ohh acabaste com o teu ttll");

	}
	}
	
	public static int ttlll(int ttllll){
		return ttllll-1;
	}
	public static int ttlllb(int ttllllb, int ttlll){
		return ttllllb +ttlll;
	}
}
