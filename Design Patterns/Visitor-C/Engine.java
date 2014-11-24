package lesson27_Visitor;

public class Engine extends CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
