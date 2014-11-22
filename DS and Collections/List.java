import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class List {

	public static void main(String[] args) {
		
		String element = "element";
		
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 3");
		listA.add("element 2");
		listA.add("element 2");
		listA.add(element);
		
		listA.add(2, "element not 3");
		
		System.out.println(listA.contains(element));
		
		System.out.println("Index of element is "+listA.indexOf(element));
		
		listA.remove(3);
		listA.remove(element);
		
		String s2 = listA.get(2);
		System.out.println(s2);
		
		System.out.println();
		
		//sublist of elements
		//ArrayList<String>sublist = (ArrayList<String>) listA.subList(0,3);
		
		ArrayList<String> copy = (ArrayList<String>) listA.clone();
		
		//copy list into array
		String[] copyArr= new String[copy.size()];
		copy.toArray(copyArr);
		
		//iteration
		for (String s : copy) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Iterator it = listA.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		
		System.out.println();
				
		for (int i = 0; i < listA.size(); i++) {
			System.out.println(listA.get(i));
		}
		
		System.out.println();
		//sortirane po estestven red 
		Collections.sort(listA);
		
		for (int i = 0; i < listA.size(); i++) {
			System.out.println(listA.get(i));
		}
		
		//remove elements by iterator 
		
		 String removeElem = "Perl";
	     ArrayList<String> myList = new ArrayList<String>();
	     myList.add("Java");
	     myList.add("Unix");
	     myList.add("Oracle");
	     myList.add("C++");
	     myList.add("Perl");
	     
	     System.out.println("Before remove :");
	     System.out.println(myList);
	     
	     Iterator<String> itr = myList.iterator();
	     while(itr.hasNext()){
	            if(removeElem.equals(itr.next())){
	                itr.remove();
	            }
	     }
	     System.out.println("After remove and sorting:");
	    
	     Collections.sort(myList);
	     System.out.println(myList);
	     
	     //list iterator
	        ArrayList<Integer> li = new ArrayList<Integer>();
	        ListIterator<Integer> litr = li.listIterator();
	        li.add(23);
	        li.add(98);
	        li.add(29);
	        li.add(71);
	        li.add(5);
	        
//	        System.out.println("Elements in forward directiton");
//	        
//	        while(litr.hasNext()){
//	            System.out.println(litr.next());
//	        }
//	        System.out.println("Elements in backward directiton");
//	        while(litr.hasPrevious()){
//	            System.out.println(litr.previous());
//	        }
	        
	        System.out.println("SORTED BY COMPARATOR");
	        
	        //SORTING BY COMPARATOR
	        ArrayList<Empl> list = new ArrayList<Empl>();
	        
	        list.add(new Empl("Ram",3000));
	        list.add(new Empl("John",6000));
	        list.add(new Empl("Crish",2000));
	        list.add(new Empl("Tom",2400));
	        //Collections.sort(list,new MySalaryComparator());
	        
	        System.out.println("Sorted list entries:\n ");
	        for(Empl e:list){
	            System.out.println(e);
	        }
	        
	        //reverse list
	        Collections.reverse(list);
	        System.out.println("Reversed\n");
	        for(Empl e:list){
	            System.out.println(e);
	        }
	        
	        //swap 2 elements in arraylist
	        
	        Collections.swap(list, 0, 3);
	        
	        System.out.println("index 0 and 3 swapped\n");
	        for(Empl e:list){
	            System.out.println(e);
	        }
	    }
}

