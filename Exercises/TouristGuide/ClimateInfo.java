package lesson21_test;


public class ClimateInfo {
	
	private int minTemperature;
	private int maxTemperature;
	
	public ClimateInfo(int minTemperature, int maxTemperature){
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
	}
	
	public int getMinTemperature(){
		return minTemperature;
	}
	
	public int getMaxTemperature(){
		return maxTemperature;
	}
	
	@Override
	public String toString() {
		return String.format("Minimal temperature : %d C, Maximal temperature : %d C", minTemperature,maxTemperature);
	}
	

}
