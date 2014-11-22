import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class Set {

	public static <T> void main(String[] args) {
		
		HashSet <String> setHash = new HashSet<String>();
		LinkedHashSet<String> setLinkedHash = new LinkedHashSet<String>();
		
		
		System.out.println("HashSet\n");
		HashSet<Person> persons = new HashSet<Person>();
				
		persons.add(new Person("ivan",20));
		persons.add(new Person("maria",25));
		persons.add(new Person("ivan",20));
		
		for (Person p : persons) {
			System.out.println(p);
		}
		
		System.out.println("\nTreeSet comparator \n");
		
		Comparator comparator = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getAge() > p2.getAge()){
					return 1;
				}
				if (p2.getAge() > p1.getAge()){
					return -1;
				}
				return 0;
			}
		};
		
		SortedSet<Person> personsByOrder = new TreeSet<Person>(comparator);
		
		personsByOrder.add(new Person("ivan",20));
		personsByOrder.add(new Person("maria",25));
		personsByOrder.add(new Person("ivan",19));
		
		for (Person p : personsByOrder) {
			System.out.println(p);
		}
		
		System.out.println("\nNavigableSet TreeSet descending\n");
		
		NavigableSet original = new TreeSet();
		original.add("1");
		original.add("2");
		original.add("3");
		
		System.out.print("\npollFirst and pollLast :");
		
		Object first = original.pollFirst();
		System.out.print(first+" ");
		
		Object last = original.pollLast();
		System.out.print(last+"\n");
				
		NavigableSet reverse = original.descendingSet();
		for (Object o : reverse) {
			System.out.println(o);
		}
		
		System.out.println("headSet by 3");
		SortedSet headSet = original.headSet("3");
		
		for (Object o : headSet) {
			System.out.println(o);
		}
		
		
		System.out.println("\nSetHash\n");
		
		String element = "element A";
		
		setHash.add(element);
		setHash.add("element 765");
		setHash.add(element);
		setHash.add("element 0");
		setHash.add("element 1");
		setHash.add("element 2");
		
		
		System.out.println(setHash.contains(element));
		
		for (String s : setHash) {
			System.out.println(s);
		}
		
		setHash.remove(element);
		
		System.out.println();
		
		Iterator<String> it = setHash.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		//set operations retains remove add all
		
		ArrayList<String> c = new ArrayList<String>();
		c.add("i");
		c.add("came");
		c.add("i");
		c.add("saw");
		
		HashSet<String> uniques = new HashSet<String>();
        HashSet<String> dups    = new HashSet<String>();

        for (String a : c)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);

		
        //union intersection and difference of 2 collections
        
//		Set<String> union = new HashSet<String>(s1);
//		union.addAll(s2);
//
//		Set<Type> intersection = new HashSet<Type>(s1);
//		intersection.retainAll(s2);
//
//		Set<Type> difference = new HashSet<Type>(s1);
//		difference.removeAll(s2);
        
        //print all distinct words
        HashSet<String> distinct = new HashSet<String>(c);
        System.out.println(distinct.size());
        for (String s : distinct) {
			System.out.println(s);
		}
        
        //TreeSet from List
        
        ArrayList<String> li = new ArrayList<String>();
        li.add("one");
        li.add("two");
        li.add("four");
        li.add("three");
        System.out.println("List: "+li);
        //create a treeset with the list
        //ordered alphabethically
        TreeSet<String> myset = new TreeSet<String>(li);
        System.out.println("Set: "+myset);
        
        System.out.println();
        
		//remove duplicate from array
        
        String[] strArr = {"one","two","three","four","four","five"};
        //convert string array to list
        //List<String> tmpList = Arrays.asList(strArr);
        //create a treeset with the list, which eliminates duplicates
        //TreeSet<String> unique = new TreeSet<String>(tmpList);
        
        TreeSet<String> unique = new TreeSet<String>();
        for (String string : strArr) {
			unique.add(string);
		}
        System.out.println(unique);

		//find duplicate values from array
        TreeSet<String> unique1 = new TreeSet<String>();
        for (String s : strArr){
        	if (!unique1.add(s)){
        		System.out.println("Duplicate value : "+s);
        	}
		}
        
        //TREE SET with COMPARATOR
        System.out.println("\n TreeSet with Comparator");
        
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        System.out.println(ts);
        
        //compare user defined object by comparator
        
       //By using name comparator (String comparison)
        TreeSet<Empl> nameComp = new TreeSet<Empl>(new MyNameComp());
        nameComp.add(new Empl("Ram",3000));
        nameComp.add(new Empl("John",6000));
        nameComp.add(new Empl("Crish",2000));
        nameComp.add(new Empl("Tom",2400));
        for(Empl e:nameComp){
            System.out.println(e);
        }
        System.out.println("===========================");
        
        //By using salary comparator (int comparison)
        TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
        salComp.add(new Empl("Ram",3000));
        salComp.add(new Empl("John",6000));
        salComp.add(new Empl("Crish",2000));
        salComp.add(new Empl("Tom",2400));
        for(Empl e:salComp){
            System.out.println(e);
        }
        
        //the person with the least salary
        System.out.println("Least salary employee: "+salComp.first());
        System.out.println("Highest salary employee: "+salComp.last());

		//avoid adding duplicate values with user defined objects
        //implement Comparator interface with equality verification
        //compare first if 2 empl are same, if not sort them by id in ascending order 
        
        TreeSet<Empl> ts1 = new TreeSet<Empl>(new EmpComp());
        ts1.add(new Empl(201,"John",40000));
        ts1.add(new Empl(302,"Krish",44500));
        ts1.add(new Empl(146,"Tom",20000));
        ts1.add(new Empl(543,"Abdul",10000));
        ts1.add(new Empl(12,"Dinesh",50000));
        //adding duplicate entry
        ts1.add(new Empl(146,"Tom",20000));
        //check duplicate entry is there or not
        for(Empl e:ts1){
            System.out.println(e);
        }

	}
}

class MyComp implements Comparator<String>{
	 
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}

class MyNameComp implements Comparator<Empl>{
	 
    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class EmpComp implements Comparator<Empl>{
	 
    @Override
    public int compare(Empl e1, Empl e2) {
        if(e1.getEmpId() == e2.getEmpId()){
            return 0;
        } if(e1.getEmpId() < e2.getEmpId()){
            return 1;
        } else {
            return -1;
        }
    }
}

 
