package lesson21_test;

public class City {

	private String name;
	private String countryCode;
	private float rate;
	private ClimateInfo climatInfo;
	
	//constr
	
	public City(){
		}
	
	public City(String name, String countryCode){
		this.name = name;
		if(validateCountryCode(countryCode)){
			this.countryCode = countryCode;
		}
		
	}
	
	public City(String name, String countryCode,float rate){
		this(name,countryCode);
		if(validateRate(rate)){
			this.rate = rate;
		}
		
	}

	public City(String name, String countryCode,float rate,ClimateInfo climatInfo){
		this(name,countryCode,rate);
		this.climatInfo = climatInfo;
	}
	
	//setters
	
	public void setName(String name){
		if (name != null){
			this.name = name;
		}
	}
	
	public void setCountryCode(String countryCode){
		if (validateCountryCode(countryCode)){
			this.countryCode = countryCode;
		}
	}
	
	public void setRate(float rate){
		if (validateRate(rate)){
			this.rate = rate;
		}
	}
	
	public void setClimateInfo(ClimateInfo climatInfo){
		this.climatInfo = climatInfo;
	}
	
	//getters
	
	public String getName(){
		return name;
	}
	
	public String getCountryCode(){
		return countryCode;
	}
	
	public float getRate(){
		return rate;
	}
	
	public ClimateInfo getClimateInfo(){
		return climatInfo;
	}
	
	//methods
	
	@Override
	public String toString() {
		return String.format("City :\nname : %s\ncountry code : %s\nrate : %s\nclimate info : %s", name, countryCode, rate, climatInfo.toString());
	}
	
	private boolean validateCountryCode(String countryCode){
		if(countryCode.length()!=3){
			return false;
		}
		
		for (int i = 0; i < countryCode.length(); i++) {
			if (!Character.isUpperCase(countryCode.charAt(i))){
				return false;
			}
		}
		
		return true;
	}
	
	private boolean validateRate(float rate){
		if (rate <0 || rate >1){
			return false;
		}
		
		return true;
	}
}
