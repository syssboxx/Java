import java.util.ArrayList;
import java.util.Scanner;


public class _03TrancheMaximalMatrice {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String arigs[]){
		
		ArrayList<Integer> maxConsecutifList = new ArrayList<Integer>();
		
		//initialisation, validation et affichage de la matrice
		System.out.println("Saisie de la matrice : ");
		String matrice = scan.nextLine();
		
		String lignes[] = matrice.split(" {1,}");
		char elements[]=new char[lignes.length];
		boolean invalide=false;
		boolean invalideDim=false;
		
		System.out.println("Matrice saisie :");
		
		for (int i = 1; i < lignes.length; i++) {
			if (lignes[i-1].length()!=lignes[i].length()){
				invalideDim=true;
			}
		}
		
		for (int i = 0; i < lignes.length; i++) {
			System.out.println(lignes[i]);
			elements=lignes[i].toCharArray();
							
			int compteur=0;
			int compteur2=0;
			int maxCompteur2=0;
			
			for (char c : elements) {
				//System.out.println(c);
				if (c!='1' && c!='0'){
					invalide =true;
				}
				
				//tranches maximales de 1 non consecutives
				if (c=='1'){
					compteur++;
				}
			}
			//tranches maximales consecutives de 1
			for (int j = 0; j < elements.length-1; j++) {
				
				if ((elements[j]=='1')&&(elements[j]==elements[j+1])){
					if (compteur2==0){
						compteur2++;
					}
					compteur2++;
					if (maxCompteur2 < compteur2){
						maxCompteur2 = compteur2;
					}
				}
				else{
					compteur2=0;
				}
				
			}
			maxConsecutifList.add(maxCompteur2);
			//maxConsecutifList.add(compteur);
			
		}
				
		//tester la validite
		
		if (matrice.isEmpty()){
			System.out.println("Matrice vide!");
		}
		else if (invalide){
			System.out.println("Matrice invalide, seulement '1' , '0' et ' ' admis!");
		}
		else if (invalideDim){
			System.out.println("Matrice invalide, lignes de longueurs differentes!");
		}
		else if (maxConsecutifList.size()==0){
			System.out.println("Pas de lignes avec des 1!");
		}
		else{
			System.out.println("Ligne(s) avec le plus de 1 consecutifs:");
		}
		
		for (int i = 0; i < maxConsecutifList.size(); i++) {
			System.out.printf("ligne %d : nombre de 1 consecutifs - %d %n",i,maxConsecutifList.get(i));
		}
		
	}
}
