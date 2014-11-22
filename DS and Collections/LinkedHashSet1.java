import java.util.LinkedHashSet;


public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        
        System.out.println(lhs);
        System.out.println("LinkedHashSet size: "+lhs.size());
        System.out.println("Is LinkedHashSet emplty? : "+lhs.isEmpty());
        
        lhs.clear();
        System.out.println("Content After clear:");
        System.out.println(lhs);

        //add all elements from another collection
        

	}
}
