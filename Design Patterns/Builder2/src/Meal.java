import java.util.ArrayList;


public class Meal {

	ArrayList<Item> meal = new ArrayList<Item>();
	
	public void addItem(Item item){
		meal.add(item);
	}
	
	public void showItems(){
		for (Item item : meal) {
			System.out.println("Item : "+ item.name());
			System.out.println("Packing : "+ item.packing().pack());
			System.out.println("Price :" + item.price());
		}
	}
	
	public double getCost(){
		double mealPrice = 0f;
		for (Item  item : meal) {
			mealPrice += item.price();
		}
		return mealPrice;
	}
}
