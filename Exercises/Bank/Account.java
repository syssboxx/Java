package lesson16_Interface_Bank;

public abstract class Account {

	private static final int ACCOUNT_NUMBER_LENGTH = 5;
	private static final String DEFAULT_ACCOUNT_NUMBER = "11111";
	
	private double balance;
	private String accountNumber;
	
	public Account(String accountNumber) {
		
		if (validateAccountNumber(accountNumber)) {
			this.accountNumber = accountNumber;
		} else {
			this.accountNumber = DEFAULT_ACCOUNT_NUMBER;
		}
		
		balance = 0;
	}
	
	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		
		if (validateAccountNumber(accountNumber)) {			
			this.accountNumber = accountNumber;
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
		}
	}

	private static boolean validateAccountNumber(String number) {
		return number.length() == ACCOUNT_NUMBER_LENGTH;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f", accountNumber, balance);
	}
	
	public abstract void update();
}
