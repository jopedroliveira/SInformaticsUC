package ex5;

import java.util.Random;

public class position {
	public int x,y;
	
	public position(){
		Random rand = new Random();
		this.x = rand.nextInt(10) + 1;
		this.y = rand.nextInt(10) + 1;
	}


}
