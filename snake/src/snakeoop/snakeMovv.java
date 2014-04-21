package snakeoop;
public class snakeMovv {
	public String segcar = null;
	
	public snakeMovv(sNake snak, int movv){
		if(movv== 8){
			snak.x = snak.x-1;
		}
		else if(movv == 6){
			snak.y = snak.y+1;
		}
		else if(movv == 5){
			snak.x = snak.x+1;
		}
		else if(movv == 4){
			snak.y = snak.y-1;
		}
	}
}

