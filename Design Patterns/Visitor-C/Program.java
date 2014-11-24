package lesson27_Visitor;

public class Program {

	public static void main(String[] args) {
		CarStore store = new CarStore(new PrintVisitor());
		
		store.register(new Wheel());
		store.register(new Engine());
		store.register(new Door());
	}
}
