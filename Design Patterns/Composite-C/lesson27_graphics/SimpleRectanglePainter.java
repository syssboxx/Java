package lesson27_graphics;

public class SimpleRectanglePainter implements Painter {
	
	@Override
	public void paint(Shape shape, Canvas canvas) {
		if (shape instanceof Rectangle) {
			Rectangle rect = (Rectangle) shape;
			
			Point topLeft = rect.getTopLeft();
			Point topRight = rect.getTopRight();
			Point bottomLeft = rect.getBottomLeft();
			Point bottomRight = rect.getBottomRight();
			
			canvas.drawLine(topLeft, topRight);
			canvas.drawLine(topLeft, bottomLeft);
			canvas.drawLine(topRight, bottomRight);
			canvas.drawLine(bottomLeft, bottomRight);
			
		} else {
			throw new PainterMismatchException();
		}
	}
}
