package lesson27_Visitor;

public class PrintVisitor implements CarElementVisitor {

	@Override
	public void visit(Door door) {
		System.out.println("Door");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Engine");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Wheel");
	}
}
