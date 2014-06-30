//tests

//Otto
//Elu par cette crapule
//Esope reste ici et se repose
//Tu l'as trop ecrase, Cesar, ce Port-Salut
//A man, a plan, a canal, Panama

//Cours de Java
//Le pont de la rivière Kwai

import java.util.Iterator;
import java.util.Scanner;


public class _16Palindromes {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Entrez un mot ou une phrase : ");
		String texte = scan.nextLine().toLowerCase();
		String epure="";
		boolean palindrome =false;
		
		//supprimer les symboles non alphabetiques
		for (int i = 0; i < texte.length(); i++) {
			char ch = texte.charAt(i);
			if (!Character.isLetter(ch)){
				ch=' ';
			}
			epure+=ch;
		}
		//supprimer toutes les espaces vides
		epure=epure.replaceAll("\\s", "");
		//System.out.println(epure);
			
		//verfier si le mot est un palidrome
		for (int i = 0; i < epure.length()/2; i++) {
			if (epure.charAt(i)==epure.charAt(epure.length()-i-1)){
				palindrome=true;
			}
		}
		if (palindrome){
			System.out.println("C'est un palindrome !");
		}
		else{
			System.out.println("Ce n'est pas un palindrome !");
		}
			
		

	}

}
