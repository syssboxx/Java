package lesson17_Interface_Notepad;


public class NotepadDemo {
	
	public static void main(String[] args) {
		
	  	Page p = new Page();
		p.setTitle("Java");
		p.addText("This is the beginning 123....");
		
		
		System.out.println("\nSMALL NOTEPAD");
		
		SmallNotepad small = new SmallNotepad();
		small.addPage(p);
		small.addPage(new Page("C++", "Pretty cool"));
				
		System.out.println(small.getView());
		
		small.searchWord("php");
		small.searchWord("this");
		small.printAllPagesWithDigits();
		
		
		
		System.out.println("\nELECTRONIC NOTEPAD - default password 0000");
		
		ElectronicSecuredNotepad electronic = new ElectronicSecuredNotepad();
		System.out.printf("Device started - %s ",electronic.isStarted());
		
		electronic.start();
		
		electronic.changePassword("1234");
		
		electronic.addPage(p);
		electronic.addPage(new Page("C++", "Pretty cool! "));
		electronic.addTextOn("\nAnd exciting! :)", 1);
		
		System.out.println(electronic.getView());
	
		electronic.searchWord("cool");
		electronic.printAllPagesWithDigits();
		electronic.stop();
		
		
		
		//System.out.println("\nSECURED NOTEPAD - password 1234");
		
		//secure notepad without password set 
//		SecureNotepad secure = new SecureNotepad();
//		secure.setPassword("1234");
//		
//		secure.addPage(p);
//		secure.addPage(new Page("C++", "Pretty cool! "));
//				
//		System.out.println(secure.getView());
//		
//		secure.searchWord("cool");
//		secure.printAllPagesWithDigits();
		
		
		System.out.println("\nSECURED NOTEPAD WITH STRONG PASSWORD");
		
		SecureNotepad secureStrong = new SecureNotepad("");
		//1aF@2o
		
		secureStrong.addPage(p);
		secureStrong.addPage(new Page("C++", "Pretty cool!"));
		
		System.out.println(secureStrong.getView());
		secureStrong.searchWord("cool");
		secureStrong.printAllPagesWithDigits();
		
			
	}
	
	

}
