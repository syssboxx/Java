package _02TypesVariables;

public class _05StringObject {

	
	public static void main(String[] args) {


		String s1 = "Hello";
		String s2 = "World";
		
		Object obj = s1 + " " + s2;
		System.out.println(obj);
		
		String s3 = (String)obj;
		System.out.println(s3);
		

	}

}
