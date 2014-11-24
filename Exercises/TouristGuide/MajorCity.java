package lesson21_test;

public class MajorCity extends City {
	
	private int maxCitizens;
	
	public MajorCity(String name, String countryCode, float rate, ClimateInfo climatInfo, int maxCitizens){
		super(name,countryCode, rate, climatInfo);
		if(maxCitizens > 0){
			this.maxCitizens = maxCitizens;
		}
	}
	
	//getter
	
	public int getMaxCitizens(){
		return maxCitizens;
	}
	
	@Override
	public String toString() {
		return String.format("Major city :\n%s\ncitizens : %d",super.toString(),maxCitizens);
	}

}
