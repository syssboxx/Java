import java.util.ArrayDeque;
import java.util.LinkedList;


public class Deque {

	public static void main(String[] args) {
		
		System.out.println("LinkedList\n");
		LinkedList<String> dequeL = new LinkedList<String>();
		
		dequeL.add("First element");
		dequeL.addFirst("newer first element");
		dequeL.addLast("last element");
		
		dequeL.add("one more element");
		dequeL.add("one more element");
		dequeL.add("one more element");
		
		
		for (String s : dequeL) {
			System.out.println(s);
		}

		System.out.println();
		
		//remove() - the first element = removeFirst()
		dequeL.remove();
		dequeL.removeFirst();
		dequeL.removeLast();
		
		for (String s : dequeL) {
			System.out.println(s);
		}
		
		
		ArrayDeque dequeA = new ArrayDeque();

	}
}
