package lesson27_Composite;

import lesson27_graphics.Canvas;
import lesson27_graphics.Painter;
import lesson27_graphics.Rectangle;
import lesson27_graphics.Shape;

import java.util.List;

public class CompositeShape extends Shape {

	private List<Shape> shapes;
	
	@Override
	public double getArea() {
		double area = 0;
		
		for(Shape s : shapes) {
			area += s.getArea();
		}
		
		return area;
	}

	@Override
	public Rectangle getBoundingBox() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void draw(Painter painter, Canvas canvas) {
		for(Shape s : shapes) {
			s.draw(painter, canvas);
		}
	}
}
