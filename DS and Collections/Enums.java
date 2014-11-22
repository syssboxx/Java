import java.util.Enumeration;
import java.util.Vector;


public class Enums {

	public static void main(String[] args) {
		
		Vector<String> lang = new Vector<String>();
		
		Enumeration<String> en = null;
		
        lang.add("JAVA");
        lang.add("JSP");
        lang.add("SERVLET");
        lang.add("EJB");
        lang.add("PHP");
        lang.add("PERL");
        
        en = lang.elements();
        
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }


	}
}
