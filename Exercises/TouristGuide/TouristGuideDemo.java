package lesson21_test;

public class TouristGuideDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		City pomorie = new City("Pomorie","BUL",0.5f,new ClimateInfo(-10, 30));
		//System.out.println(pomorie);
		
		MajorCity sofia = new MajorCity("Sofia", "BUL", 1, new ClimateInfo(-15,33), 1000000);
				
		MajorCity burgas = new MajorCity("Burgas","BUL",0.8f,new ClimateInfo(-12, 25),200000);
				
		ToursitGuide guide = new ToursitGuide(3);
		guide.addCity(pomorie);
		guide.addCity(sofia);
		guide.addCity(burgas);
		
		//guide.printCities();
		guide.printCityTemperature(true);
		
		guide.printCityTemperature(false);
		
		HotMegapolisAdvisor advisor = new HotMegapolisAdvisor();
		
		City bestCity = guide.getBest(advisor); 
		
		System.out.println("Best city");
		System.out.println(bestCity);
		
		float rate1 = advisor.rate(pomorie);
		float rate2 = advisor.rate(sofia);
		float rate3 = advisor.rate(burgas);
		
		System.out.println(rate1);
		System.out.println(rate2);
		System.out.println(rate3);
	}

}
