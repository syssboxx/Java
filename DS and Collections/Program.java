import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Program {

	public static void main(String[] args) {
		
		Collection c = new HashSet();
		
		String element = "element";
		c.add(element);
		c.add(5);
		
		System.out.println(c.add(10));
		System.out.println(c.add(5));
		
		Set  cSet  = new HashSet();
		cSet.add(5);
		cSet.add(14);
		
		
		ArrayList cList = new ArrayList();
		cList.add("hello");
		cList.add(5);
		cList.add("hello");
		cList.add(element);
		
		//cList.remove("hello");
		//cList.remove(2);
		
		boolean found2= cList.contains(element);
		found2 = cList.containsAll(c);
		System.out.println(found2);
		
		for (Object o : cList) {
			System.out.println(o);
		}
		

		c.add(element);
		c.addAll(cList);
		c.addAll(cSet);
		
		System.out.println();
		
		c.remove(element);
		
		for (Object o : c) {
			System.out.println(o);
		}
		
		boolean found = c.contains(5);
		
		System.out.println(found);
		
		c.removeAll(cSet);
		//c.retainAll(cSet);
		
		System.out.println();
		
		int nbr = c.size();
		System.out.println(nbr);
		
		for (Object o : c) {
			System.out.println(o);
		}
		
		Iterator it = c.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
	}
}
