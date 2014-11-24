package lesson27_Builder;

public enum Week {
	
	MONDAY("MON"),
	TUESDAY("TUE"),
	WEDNESDAY("WED"),
	THURSDAY("THU"),
	FRIDAY("FRI"),
	SATURDAY("SAT"),
	SUNDAY("SUN");
	
	private String name;
	
	private Week(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
