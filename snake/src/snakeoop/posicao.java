package snakeoop;

import java.util.Random;

public class posicao {
	
	public int x,y;
	
	public posicao(){
		Random rand = new Random();
		this.x = rand.nextInt(10);
		this.y = rand.nextInt(20);
	}
}
