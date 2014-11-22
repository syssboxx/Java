import java.util.ArrayDeque;
import java.util.Iterator;



public class ArrayDequeEx {

	
	public static void main(String[] args) {
		ArrayDeque<String> aDeque = new ArrayDeque<String> ();    
		 
        aDeque.addFirst("tea");     
        aDeque.addFirst("milk");
        aDeque.addFirst("coffee");
        aDeque.addLast("sugar");    
   
        System.out.println();
 
        aDeque.addFirst("juice");  
        aDeque.addLast("honey");
        
        
        System.out.println("First Element : " + aDeque.getFirst());    
        System.out.println("Last Element : " + aDeque.getLast());    

            /* Removal of the Deque Elements */
        System.out.println("First Element(Removed):"+aDeque.removeFirst());  
        System.out.println("Last Element Removed:"+aDeque.removeLast());  
        
        Iterator it = aDeque.iterator();
        while(it.hasNext()){
        	System.out.println(it.next()); 
        }
    
        System.out.println("%nPopped Element : " + aDeque.pop());    
        System.out.println("%n Size of Array Deque: " + aDeque.size());   

	}

}
