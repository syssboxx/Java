package lesson27_Visitor;

public class Wheel extends CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
