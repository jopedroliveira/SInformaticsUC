package snakeoop;

public class corpo_add {

	public corpo_add(corposnakecriar[] corpom, int tlb){
		for(int t = 0; t < corpom.length; t++){
			if(corpom[t].car == "K" & tlb >0){
				if(tlb == 0){
					break;
				}
				corpom[t].car = "o";
				tlb = tlb-1;
				
			}
			else{
				break;
			}
		}
		/*System.out.println("teste do corpo:"+ corpom[0].car + " tl: "+tlb);
		System.out.println("teste do corpo:"+ corpom[1].car + " tl: "+tlb);
		System.out.println("teste do corpo:"+ corpom[2].car + " tl: "+tlb);*/
	}
}
