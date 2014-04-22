package snakeoop;

import java.util.Random;

public class inimigoMover {
	private criarObjeto[] recurso = new criarObjeto[3];
	public inimigoMover(criarObjeto[] inimigu, String[][] mapax){
		recurso = inimigu;
		for(int i = 0; i<mapax.length; i++){
			for(int j =0; j<mapax[0].length; j++){
				if(mapax[i][j]=="I"){
					mapax[i][j] = ".";
				}
			}
		}
		
		Random rand = new Random(); 
		for(int d=0; d<inimigu.length;d++){
			if(inimigu[d].x>0 && inimigu[d].y > 0){
				inimigu[d].x = inimigu[d].x + (rand.nextInt(2)-1);
				inimigu[d].y = inimigu[d].y + (rand.nextInt(2)-1);
			}
			else if(inimigu[d].x == 0){
				inimigu[d].x = inimigu[d].x + (rand.nextInt(1));
				inimigu[d].y = inimigu[d].y + (rand.nextInt(2)-1);
			}
			else if(inimigu[d].y == 0){
				inimigu[d].y = inimigu[d].y + (rand.nextInt(1));
				inimigu[d].x = inimigu[d].x + (rand.nextInt(2)-1);
			}
			else{
				inimigu[d].x = inimigu[d].x + (rand.nextInt(1));
				inimigu[d].y = inimigu[d].y + (rand.nextInt(1));
			}
			
			if(mapax[inimigu[d].x][inimigu[d].y]=="." && inimigu[d].x>=0 && inimigu[d].y>=0){
				mapax[inimigu[d].x][inimigu[d].y]="I";
			}
			else{
				inimigu[d]= recurso[d];
				mapax[inimigu[d].x][inimigu[d].y]="I";
			}
		}
	}

}
