import java.util.Scanner;


public class _02DevinerQui3Questions {

	public static Scanner scaner=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Pensez a un personnage : Mlle Rose, ");
        System.out.println("le Professeur Violet, le Colonel Moutarde,");
        System.out.println("le Reverend Olive ou Mme Leblanc.\n");
        
        System.out.print("Est-ce que votre personnage est un homme : ");
        System.out.print("(true : oui, false : non) ");
        boolean homme = scaner.nextBoolean();
        
        if(homme){
        	System.out.print("Votre personnage a-t-il des moustaches ? ");
            System.out.print("(true : oui, false : non) ");
            boolean moustaches = scaner.nextBoolean();
            
            if (moustaches){
            	System.out.print("==> Le personnage auquel vous pensez est ");
            	System.out.print("le Colonel Moutarde");
            }
            else {
            	System.out.print("Votre personnage a-t-il du chapeau ? ");
                System.out.print("(true : oui, false : non) ");
                boolean chapeau = scaner.nextBoolean();
                
                if(chapeau){
                	System.out.print("==> Le personnage auquel vous pensez est ");
               	 	System.out.print("le Professeur Violet");
                }
                else{
                	System.out.print("==> Le personnage auquel vous pensez est ");
               	 	System.out.print("le Reverend Olive");
                }
            }
            	 
        }
        else{
            	//une femme
            	System.out.print("Votre personnage a-t-il des lunettes ? ");
                System.out.print("(true : oui, false : non) ");
                boolean lunettes = scaner.nextBoolean();
                
                if (lunettes){
                	System.out.print("==> Le personnage auquel vous pensez est ");
                	System.out.print("Mme Leblanc");
                }
                else{
                	System.out.print("==> Le personnage auquel vous pensez est ");
                	System.out.print("Mlle Rose");
                }
            	
            }
        
                	
        System.out.println();

	}

}
