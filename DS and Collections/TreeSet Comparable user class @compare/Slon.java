
public class Slon  {
	private long kg;
	private String name;
	
	
	public Slon(long kg, String name) {
		super();
		this.kg = kg;
		this.name = name;
	}
	public long getKg() {
		return kg;
	}
	public void setKg(long kg) {
		this.kg = kg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Slon [kg=" + kg + ", name=" + name + "]";
	}
	
//	
//	@Override
//	public int compareTo(Slon otherSlon) {
//		if (this.kg > otherSlon.kg)
//			return 1;
//		
//		if (this.kg < otherSlon.kg)
//			return -1;
//		
//		//kg sa ravni
//		return this.name.compareTo(otherSlon.name);
//	}
	
}
