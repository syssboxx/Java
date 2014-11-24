import java.util.Comparator;


public class SlonKGComparator implements Comparator<Slon>{

	@Override
	public int compare(Slon o1, Slon o2) {
		return (int) (o1.getKg() - o2.getKg());
	}

}
