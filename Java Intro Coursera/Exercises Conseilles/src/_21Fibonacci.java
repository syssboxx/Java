import java.util.Scanner;

import javax.print.attribute.standard.Finishings;


public class _21Fibonacci {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int n=0;
		char choix='n';
		
		do{
			    n=demanderNombre(0, 40);
				int FnRecursive=Fibonacci(n);
				int FnItervative=FibonacciIteratif(n);
				System.out.println("Méthode itérative :");
				System.out.printf("F(%d)=%d%n",n,FnItervative);
				System.out.println("Méthode récursive :");
				System.out.printf("F(%d)=%d%n",n,FnRecursive);
				
				do{
					System.out.println("Voulez-vous recommencer [o/n] ? ");
					choix=scanner.next().charAt(0);
				}while((choix!='o') && (choix!='n'));
				
		}while(choix=='o');
	}
	
	static int demanderNombre(int a,int b){
		int n;
		do{
			System.out.printf("Entrez un nombre entier compris entre %d et %d : ",a,b);
			n= scanner.nextInt();
		}while(n<0 || n>40);
		return n;
	}
	
	static int Fibonacci(int  n){
		int Fn=0;
		
		if (n==0){
			Fn=0;
		}
		else if (n==1){
			Fn=1;
		}
		else {
			Fn=Fibonacci(n-1)+Fibonacci(n-2);
		}
		return Fn;
	}
	
	static int FibonacciIteratif(int n)
	{
	  int Fn = 0;    // stocke F(i)  , initialisé par F(0)
	  int Fn_1 = Fn; // stocke F(i-1), initialisé par F(0)
	  int Fn_2 = 1;  // stocke F(i-2), initialisé par F(-1)

	  if (n > 0)
	    for (int i = 1; i <= n; ++i) {
	      Fn   = Fn_1 + Fn_2;    // pour n>=1 on calcule F(n)=F(n-1)+F(n-2)
	      Fn_2 = Fn_1;           // et on décale...
	      Fn_1 = Fn;
	    }
	  return Fn;
	}


}
