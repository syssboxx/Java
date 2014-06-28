import java.util.Scanner;


public class _02ChuteParachute {

	private static Scanner clavier = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextInt();
        } while (h0 < 250.0);

        //valeurs initiales
	    final double g =9.81;
	    final double vitesseSon=343.0;
        final double accelerationMax=0.5;
        final double hauteurParachute=2500.0;
        final double surfaceParachute=25.0;
        
	    double v0=0.0;
	    double t0=0.0;
	    double surface=2.0;
	    
	    //valeurs courantes
	    double vitesse = v0;
	    double acceleration = g;
	    double temps=t0;
	    double hauteur=h0;
      
        System.out.printf("%.0f, %.4f, %.4f, %.5f %n",temps,hauteur,vitesse,acceleration);
        
        //chute libre
        double alpha=surface/masse;
        double terme;
        
        boolean vitesseSonAtteint=false;
        boolean accelerationMaxAtteint=false;
        boolean parachuteOuvert=false;
        
      //evolution du sportif        
        while (hauteur>=0.0){
        	
        	System.out.printf("%.0f, %.4f, %.4f, %.5f %n",temps,hauteur,vitesse,acceleration);
        	temps++;
        	
        	terme=Math.exp(-alpha*(temps-t0));
        	vitesse=(g/alpha)*(1.0-terme)+v0*terme;
            hauteur=h0-(g/alpha)*(temps-t0)-(v0-g/alpha)/alpha*(1.0-terme);
            acceleration=g-(alpha*vitesse);
            
                       
           //Vitesse du son et vitesse limite
            if (vitesse>=vitesseSon && !vitesseSonAtteint ){
            	System.out.println("## Felix depasse la vitesse du son");
            	vitesseSonAtteint=true;
             }
            
            if (acceleration<accelerationMax && !accelerationMaxAtteint){
            	System.out.println("## Felix a atteint sa vitesse maximale");
            	accelerationMaxAtteint=true;
            } 
            
            //ouverture du parachute
            if(hauteur < hauteurParachute && !parachuteOuvert){
            	parachuteOuvert=true;
            	surface=surfaceParachute;
            	t0=temps;
            	v0=vitesse;
            	h0=hauteur;
            	System.out.println("## Felix ouvre son parachute");
            }
        	
        }
        
        
        
	}

}
