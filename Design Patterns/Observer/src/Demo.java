
public class Demo {

	public static void main(String[] args) {
		
		 Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      BinaryObserver bObserver = new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      
	      subject.detach(bObserver);
	      
	      System.out.println("\nSecond state change: 10");	
	      subject.setState(10);

	}
}
