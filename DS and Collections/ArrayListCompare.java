import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ArrayListCompare {

	public static void main(String a[]){
        
        ArrayList<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Ram",3000));
        list.add(new Empl("John",6000));
        list.add(new Empl("Crish",2000));
        list.add(new Empl("Tom",2400));
        Collections.sort(list,new MySalaryComp());
        System.out.println("Sorted list entries: ");
        for(Empl e:list){
            System.out.println(e);
        }
    }
}

