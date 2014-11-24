package lesson27_graphics;

public abstract class Shape {
	
	public abstract double getArea();
	
	public abstract Rectangle getBoundingBox();
	
	public void draw(Painter painter, Canvas canvas) {
		painter.paint(this, canvas);
	}
}
