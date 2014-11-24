package lesson27_Visitor;

import java.util.ArrayList;
import java.util.List;

public class CarStore {
	
	private List<CarElement> elements;
	
	private CarElementVisitor visitor;
	
	public CarStore(CarElementVisitor visitor) {
		elements = new ArrayList<CarElement>();
		this.visitor = visitor;
	}
	
	public void register(CarElement element) {
		elements.add(element);
		element.accept(visitor);
	}
}
