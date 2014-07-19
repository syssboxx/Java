
public class _17PassageParValeur {

	public static void main(String[] args) {
		String s = "China Blue";
        System.out.println(s);
        concatener(s, " Express");
        System.out.println(s);
        
        //version corrigee
        s= concatenerCorrect(s, "Express");
        System.out.println(s);

	}
	
	public static void concatener(String s, String s2)
    {
        s +=s2;
    }
	
	public static String concatenerCorrect(String s, String s2)
    {
        s +=s2;
        return s;
    }


}
