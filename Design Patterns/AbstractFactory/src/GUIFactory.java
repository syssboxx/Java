
public class GUIFactory {

	private GUIFactory(){
        //make private constructor..
    }
     
    public static Button createButton(){
         
        String os = null;
        /**
         * this method should work based on the operating system
         * it is running on. First we need to decide which operating 
         * system is it.
         * 
         * for the example purpose, i will hardcode OS as windows.
         */
         
        os = "windows"; //this is hardcoded value. it should be assigned
                        // with dynamic logic.
        if("windows".equalsIgnoreCase(os)){
            return new WindowsFactory().createButton();
        } else if("mac".equalsIgnoreCase(os)){
            return new MacOsFactory().createButton();
        }
         
        return null;
    }

}
