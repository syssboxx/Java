package lesson17_Interface_Notepad;

public class SmallNotepad extends AbstractNotepad {

	private static final int MAX_SYMBOLS = 1000;
	
	@Override
	public void addTextOn(String text, int pageNumber) {
		
		Page page = get(pageNumber);
		if (page.getText().length() + text.length() <= MAX_SYMBOLS) {			
			page.addText(text);
		}
	}

	@Override
	public void setTextOn(String text, int pageNumber) {
		
		if (text.length() <= MAX_SYMBOLS) {			
			get(pageNumber).addText(text);
		}		
	}

	@Override
	public void deleteTextOn(int pageNumber) {
		get(pageNumber).deleteText();
		
	}
	@Override
	public String getView() {
		return super.getView();
	}
	
	@Override
	public boolean searchWord(String word) {
		if (super.searchWord(word)){
			return true;
		}
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		super.printPagesWithDigits();
	}
	
	
}
