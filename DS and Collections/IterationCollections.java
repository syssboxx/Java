import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class IterationCollections {

	
	public static void main(String[] args) {
		
		
	      System.out.println("LinkedSet - Insertion Order - DUPLICATES");		
		  LinkedList lnkLst = new LinkedList();
		  lnkLst.add("element4");
	      lnkLst.add("element1");
	      lnkLst.add("element2");
	      lnkLst.add("element3");
	      lnkLst.add("element4");
	      lnkLst.add(null);
	      displayAll(lnkLst);
	      
	      System.out.println("\nArrayList -  Insertion Order - DUPLICATES");
	      ArrayList aryLst = new ArrayList();
	      aryLst.add("z");
	      aryLst.add("x");
	      aryLst.add("y");
	      aryLst.add("w");
	      aryLst.add("y");
	      aryLst.add(null);
	      displayAll(aryLst);
	      
	      System.out.println("\nHashSet -  No Order - NO DUPLICATES");
	      HashSet hashSet = new HashSet();
	      hashSet.add("set1");
	      hashSet.add("set4");
	      hashSet.add("set3");
	      hashSet.add("set3");
	      hashSet.add("zet2");
	      hashSet.add(null);
	      displayAll(hashSet);
	      
	      System.out.println("\nTreeSet - Sorted Order - NO DUPLICATES");
	      SortedSet treeSet = new TreeSet();
	      treeSet.add("4");
	      treeSet.add("1");
	      treeSet.add("2");
	      treeSet.add("3");
	      treeSet.add("4");
	      //treeSet.add(null); - null ne moje 
	      displayAll(treeSet);
	      
	      System.out.println("\nLinkedHashSet -  Insertion Order - NO DUPLICATES");
	      LinkedHashSet lnkHashset = new LinkedHashSet();
	      lnkHashset.add("three");
	      lnkHashset.add("one");
	      lnkHashset.add("two");
	      lnkHashset.add("three");
	      lnkHashset.add("four");
	      lnkHashset.add(null);
	      displayAll(lnkHashset);
	      
	      System.out.println("\nHashMap - No Order - NO DUPLICATES KEY - DUPLICATES VALUES ");
	      HashMap<String,String> map1 = new HashMap<String,String>();
	      map1.put("key4", "M");
	      map1.put("key4", "N");
	      map1.put("key1", "J");
	      map1.put("key2", "K");
	      map1.put("key3", "L");
	      map1.put("key5", "M");
	      map1.put("key6", "null");
	      map1.put(null, "P");
	      displayAll(map1.keySet());
	      displayAll(map1.values());
	      
	      for (Entry<String,String> entry : map1.entrySet()) {
				System.out.println(entry);
			}
	      
	      System.out.println("\nSortedMap - TreeMap - Sorted Order - NO DUPLICATES KEY - DUPLICATES VALUES");
	      SortedMap<String,String> map2 = new TreeMap<String,String>();
	      map2.put("key4", "MM");
	      map2.put("key5", "MM");
	      map2.put("key1", "JJ");
	      map2.put("key2", "KK");
	      map2.put("key4", "MM");
	      map2.put("key3", "LL");
	      //null - ne gi vkarva
	      //map2.put(null, "PP");
	      map2.put("key6", "null");
	      displayAll(map2.keySet());
	      displayAll(map2.values());
	      
	      for (Entry<String,String> entry : map2.entrySet()) {
				System.out.println(entry);
			}
	      
	      System.out.println("\nLinkedHashMap - Insertion Order - NO DUPLICATES KEY - DUPLICATES VALUES");
	      LinkedHashMap map3 = new LinkedHashMap();
	      map3.put("key4", "MMM");
	      map3.put("key1", "JJJ");
	      map3.put("key2", "KKK");
	      map3.put("key4", "MMM");
	      map3.put("key3", "LLL");
	      map3.put("key5", "MMM");
	      map3.put(null, "PPP");
	      map3.put("key6", "null");
	      
	      displayAll(map3.keySet());
	      displayAll(map3.values());
		
		
		System.out.println("\nPriority Queue - NO ORDER GARANTEE for traversing - DUPLICATES");
		PriorityQueue<String> queuePQ = new PriorityQueue<String>();
		queuePQ.add("element4");
		queuePQ.add("element1");
		queuePQ.add("element4");
		queuePQ.add("element6");
		queuePQ.add("element2222222222222");
		displayAll(queuePQ);
		//Arrays.sort(queuePQ.toArray());
		
		System.out.println("\nPriority Queue - NO ORDER GARANTEE for traversing - Comparator/ Natural Order when POLL()  - DUPLICATES");
		Comparator comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				if (i1<i2){
					return -1;
				}
				if (i1>i2){
					return 1;
				}
				return 0;
			}
			
		};
		PriorityQueue<Integer> queuePQC = new PriorityQueue<Integer>(10,comparator );
		//if no comparator -> by natural order
		//PriorityQueue<Integer> queuePQC = new PriorityQueue<Integer>();
		queuePQC.add(4);
		queuePQC.add(2222222);
		queuePQC.add(0);
		queuePQC.add(4);
		queuePQC.add(6);
		queuePQC.add(133455);
		
		for (Integer i : queuePQC) {
			System.out.println(i);
		}
		
		System.out.println();
		
		
		while(!queuePQC.isEmpty()){
			System.out.println(queuePQC.poll());
		}
		
		
		
		
		System.out.println("\nArrayDeque - Insertion order - DUPLICATES");
		ArrayDeque<String> aDeque = new ArrayDeque<String> ();    
		aDeque.addFirst("tea");     
        aDeque.addFirst("milk");
        aDeque.addFirst("coffee");
        aDeque.addFirst("tea"); 
        aDeque.addLast("sugar");    
        displayAll(aDeque);
        
        System.out.println("\nSTACK - FIFO - insertion order - PRINT in reverse order - DUPLICATES");
        System.out.println("! implementation by Array NOT OK !");
        StackArray stack1 = new StackArray(10); 
        stack1.push("4");
        stack1.push("2");
        stack1.push("3");
        stack1.push("4");
        stack1.push("1");

        String top = stack1.peek();
        //System.out.println(top);
        
		while (!stack1.isEmpty()) {
			String topRemoved = stack1.pop();
			System.out.print(topRemoved+" ");
		}
		
		System.out.println("\n\nSTACK - FIFO - insertion order - PRINT in reverse order - DUPLICATES");
		System.out.println("! implementation by LinkedList ORDER NOT OK !");
		StackLinkedList stack2 = new StackLinkedList();
		stack2.push("4");
        stack2.push("2");
        stack2.push("3");
        stack2.push("4");
        stack2.push("1");
        
        //String top2 = stack2.peek().toString();
        //System.out.println(top);
        
		while (!stack2.isEmpty()) {
			String topRemoved2 = stack2.pop().toString();
			System.out.print(topRemoved2+" ");
		}
		
	   }

		static void displayAll(Collection col) {
		      Iterator itr = col.iterator();
		      while (itr.hasNext()) {
		         String str = (String) itr.next();
		         System.out.print(str + " ");
		      }
		      System.out.println();
	 }

}
