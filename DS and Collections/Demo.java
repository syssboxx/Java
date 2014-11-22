
public class Demo {

	public static void main(String[] args) {
		
		String name = "Ani";
		String othername = "Anr";
		
		int age = 10;
		int otherage = 10;
		
		int id = 5;
		int otherid = 5;
		
		if (!(id == otherid && name.equals(othername) && age == otherage)){
			System.out.println(false);
		}else{
			System.out.println(true);
		}
		
	}
}
