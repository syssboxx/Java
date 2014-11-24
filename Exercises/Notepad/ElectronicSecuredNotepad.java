package lesson17_Interface_Notepad;

public class ElectronicSecuredNotepad extends SecureNotepad implements ElectronicDevice {
	
	private static final String DEFAULT_PASSWORD ="0000";
	
	private boolean isStarted;
		
	public ElectronicSecuredNotepad(){
		super();
	}
	
	private void initializeDevice(){
		super.setPassword(DEFAULT_PASSWORD);
	}
	
	@Override
	public void changePassword(String newPassword) {
		super.changePassword(newPassword);
	}

	//from ElectronicDevice
	@Override
	public void start() {
		if (!isStarted()){
			isStarted = true;
			System.out.println("\nStaring device ...");
			initializeDevice();
		}
	}

	@Override
	public void stop() {
		if (isStarted){
			System.out.println("\nStopping device ...");
			isStarted = false;
		}
	}

	@Override
	public boolean isStarted() {
		return isStarted;
	}
	
	
	//from SecureNotepad
	@Override
	public void addTextOn(String text, int pageNumber) {
		if (isStarted){
			super.addTextOn(text, pageNumber);
		}else{
			System.out.println("Start device first.");
		}
		
	}
	
	@Override
	public void setTextOn(String text, int pageNumber) {
		if (isStarted){
			super.setTextOn(text, pageNumber);
		}
		
	}
	
	@Override
	public void deleteTextOn(int pageNumber) {
		if (isStarted){
			super.deleteTextOn(pageNumber);
		}
		
	}
	
	@Override
	public String getView() {
		if (isStarted){
			return super.getView();
		}
		return null;
	}
	
	@Override
	public boolean searchWord(String word) {
		if (isStarted){
			return super.searchWord(word);
		}
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if (isStarted){
			super.printAllPagesWithDigits();
		}
	}
}
