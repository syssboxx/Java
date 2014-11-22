import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;


public class Map {

	public static void main(String[] args) {
		
		String company;
		
		System.out.println("HashMap\n");
		
		HashMap<Person,String> hMap = new HashMap<Person,String>();
		
		Person ani = new Person("Ani", 25);
		
		hMap.put(ani, "Company 1");
		hMap.put(new Person("Mimi", 28), "Company 2");
		hMap.put(new Person("Petya", 20), "Company 3");
		hMap.put(new Person("Martin", 25), "Company 1");
		hMap.put(new Person("Martin", 25), "Company 1");
		
		//get value
		String company1 = hMap.get(ani);
		System.out.println(company1);
		
		//contains K or V
		boolean foundKey = hMap.containsKey(ani);
		System.out.println(foundKey);
		
		boolean foundValue = hMap.containsValue("Company 4");
		System.out.println(foundValue);
		
		//remove by KEY
		hMap.remove(ani);
		
		System.out.println("\nKeys only\n");
		
		//iterator Keys
		Iterator itK = hMap.keySet().iterator();
		while(itK.hasNext()){
			System.out.println(itK.next());
		}
		
		System.out.println("\nValues only\n");
		
		Iterator itV = hMap.values().iterator();
		while(itV.hasNext()){
			System.out.println(itV.next());
		}
		
		System.out.println("\nKeys and Values\n");
		Iterator itKV = hMap.keySet().iterator();
		while(itKV.hasNext()){
			Object key   = itKV.next();
			Object value = hMap.get(key);
			System.out.println(key+" - "+value);

		}
		
		System.out.println("\nKeys and Values by foreach\n");
		for (Object key : hMap.keySet()) {
			Object value = hMap.get(key);
			System.out.println(key +" - "+value);
		}
		
		System.out.println("\nKeys and Values by foreach Entry Map\n");
		
		for (Entry<Person, String> entry : hMap.entrySet()) {
			System.out.println(entry);
//			System.out.print(entry.getKey()+" - ");
//			System.out.print(entry.getValue()+"\n");
		}
		
		
		System.out.println("\nLinkedHashMap\n");
		
		//zapazva reda na vkarvane na elementite
		LinkedHashMap<Person,String> lhMap = new LinkedHashMap<Person,String>();
		
		lhMap.put(ani, "Company 1");
		lhMap.put(new Person("Mimi", 28), "Company 2");
		lhMap.put(new Person("Petya", 20), "Company 3");
		lhMap.put(new Person("Martin", 25), "Company 1");
		lhMap.put(new Person("Martin", 25), "Company 1");
		
		for (Entry<Person, String> entry : lhMap.entrySet()) {
			System.out.println(entry);
		}
		
		
		System.out.println("\nTreeMap");
		
		TreeMap<Person,String> tMap = new TreeMap<Person,String>();
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		};
		
		
		//hashMap 
		System.out.println("Eliminate duplicate keys on user defined objects");
		HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printMap(hm);
        Price key = new Price("Banana", 20);
        System.out.println("Adding duplicate key...");
        hm.put(key, "Grape");
        System.out.println("After adding dulicate key:");
        printMap(hm);

		//TreeMap
        System.out.println("\nTreeMap with Comparator and user defined objects and get first and last sorted element - sorted by key\n");
        //By using salary comparator (int comparison)
        TreeMap<Empl,String> trmap = new TreeMap<Empl, String>(new MySalaryComp());
        trmap.put(new Empl("Ram",3000), "RAM");
        trmap.put(new Empl("John",6000), "JOHN");
        trmap.put(new Empl("Crish",2000), "CRISH");
        trmap.put(new Empl("Tom",2400), "TOM");
        
        Empl em = trmap.lastKey();
        System.out.println("Highest salary emp: "+em);
        
        Entry<Empl,String> ent = trmap.lastEntry();
        System.out.println("Entry set values: ");
        System.out.println(ent.getKey()+" ==> "+ent.getValue());

        System.out.println("\nReverse content of TreeSet sorted by key by descendingMap():\n");
        //first sort the tree map by comparator, then call descendingMap() to reverse
        
        for (Entry<Empl,String> entry : trmap.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
        
        NavigableMap<Empl, String> reversedMap = trmap.descendingMap();
        System.out.println("\nReversed Map Content: ");
                
        System.out.println();
        
        for (Entry<Empl,String> entry : reversedMap.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}

        
        
        
		//comparator
//		TreeMap<Person,String> tcMap = new TreeMap<Person,String>(comparator);
//		
//		tcMap.put(ani, "Company 1");
//		tcMap.put(new Person("Mimi", 28), "Company 2");
//		tcMap.put(new Person("Petya", 20), "Company 3");
//		tcMap.put(new Person("Martin", 25), "Company 1");
//		tcMap.put(new Person("Martin", 25), "Company 1");
//		
//		for (Entry<Person,String> entry : tcMap.entrySet()) {
//			System.out.println(entry);
//		}
	}

	private static void printMap(HashMap<Price, String> map) {
		for(Price p:map.keySet()){
            System.out.println(p+"==>"+map.get(p));
        }
	}
}



