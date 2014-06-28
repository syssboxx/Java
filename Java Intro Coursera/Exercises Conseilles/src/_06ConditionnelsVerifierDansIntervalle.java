import java.util.Scanner;

//Soit I = [2,3[ U ]0,1] U [-10,-2] dans l'ensemble des réels.
//teste l'appartenance de x à l'ensemble I 
//Testez votre programme avec les valeurs -20, -10, -2, -1, 0, 1, 1.5, 2, 3 et 4

public class _06ConditionnelsVerifierDansIntervalle {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Entrez un nombre décimal : ");
		float x = scan.nextFloat();
		
//		if((x>=2.0 && x<3.0) || (x>0.0 && x<=1.0) || (x>=-10.0 && x<=-2.0)){
//			System.out.println("x appartient à I");
//		}
//		else{
//			System.out.println("x n'appartient pas à I");
//		}
		
		if ((!(x < 2.0) && (x <  3.0)) || (!(x < 0.0) && !(x == 0.0) && ((x <  1.0) || (x ==  1.0)))
                                       || (!(x < -10.0) && ((x < -2.0) || (x == -2.0))))
		    {
			System.out.println("x appartient à I");
		}
		else{
			System.out.println("x n'appartient pas à I");
		}

	}

}
