import java.util.HashMap;


public class ColorStore {
	
	private static HashMap<String,Color>colorMap = new HashMap<String, Color>();
	
	static{
		colorMap.put("red",new Red());
		colorMap.put("green", new Green());
	}
	
	
	public static Color getColor(String colorname){
		return (Color) colorMap.get(colorname).clone();
	}

}
