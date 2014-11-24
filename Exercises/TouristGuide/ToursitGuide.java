package lesson21_test;

public class ToursitGuide {

	City [] cities;
	
	private int maxNumberofCities;
	
	//constr
	
	public ToursitGuide(int maxNumberOfCities){
		if(maxNumberOfCities>=0){
			this.maxNumberofCities = maxNumberOfCities;
			cities = new City[maxNumberOfCities];
		}
	}
	
	//method
	
	public static int  convertToFahrenheit(int degrees){
		int degreesFahrenheit = (degrees * 9/5) + 32;
		return degreesFahrenheit;
		
	}
	
	public void printCityTemperature(boolean isFahrenheit){
		int minFahrenheit = 0;
		int maxFahrenheit = 0;
		for (int i = 0; i < cities.length; i++) {
			City currentCity = cities[i];
			if (currentCity !=null){
				System.out.printf("City : %s\n",currentCity.getName());
				if(!isFahrenheit){
					System.out.printf("Temperature : %s\n",currentCity.getClimateInfo().toString());
				}else{
					minFahrenheit = convertToFahrenheit(currentCity.getClimateInfo().getMinTemperature());
					maxFahrenheit = convertToFahrenheit(currentCity.getClimateInfo().getMaxTemperature());
					System.out.printf("Temperature : \nMinimal temperature : %d F, Maximal temperature : %d F\n ",minFahrenheit, maxFahrenheit);
				}
				
			}
		}
	}
	
	public void addCity(City city){
		for (int i = 0; i < cities.length; i++) {
			if (cities[i]==null){
				cities[i] = city;
				return;
			}
		}
	}
	
	public City getBest(TripAdvisor advisor){
		float maxRate=0;
		int maxRateIndex = 0;
		City maxRateCity;
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].getRate() > maxRate){
				maxRate = cities[i].getRate();
				maxRateIndex = i;
			}
		}
		maxRateCity = cities[maxRateIndex];
		return maxRateCity;
	}
	
	
	
	public void printCities(){
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
	}
}
