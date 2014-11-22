import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;




public class LinkedListEx {

	
	public static void main(String[] args) {


		LinkedList<String> lList = new LinkedList<String>();
	      lList.add("1");
	      lList.add("8");
	      lList.add("6");
	      lList.add("4");
	      lList.add("5");
	      lList.add("2");
	      System.out.println(lList);
	      lList.subList(2, 4).clear();
	      //LinkedList<String> sub = (LinkedList<String>) lList.subList(2, 4);
	      //System.out.println(sub);
	      
	      System.out.println(lList);
	      
	      
	      //iterate in descending order
	      LinkedList<String> arrl = new LinkedList<String>();
	      arrl.add("First");
	      arrl.add("Second");
	      arrl.add("Third");
	      arrl.add("Random");
	      
	      Iterator itr = arrl.descendingIterator();
	      while(itr.hasNext()){
	        System.out.println(itr.next());
	     }
	      
//	      ListIterator<String> itr2 = arrl.listIterator();
//	      while(itr2.hasPrevious()){
//	    	  System.out.println(itr2.previous());
//	      }
	      
	      //System.out.println(arrl);
	      
	      System.out.println();
	      
	      //LInked list as a stack
	      LinkedList<String> arrS = new LinkedList<String>();
	        arrS.add("First");
	        arrS.add("Second");
	        arrS.add("Third");
	        arrS.add("Random");
	        System.out.println(arrS);
	        
	        arrS.push("push element");
	        System.out.println("After push operation:");
	        System.out.println(arrS);
	        arrS.pop();
	        System.out.println("After pop operation:");
	        System.out.println(arrS);

	      
	 }



	
}
