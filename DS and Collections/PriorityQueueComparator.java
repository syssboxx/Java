import java.util.PriorityQueue;


public class PriorityQueueComparator {

	public static void main(String args[]) {

		PriorityQueue<Item> items = new PriorityQueue<Item>();

		items.add(new Item("TV", 1500));
        items.add(new Item("IPhone", 900));
        items.add(new Item("GSM model1", 600));
        items.add(new Item("IPad", 1200));
        items.add(new Item("Xbox", 300));
        items.add(new Item("Watch", 200));
        items.add(new Item("GSM model2", 600));


        System.out.println("Order of items in PriorityQueue");
        
        for (Item item : items) {
			System.out.println(item);
		}
         
        System.out.println("\nElement consumed from head of the PriorityQueue : " + items.poll());
        
        for (Item item : items) {
			System.out.println(item);
		}

        System.out.println("\nElement consumed from head of the PriorityQueue : " + items.poll());
        for (Item item : items) {
			System.out.println(item);
		}
        
        System.out.println("\nElement consumed from head of the PriorityQueue : " + items.poll());
        for (Item item : items) {
			System.out.println(item);
		}

        //items.add(null); // null elements not allowed in PriorityQueue - NullPointerException
    }
}

class Item implements Comparable<Item> {


	private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Item other = (Item) obj;

        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.price != other.price) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s: $%d", name, price);
    }

	@Override
	public int compareTo(Item i) {
		if (this.price > i.price){
			return 1;
		}
		if (this.price < i.price){
			return -1;
		}
		
		return (this.name.compareTo(i.name));
	}

}




