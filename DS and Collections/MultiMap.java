import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class MultiMap {

	
	public static void main(String[] args) {
		
		int minGroupSize = 5;

        // Read words from file and put into a simulated multimap
        HashMap<String, ArrayList<String>> m = new HashMap<String, ArrayList<String>>();

        try {
	        Scanner s = new Scanner(new File("Dictionary.txt"));
			while (s.hasNext()) {
			    String word = s.next();
			    String alpha = alphabetize(word);
			    ArrayList<String> l = m.get(alpha);
			    if (l == null)
			        m.put(alpha, l=new ArrayList<String>());
			    l.add(word);
			}
        }
		catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }


        // Print all permutation groups above size threshold
        for (ArrayList<String> l : m.values())
            if (l.size() >= minGroupSize)
                System.out.println(l.size() + ": " + l);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
