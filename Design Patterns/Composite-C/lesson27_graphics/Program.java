package lesson27_graphics;

public class Program {

	public static void main(String[] args) {
		
		Point tl = new Point(0, 0);
		Rectangle r = new Rectangle(tl, 10, 5);
		
		Canvas canvas = new Canvas();
		
		r.draw(new SimpleRectanglePainter(), canvas);
		
		String content = canvas.getContent();
		
		System.out.println(content);
	}
}
