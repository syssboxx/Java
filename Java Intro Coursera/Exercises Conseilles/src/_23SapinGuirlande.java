import java.util.Scanner;


public class _23SapinGuirlande {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		char[][] triangle;
		int lignes;
		char symbole;
		String guirlande;
		
		
		System.out.println("Quel symbole voulez-vous pour les épines du sapin? ");
		symbole = scanner.next().charAt(0);
		
		do{
			System.out.println("Combien de lignes (de 8 a 35)?");
			lignes=scanner.nextInt();
		}while(lignes<8 || lignes>35);
		
		do{
			System.out.print("Quelles guirlandes voulez-vous mettre (taille de 3 a 25 caractères et elles  ne peuvent pas " +
					            "contenir le même caractère que celui utilisé pour les épines)?");
			guirlande=scanner.next();
		}while( (guirlande.length()<3) || (guirlande.length()>25) || (guirlande.contains(Character.toString(symbole))) );
		
		System.out.println();
		
		triangle = new char[lignes][];
		remplirTriangle(triangle,symbole);
		mettreGuirlandes(triangle,guirlande);
		afficherTriangle(triangle);
		afficherTronc(triangle);

	}
	
	private static void remplirTriangle(char[][] triangle, char c) {
		int lignes = triangle.length;
		int colonnes;
		for (int i = 0; i < lignes; i++) {
			colonnes=2*i+1;
			triangle[i]=new char[colonnes];
			for (int j = 0; j < colonnes; j++) {
				triangle[i][j]=c;
			}
		}
	}
	
	private static void afficherTriangle(char[][] triangle) {
		int lignes=triangle.length;
		int colonnes;
		int espaces;
		
		for (int i = 0; i < lignes; i++) {
			espaces=((lignes*2-1)-(2*i+1))/2;
			for (int j = 0; j < espaces; j++) {
				System.out.print(" ");
			}
			colonnes=triangle[i].length;
			for (int j = 0; j < colonnes; j++) {
				System.out.print(triangle[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private static void afficherTronc(char[][] triangle) {
		int lignes= triangle.length;
		int hauteur = lignes/3;
		int largeur = (lignes*2-1)/5;
		
		
		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j < ((lignes*2-1)-3)/2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < largeur; j++) {
				System.out.print("|");
			}
			System.out.println();
		}
		
	}
	
	private static int random(){
		int val=(int)(Math.random()*2);//0 ou 1
		return (val+2);
	}
	
	private static void mettreGuirlandes(char[][] triangle, String guirlande) {
		int lignes=triangle.length;
		int longueurChaine=guirlande.length();
		int indiceGuirlande=0;
		
		boolean finGuirlande=false;
		//varier les indices de debuts de guirlande
		int i=0;
		int j=0;
		
		while(i<lignes){
			//verifier si ligne impaire et si la guirlande est completee
			if (lignes%2==1 || finGuirlande){
				triangle[i][j]=guirlande.charAt(indiceGuirlande);
				indiceGuirlande=(indiceGuirlande+1)%longueurChaine;
				
				if ((j >= triangle[i].length-1 && indiceGuirlande!=0) || finGuirlande ){
					if (indiceGuirlande==0){
						finGuirlande=false;
						//incrementer j de valeur aeatoire
						j = j + random() + 1;
					}
					else{
						//3 cas 
						//1 on change de ligne
						//2 ligne paire - on rempli de droite a gauche
						//3 ligne impaire - on rempli de gauche a droite, cas de longues guirlandes
						
						if (!finGuirlande){
							finGuirlande=true;
							i++;
							
							if (i<lignes){
								j=triangle[i].length-1;
							}
							else if (i%2==0){
								j--;
								if (j<0){
									i++;
									j=0;
								}
							}
							else{
								j++;
								if (j>triangle[i].length){
									i++;
									if (i>lignes){
										j=triangle[i].length-1;
									}
								}
							}
						}
					}
				}
				else{
					//else de la condition 
				    //(j >= triangle[i].length - 1 && indiceGuirlande != 0) || completerGuirlande)
					
						if (indiceGuirlande==0){
							j+=random();
						}
						j++;
					}
				//finalement on fait la vérification finale, qui incrémente la ligne et remet j à zéro si nécessaire
				if (i<lignes && j<= triangle[i].length && indiceGuirlande ==0){
					i++;
					j=0;
				}
			}
			else{
				//si la ligne n'était pas paire, on incrémente la ligne
				j=0;
				i++;
			}
		}
	}
}
