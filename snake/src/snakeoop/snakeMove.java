package snakeoop;


public class snakeMove {
	
	public snakeMove(sNake snak, String mov){
		System.out.println("mov:" +mov);
		if(mov=="a"){
			snak.x = snak.x+1;
			System.out.println("chegou ao a+");
		}
		
		/*if(mov == "w"){
			snak.y = snak.y+1;
		}
		if(mov == "s"){
			//this.y=snak.y-1;
		}*/
		/*
		if(mov == "d"){
			//this.x = snak.x+1;
		}*/
		System.out.println(snak.x);
	}
}
