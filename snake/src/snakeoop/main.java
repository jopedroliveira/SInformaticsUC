package snakeoop;

public class main {
	public static void main(String[] args){
		System.out.println("Snake\n");
		//Criar Mapa
		String[][] mapa = new String[10][20];
		for(int i = 0; i< mapa.length; i++){ 
			for(int j = 0; j<mapa[0].length;j++){
				mapa[i][j]= ".";
			}
		}
		//Criar criarObjeto e saida
		criarObjeto S =null;
		for(int xx=0; xx<11; xx++){
			
			if(xx < 10){
				criarObjeto obs = new criarObjeto();
				mapa[obs.x][obs.y] = "X";
			}
			else{
				criarObjeto obs = new criarObjeto();
				S = obs; 
				mapa[obs.x][obs.y] = "S";
			}
		}
		
		
		//Criar inimigos
		criarObjeto inimigo[] = new criarObjeto[3];
		for(int zz =0; zz< inimigo.length; zz++){
			criarObjeto inim = new criarObjeto();
			inimigo[zz] = inim;
		} 
		for(int a =0; a<3; a++){
			if(mapa[inimigo[a].x][inimigo[a].y] == "."){
				mapa[inimigo[a].x][inimigo[a].y] = "I";
			}
		}

		//Criar comida
		for(int zzz = 0 ;zzz< 3;zzz++){
			criarObjeto comi = new criarObjeto();
			boolean b = false;					//Servira para evitar que c caia num sitio que nao e livre
			while(b==false){
				if(mapa[comi.x][comi.y]=="."){
					mapa[comi.x][comi.y] = "c";
					b=true;
				}
			}
		}

		new printMapa(mapa);
	}
}
