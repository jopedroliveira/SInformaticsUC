package snakeoop;

import java.util.Scanner;

public class snakeMove {
	int x,y;

	public snakeMove(sNake snake){
		String up = "w";
		String left = "a";
		String righ = "d";
		String down = "s";
		//int TTL = 3;
		//int TTLbonus = 3;
		
		Scanner com = new Scanner(System.in);
		String mov = com.nextLine();

		if(mov == up){
			this.y = snake.y+1;
		}
		else if(mov == down){
			this.y=snake.y-1;
		}
		else if(mov == left){
			this.x = snake.x-1;
		}
		else if(mov == righ){
			this.x = snake.x+1;
		}
	}
}

