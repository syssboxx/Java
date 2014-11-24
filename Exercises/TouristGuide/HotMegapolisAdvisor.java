package lesson21_test;

public class HotMegapolisAdvisor implements TripAdvisor {
	
	private static final float COEFFICIENT = 1.5f;

	@Override
	public float rate(City city) {
		float rate = 0;
				
		if (city instanceof MajorCity){
			rate = ((MajorCity) city).getClimateInfo().getMaxTemperature()*COEFFICIENT;
		}else{
			rate = city.getClimateInfo().getMaxTemperature();
		}
		
		return rate;
	}

}
