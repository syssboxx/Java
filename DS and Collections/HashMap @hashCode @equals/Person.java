package lesson24_Collections;

public final class Person {

	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "(" + name + ", " + address + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (! (obj instanceof Person) ) {
			return false;
		}
		
		Person other = (Person)obj;
		
		if (!getName().equals(other.getName())) {
			return false;
		}
		
		if (!getAddress().equals(other.getAddress())) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int nameHash = name.hashCode();
		int addressHash = address.hashCode();
		
		return 7 * nameHash +  13 * addressHash + 71;
	}
}
