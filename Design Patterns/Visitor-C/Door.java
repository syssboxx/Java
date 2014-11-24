package lesson27_Visitor;

public class Door extends CarElement {
	
	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
