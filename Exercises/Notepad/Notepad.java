package lesson17_Interface_Notepad;

public interface Notepad {
	
	void addTextOn(String text, int pageNumber);
	void setTextOn(String text, int pageNumber);
	void deleteTextOn(int pageNumber);
	String getView();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
