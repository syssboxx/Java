package lesson24_Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PhoneBook {

	Map<Person, String> book;
	
	public PhoneBook() {
		book = new HashMap<Person, String>();
	}
	
	public void insert(Person person, String number) {
		book.put(person, number);
	}
	
	public void remove(String person) {
		book.remove(person);
	}
	
	public String get(Person person) {
		return book.get(person);
	}
	
	public Set<Person> getAllPersons() {
		return book.keySet();
	}
	
	public Collection<String> getAllNumbers() {
		return book.values();
	}
	
	public void printContents() {
		Set<Entry<Person, String>> entries = book.entrySet();
		
		for(Entry<Person, String> entry : entries) {
			System.out.print(entry + " ");
		}
	}
	
	public boolean contains(Person person) {
		return book.containsKey(person);
	}
}
