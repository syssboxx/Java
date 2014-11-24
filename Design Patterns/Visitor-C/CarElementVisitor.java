package lesson27_Visitor;

public interface CarElementVisitor {
	void visit(Door door);
	void visit(Engine engine);
	void visit(Wheel wheel);
}
