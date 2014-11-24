import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Demo {
	public static void main(String[] args) {
//		Set<Person> persons = new HashSet<Person>();
//		
//		persons.add(new Person("Miro", 32));
//		persons.add(new Person("Miro", 32));
//		persons.add(new Person("Niki", 645));
//		
//		for (Person p : persons) {
//			System.out.println(p);
//		}
		boolean isSunny = false;
		
		Set<Slon> slonove = new TreeSet<Slon>(isSunny ? new Comparator<Slon>() {

			@Override
			public int compare(Slon o1, Slon o2) {
				return o1.getName().compareTo(o2.getName());
			}
		} : new SlonKGComparator());
		
		slonove.add(new Slon(5000, "Dymbo"));
		slonove.add(new Slon(3000, "Spaska"));
		slonove.add(new Slon(3000, "Bimbo"));
		slonove.add(new Slon(3000, "Maska"));
		slonove.add(new Slon(3000, "Djaska"));
		slonove.add(new Slon(7000, "Gazka"));
		
		for (Slon s : slonove) {
			System.out.println(s);
		}
	}
}
