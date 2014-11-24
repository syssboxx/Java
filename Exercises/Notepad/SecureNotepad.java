package lesson17_Interface_Notepad;

import java.util.Scanner;

public class SecureNotepad extends AbstractNotepad {
	
	private final int MIN_SYMBOL_COUNT = 1;
	private final int MIN_PASSWORD_LENGTH = 5;
	
	private final Scanner sc = new Scanner(System.in);
	
	private String password;
	private boolean isPasswordSet = false;
	
	public SecureNotepad(){
		super();
	}
	
	public SecureNotepad(String password){
		super();
		password = requestPassword();
		if(checkStrongPassword(password)){
			this.password = password;
			System.out.println("Secure Notepad created");
			setPassword(password);
		}else{
			this.password = null;
			isPasswordSet = false;
			System.out.println("Secure Notepad can not be created without strong password");
		}
	}
	
	public void setPassword(String password) {
		
		if (!isPasswordSet) {			
			this.password = password;
			isPasswordSet = true;
		}
	}
	
	public void changePassword(String newPassword) {
		if (login()) {
			isPasswordSet = false;
			setPassword(newPassword);
		}
	}

	@Override
	public void addTextOn(String text, int pageNumber) {
				
		if (login()) {
			get(pageNumber).addText(text);
		}
		
	}

	@Override
	public void setTextOn(String text, int pageNumber) {
		
		if (login()) {
			get(pageNumber).setText(text);
		}
	}

	@Override
	public void deleteTextOn(int pageNumber) {
		
		if (login()) {
			get(pageNumber).deleteText();
		}
		
	}
	
	@Override
	public String getView() {
		if (login()) {
			return super.getView();
		}
		return new String("Unable to view pages.");
	}
	
	private String requestPassword() {
		
		System.out.println("Enter password: ");
		String password = sc.next();
		return password;
		
	}
	
	public boolean checkStrongPassword(String password){
				
		int countDigit =0;
		int countLowerLetter = 0;
		int countUpperLetter = 0;
		
		if (password.length() < MIN_PASSWORD_LENGTH){
			return false;
		}
		else {
			
			for (int i = 0; i < password.length(); i++) {
				if (Character.isDigit(password.charAt(i))){
					countDigit++;
				}
				if(Character.isLowerCase(password.charAt(i))){
					countLowerLetter++;
				}
				if(Character.isUpperCase(password.charAt(i))){
					countUpperLetter++;
				}
			}
			
			if (countUpperLetter >= MIN_SYMBOL_COUNT && countLowerLetter >= MIN_SYMBOL_COUNT && countDigit >=MIN_SYMBOL_COUNT) {
				return true;
			}
			
			return false;
		}
	}
	
	private boolean login() {
		if (!isPasswordSet) {
			System.out.println("Password not set. Unable to make operations with notepad.");
			return false;
		}
		
		String enteredPassword = requestPassword();
		
		if (enteredPassword.equals(password)) {
			return true;
		}
		
		System.out.println("Incorrect password.");
		return false;
	}
	
	@Override
	public boolean searchWord(String word) {
		if (login()){
			if (super.searchWord(word)){
				return true;
			}
		}
		
		return false;
		
	}

	@Override
	public void printAllPagesWithDigits() {
		if (login()){
			super.printPagesWithDigits();
		}
		
	}
}
