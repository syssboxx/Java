
//visitor class which changes the executing algorithm of an element class

public class Demo {

	public static void main(String[] args) {
		
		ComputerPart computer = new Computer();
	    computer.accept(new ComputerPartDisplayVisitor());

	}
}
