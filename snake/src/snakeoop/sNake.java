package snakeoop;

public class sNake {
	int x,y;
	String car = null;
	public sNake(){
		posicao posi = new posicao();
		this.x = posi.x;
		this.y = posi.y;
		this.car = "O";
	}
}
