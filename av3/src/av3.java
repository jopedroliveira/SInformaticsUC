
public class av3{
	public static void main(String[] args){

		//matriz chave
		int[][] chave = {
				{ 11, 9, 7, 14, 3, 26, 23, 4, 1, 21, 5, 20, 10, 25, 22, 16, 18, 15, 13, 6, 12, 17, 8, 2, 19, 24 }, 
				{ 6, 15, 7, 14, 23, 3, 16, 21, 10, 9, 20, 17, 18, 1, 24, 26, 2, 4, 12, 8, 5, 11, 25, 19, 13, 22 }, 
				{ 9, 17, 7, 13, 14, 23, 3, 26, 2, 20, 22, 5, 12, 1, 21, 15, 25, 18, 24, 6, 16, 8, 4, 10, 11, 19 }, 
				{ 3, 19, 17, 8, 15, 6, 1, 24, 25, 14, 2, 10, 16, 23, 7, 11, 12, 5, 13, 18, 21, 26, 9, 4, 22, 20 }, 
				{ 9, 16, 6, 17, 13, 12, 23, 20, 25, 4, 24, 15, 10, 19, 21, 7, 18, 8, 22, 26, 5, 1, 14, 2, 11, 3 }};

		//codigo
		String codigo = "mamfcjkm ayzvojáfagvm é i pojxge namgaptayk qu gedlx o tihi i pojxge taywlkwcj ho ghuwhijiçãu";

		
		String[] palavras = codigo.split(" ");
		int tab[] = new int[palavras.length];
		
		//encontrar a primeira vogal de cada palavra
		for (int i = 0; i <palavras.length; i++){
			for(int j = 0; j<palavras[i].length();j++){
				char caracter = palavras[i].charAt(j);
				if(caracter == 'a'){
					tab[i]=0;
					break;}
				else if(caracter == 'e' || caracter == 'é'){
					tab[i]=1;
					break;}
				else if(caracter == 'i'){
					tab[i]=2;
					break;}
				else if(caracter == 'o'){
					tab[i]=3;
					break;}
				else if(caracter == 'u'){
					tab[i]=4;
					break;}
			}
		}
		
		//desencriptacao
		System.out.print("====================== Desencriptacao ======================");
		System.out.print("\n================== Mensagem Desencriptada ==================\n\n\n");
		for (int mm = 0; mm <palavras.length; mm++){
			for(int n = 0; n<palavras[mm].length();n++){
				//int[] guia = new int[palavras[mm].length()];
				int unicode = (int) palavras[mm].charAt(n);
				//System.out.print(unicode);
				unicode = unicode - 96;
				int u = 0;
				if(unicode >= 1 && unicode <= 26){
					while(u<chave[tab[mm]].length){
						if(chave[tab[mm]][u] == unicode){
							int novo_unicode = u +97;
							//String letra = String.valueOf(novo_unicode);
							char des = (char) novo_unicode;
							System.out.print(des);							
							break;}
						else{u++;}	
					}
				}
				//caso seja maior que 26
				else{
					int novo_unicode = unicode + 96;
					char des = (char) novo_unicode;
					System.out.print(String.valueOf(des));}
			}
			System.out.print(" ");}
	}
}