package lesson27_graphics;

public class Rectangle extends Shape {
	
	private static final String TAG = "RECTANGLE";
	
	private static int countOfEverCreated = 0;
	
	private Point topLeft;
	
	private int width = 0;
	private int height;
	
	public Rectangle(Point topLeft, final int w, int h) {
		
		this.topLeft = new Point();
		this.topLeft.x = topLeft.x;
		this.topLeft.y = topLeft.y;
		
		topLeft.x = 100;
		
		width = w;
		height = h;
		
		++countOfEverCreated;
	}
	
	public Rectangle(Point p1, Point p2) {
		
		topLeft = getTopLeft(p1, p2);
		
		Point bottomRight = getBottomRight(p1, p2);
		
		width = bottomRight.x - topLeft.x;
		height = bottomRight.y - topLeft.y;
		
		++countOfEverCreated;
	}
	
	public void setTopLeftX(int x) {
		this.topLeft.x = x;
	}
	
	public int getTopLeftX() {
		return topLeft.x;
	}
	
	public void setTopLeftY(int y) {
		this.topLeft.y = y;
	}
	
	public int getTopLeftY() {
		return topLeft.y;
	}
	
	public void setWidth(int width) {
		if (width > 0) {			
			this.width = width;
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public void print() {
		System.out.printf("[(%d, %d), %d, %d]", getTopLeftX(), getTopLeftY(), getWidth(), getHeight());
	}
	
	private Point getTopLeft(Point p1, Point p2) {
		
		int x = Math.min(p1.x, p2.x);
		int y = Math.min(p1.y, p2.y);
		
		return new Point(x, y);
	}
	
	private Point getBottomRight(Point p1, Point p2) {
		
		int x = Math.max(p1.x, p2.x);
		int y = Math.max(p1.y, p2.y);
		
		return new Point(x, y);
	}
	
	public Point getTopLeft() {
		return topLeft;
	}
	
	public Point getTopRight() {
		return new Point(topLeft.x + width, topLeft.y);
	}
	
	public Point getBottomLeft() {
		return new Point(topLeft.x, topLeft.y + height);
	}
	
	public Point getBottomRight() {
		Point bottomRight = new Point();
		
		bottomRight.x = topLeft.x + width;
		bottomRight.y = topLeft.y + height;
		
		return bottomRight;
	}
	
	public static String getTag() {
		return TAG;
	}
	
	public static int getCountOfEverCreated() {
		return countOfEverCreated;
	}
	
	public static Rectangle copyOf(Rectangle other) {
		int topLeftX = other.getTopLeftX();
		int topLeftY = other.getTopLeftY();
		return new Rectangle(new Point(topLeftX, topLeftY), 
				other.getWidth(), other.getHeight());
	}
	
	@Override
	public Rectangle getBoundingBox() {
		return Rectangle.copyOf(this);
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
}
