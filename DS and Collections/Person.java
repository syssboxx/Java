
public class Person  {

	private int id;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("name %s age %d", name,age);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null){
			return false;
		}
		
		if(!(o instanceof Person)){
			return false;
		}
		Person other = (Person)o;
		if (!(this.id == other.id && this.age == other.age)){
			return false;
		}
		if (this.name ==null){
			if (other.name != null){
				return false;
			}
			else{
				if (!this.name.equals(other.name)){
					return false;
				}
			}
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return (int)id * ((name==null)? 0 : name.hashCode())*age*31;
	}
	
	
	
	
	
}
