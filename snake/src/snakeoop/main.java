package snakeoop;

import java.util.Scanner;



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
		
		//Criar criarObjetos: obstaculos e saida. 
		criarObjeto said = null;
		for(int xx=0; xx<11; xx++){
			if(xx < 10){
				criarObjeto obs = new criarObjeto();
				mapa[obs.x][obs.y] = "X";
			}
			else{
				criarObjeto saida = new criarObjeto();
				if(mapa[saida.x][saida.y] !="X"){
					mapa[saida.x][saida.y]= "S";
					said = saida;
				}
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


			
		
		//Iniciar jogo
		System.out.println("Press Enter para iniciar.");
		Scanner start = new Scanner(System.in);
		start.nextLine();
		new printMapa(mapa);
		System.out.println("Aqui esta o seu mapa.\nPress Enter para joagar.");
		start.nextLine();

		//Criar a snake
		sNake snake = new sNake();
		boolean bb = false;				
		while(bb==false){
			if(mapa[snake.x][snake.y]=="."){
				mapa[snake.x][snake.y] = snake.car;
				bb=true;
			}
		}
		new printMapa(mapa);
		
		while(mapa[snake.x][snake.y]!="0"){ //adicionar as outra excepcoes pensar usar o try catch
			snake = snakeMove(snake);
			System.out.print(snake.x  +" "+snake.y+"\n");
			new printMapa(mapa);
		}
		//new printMapa(mapa);
	}

	private static sNake snakeMove(sNake snake) {
		// TODO Auto-generated method stub
		return null;
	}
}
