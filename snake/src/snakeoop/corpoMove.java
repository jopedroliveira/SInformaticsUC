package snakeoop;

public class corpoMove {

	public corpoMove(corposnakecriar[] corpom, sNake snakeantiga, String[][] mapax, int m){
		m = m-1;
		for(int i = 0; i<mapax.length; i++){
			for(int j =0; j<mapax[0].length; j++){
				if(mapax[i][j]=="o"){
					mapax[i][j] = ".";

				}
			}
		}
		
		while( m > 0){
			if(corpom[0].car =="o"){
				corpom[0].x = snakeantiga.x;
				corpom[0].y = snakeantiga.y;
			}
			
			if(corpom[m].car == "o"){
				corpom[m].x = corpom[m-1].x;
				corpom[m].y = corpom[m-1].y;
				
				if(corpom[m].y<80){
					mapax[corpom[m].x][corpom[m].y] = corpom[m].car;
					mapax[corpom[0].x][corpom[0].y] = corpom[0].car;
				}
			
				
				m = m-1;
			}
						
		}
	}
}

