import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;




public class Queue {

	public static void main(String[] args) {
		
		
		System.out.println("LinkedList\n");
		
		LinkedList queueLL = new LinkedList();
		queueLL.add("element 1");
		queueLL.add("element 4");
		queueLL.add("element 6");
		queueLL.add("element 2");
		
		//get and remove
		String first = (String) queueLL.element();
		//System.out.println(first);
		
		String firstRemoved = (String) queueLL.remove();
		//System.out.println(firstRemoved);
		
		Iterator it = queueLL.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
		
		
		
		System.out.println("\nPriority Queque\n");
		PriorityQueue<String> queuePQ = new PriorityQueue<String>();
		
		queuePQ.add("element 1");
		queuePQ.add("element 4");
		queuePQ.add("element 6");
		queuePQ.add("element 2");
		
		for (String s : queuePQ) {
			System.out.println(s);
		}
		
		//time counter with queue
		int time = 20;
        LinkedList<Integer> queue = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--)
            queue.add(i);

        while (!queue.isEmpty()) {
        	System.out.println(queue.element());
        	queue.remove();
        	
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

	}
}
