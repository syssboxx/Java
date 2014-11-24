package lesson27_Visitor;

public abstract class CarElement {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void accept(CarElementVisitor visitor);
}
