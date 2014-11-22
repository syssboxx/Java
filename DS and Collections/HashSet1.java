import java.util.HashSet;
import java.util.Iterator;


public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet <String> hs = new HashSet<String>();
		
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of the HashSet: "+hs.size());
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));
        
        //iterate
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //copy content to another hashset
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);

        //delete all
        subSet.clear();
        System.out.println("Content After clear:");
        System.out.println(subSet);

        //copy to array
        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }

        //compare 2 hashset and retains common values
        HashSet<String> hs1 = new HashSet<String>();
        //add elements to HashSet
        hs1.add("first");
        hs1.add("second");
        hs1.add("third");
        hs1.add("apple");
        hs1.add("rat");
        System.out.println(hs1);
        
        HashSet<String> subSet1 = new HashSet<String>();
        subSet1.add("rat");
        subSet1.add("second");
        subSet1.add("first");
        
        hs1.retainAll(subSet1);
        
        System.out.println("HashSet content:");
        System.out.println(hs1);

        //elimination duplicate user objects
        
        HashSet<Price> lhm = new HashSet<Price>();
        lhm.add(new Price("Banana", 20));
        lhm.add(new Price("Apple", 40));
        lhm.add(new Price("Orange", 30));
        
        for(Price pr:lhm){
            System.out.println(pr);
        }
        
        Price duplicate = new Price("Banana", 20);
        
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        
        System.out.println("After insertion:");
        for(Price pr:lhm){
            System.out.println(pr);
        }
        
        //find user defined objects in hashset
        Price searched = new Price("Banana", 20);
        System.out.println("Does set contains searched? "+lhm.contains(searched));
        
        //delete object from hashset
        
        lhm.remove(searched);
        for(Price pr:lhm){
            System.out.println(pr);
        }

	}
}

class Price{
    
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
     
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}

