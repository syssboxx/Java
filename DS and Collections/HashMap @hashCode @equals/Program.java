package lesson24_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.remove();
		
		strings.add("Objective-C");
		strings.add("Java");
		strings.add("C++");
		
//		printFirstLetters(strings);
		
//		hashSetDemo();
		
		hashMapDemo();
		
//		treeSetDemo();
	}
	
	static void printFirstLetters(List<String> strings) {

		Iterator<String> it = strings.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		ListIterator<String> backwardsIt = strings.listIterator(strings.size());

		while (backwardsIt.hasPrevious()) {
			String s = backwardsIt.previous();
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		for(String s : strings) {
			System.out.print(s.substring(0, 1) + " ");
			//System.out.print(s.charAt(0)+" ");
		}
		
		System.out.println();
		
		Iterator<String> rIt = strings.iterator();
		
		while (rIt.hasNext()) {
			rIt.next();
			//System.out.println(rIt.next());
			rIt.remove();
		}
	}
	
	static void hashSetDemo() {
		
		Set<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(5);
		numbers.add(4);
		numbers.add(0);
		numbers.add(4);
		numbers.add(3);
		numbers.add(399);
		
		numbers.remove(0);
		
		System.out.println(numbers.contains(4));
		
		for(Integer i : numbers) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	static void hashMapDemo() {
		PhoneBook myBook = new PhoneBook();
		
		Person miro = new Person();
		miro.setName("Miro");
		miro.setAddress("Sofia");
		
		Person georgi = new Person();
		georgi.setName("Georgi");
		georgi.setAddress("Varna");
		
		Person miro2 = new Person();
		miro2.setName("Miro");
		miro2.setAddress("Plovdiv");
		
		Person georgi2 = new Person();
		georgi2.setName("Georgi");
		georgi2.setAddress("Varna");
		
		myBook.insert(miro, "088");
		myBook.insert(georgi, "089");
		myBook.insert(miro2, "085");
		myBook.insert(georgi2, "088");
		
		myBook.printContents();
		
		System.out.println();
	}
	
	static void treeSetDemo() {
		Set<String> numbers = new TreeSet<String>();
		
		numbers.add("aaa");
		numbers.add("fff");
		numbers.add("aba");
		numbers.add("aaa");
		numbers.add("aaaa");
		numbers.add("aaaaaaaa00000000000sdfdjfdgurur");
		
		for(String s : numbers) {
			System.out.print(s + " ");
		}
		
		System.out.println();
	}
}
