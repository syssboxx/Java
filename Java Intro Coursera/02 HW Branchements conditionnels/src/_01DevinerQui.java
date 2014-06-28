import java.util.Scanner;


public class _01DevinerQui {

	public static Scanner scaner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Pensez a un personnage : Mlle Rose, ");
        System.out.println("le Professeur Violet, le Colonel Moutarde,");
        System.out.println("le Reverend Olive ou Mme Leblanc.\n");
        
        System.out.print("Votre personnage a-t-il des moustaches ? ");
        System.out.print("(true : oui, false : non) ");
        boolean moustaches = scaner.nextBoolean();
        
        System.out.print("Votre personnage a-t-il des lunettes ? ");
        System.out.print("(true : oui, false : non) ");
        boolean lunettes = scaner.nextBoolean();
        
        System.out.print("Votre personnage a-t-il du chapeau ? ");
        System.out.print("(true : oui, false : non) ");
        boolean chapeau = scaner.nextBoolean();
        
        System.out.print("Votre personnage est-il un homme ? ");
        System.out.print("(true : oui, false : non) ");
        boolean homme = scaner.nextBoolean();
        
        System.out.print("==> Le personnage auquel vous pensez est ");
        
        if(chapeau){
        	System.out.print("le Professeur Violet");
        }
        else if (moustaches){
        	System.out.print("le Colonel Moutarde");
        }
        else if (!lunettes){
        	System.out.print("Mlle Rose");
        }
        else if(!homme) {
        	System.out.print("Mme Lablanc");
        }
        else{
        	System.out.print("Reverend Olive");
        }
                	
        System.out.println();
	}

}
