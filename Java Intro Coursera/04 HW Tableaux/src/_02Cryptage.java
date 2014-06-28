import java.util.Scanner;


public class _02Cryptage {

	private static Scanner scan = new Scanner(System.in);
	static final String ALPHABET="abcdefghijklmnopqrstuvwxyz";
	static final int  DECALAGE=4;
	
	public static void main(String[] args) {

		String s, aCoder="";
		String chaineCodee="";
		System.out.println("Veuillez entrer une chaine de caracteres : ");
		s=scan.nextLine();
		
		System.out.printf("La chaine initiale etait :%s%n",s);
		
		for (int i = 0; i < s.length(); i++) {
			int index= ALPHABET.indexOf(s.charAt(i));
			if (s.charAt(i)==' '){
				aCoder+=' ';
				chaineCodee+=' ';
			}
			else if (index>-1){
				aCoder+=s.charAt(i);
				//codage
				int newIndex=(index+DECALAGE)%ALPHABET.length();
				chaineCodee+=ALPHABET.charAt(newIndex);
			}
				
		}
				
		aCoder= aCoder.trim();
		if (aCoder.isEmpty()){
			System.out.println("La chaine à coder est vide.");
		}
		else{
			System.out.println("La chaine a coder est :"+aCoder);
			System.out.print("La chaine codee est : "+chaineCodee);
			}
			
	}
}
