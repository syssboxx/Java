package lesson27_graphics;

public class Canvas {
	
	private String content = "";
	
	public void drawLine(Point start, Point end) {
		content += "\n" + "Line: from " + start.toString() + " to " + end.toString();
	}
	
	public void drawCircle(Circle circle) {
		content += "\n" + "Circle: " + circle.toString();
	}
	
	public void drawText(TextArea area) {
		content += "\n" + area.getText();
	}
	
	public String getContent() {
		return content;
	}
}
