package snakeoop;

public class corpoMove {

	public corpoMove(corposnakecriar[] corpom, sNake snakeantiga, String[][] mapax){
		int m = corpom.length-1;
		int reservax = 0;
		int reservay = 0;
		//boolean controlo = true;
		while( m > 0){
			/*if(m ==(corpom.length-1) && corpom[m].x < 11){
				mapax[corpom[m].x][corpom[m].y] = ".";
			}*/

			if(corpom[0].car =="o"){
				corpom[0].x = snakeantiga.x;
				corpom[0].y = snakeantiga.y;
			}
			if(corpom[m].car == "o"){
				
				/*if(corpom[m].x<80){
					mapax[corpom[m].x][corpom[m].y] = ".";
				}*/
				
				corpom[m].x = corpom[m-1].x;
				corpom[m].y = corpom[m-1].y;
				if(corpom[m].x<80){
					mapax[corpom[m].x][corpom[m].y] = "#";
					mapax[corpom[0].x][corpom[0].y] = corpom[0].car;
				}
			
				
				m = m-1;
			}
			else{
				m = m-1;
			}
			
		}
	}
}
