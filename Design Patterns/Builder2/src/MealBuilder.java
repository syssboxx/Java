
public class MealBuilder {

	public Meal prepareVegMeal (){
	  Meal meal = new Meal();
	  meal.addItem(new VegBurger());
	  meal.addItem(new Cola());
	  return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	   Meal meal = new Meal();
	   meal.addItem(new ChichenBurger());
	   meal.addItem(new Pepsi());
	   return meal;
	   }

}
