package snakeoop;

import java.util.Scanner;

public class sNake {
	int x,y;
	String car = null;
	public sNake(){
		posicao posi = new posicao();
		this.x = posi.x;
		this.y = posi.y;
		this.car = "O";
	}
	
	public static void snakemove(sNake snak,String mov){
		System.out.println(mov);
		String up = "w";
		String left = "a";
		String righ = "d";
		String down = "s";
		
		
		if(mov == up){
			snak.y = snak.y+1;
		}
		else if(mov == down){
			snak.y=snak.y-1;
		}
		else if(mov == left){
			snak.x = snak.x-1;
		}
		else if(mov == righ){
			snak.x = snak.x+1;
		}
	}

}
