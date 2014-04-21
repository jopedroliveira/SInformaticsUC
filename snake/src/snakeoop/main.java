package snakeoop;

import java.util.Scanner;
import snakeoop.sNake;


public class main {
	public static void main(String[] args){
		int ttl = 555;
		int bonusttl = 3;
		int tl = 0;
		
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
				while(mapa[saida.x][saida.y] != "."){
					saida = new criarObjeto();
				}
				mapa[saida.x][saida.y]= "S";
				said = saida;
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


		//Criar a snake
		sNake snake = new sNake();
		boolean bb = false;				
		while(bb==false){
			if(mapa[snake.x][snake.y]=="."){
				mapa[snake.x][snake.y] = snake.car;
				bb=true;
			}
		}
		
		//Criar matriz do corpo
		corposnakecriar[] corpo = new corposnakecriar[12];
		for(int f =0; f<corpo.length; f++){
			corpo[f]= new corposnakecriar();
		}
		boolean corp = false; //quando for true e sinal que ja ha corpo para moviemntar
		
		//JOGAR
		Scanner com = new Scanner(System.in);
		new printMapa(mapa);
		
		while(ttl>0){
		
			int mov = com.nextInt();
			sNake snakeant = snake;
			mapa[snake.x][snake.y]=".";
			
			if(corpo[0].car=="o"){
				new corpoMove(corpo, snakeant,mapa);
				System.out.println("controlo2: "+corpo[0].x+" "+corpo[0].y);
			}
			
			new snakeMovv(snake, mov);
			
			System.out.println("TTL atual: "+ttl);
			
			//Colisões
			if(snake.x==10 || snake.x ==-1 || snake.y == -1 || snake.y == 20){
				System.out.println("Saiste do limite :( ");
				break;
			}
			if(mapa[snake.x][snake.y] =="."){
				mapa[snake.x][snake.y] = snake.car;
				ttl = ttl-1;
				if(tl>0){
					new corpo_add(corpo, tl);
					tl = tl-1;
				}
				System.out.println("controlo: "+corpo[0].car);
				
				new printMapa(mapa);
			}
			else if(mapa[snake.x][snake.y] == "c"){
				mapa[snake.x][snake.y] = snake.car;
				ttl = ttl+bonusttl;
				tl = 3;
				corp = true;
				new printMapa(mapa);
			}

			else if(mapa[snake.x][snake.y] == "S"){
				System.out.println("GANHASTE!");
			}
			else{
				System.out.println("Ohh morreste!");
				ttl = -1;
				break;
			}
		}
		if(ttl == 0){
			System.out.println("TTL atual:0 \nOhh acabaste com o teu TTL");
		}
		if(corp == true){
			
		}

	}
}

