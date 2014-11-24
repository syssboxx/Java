package lesson16_Interface_Bank;

public class CurrentAccount extends Account {

	private int overdraftLimit;
	
	public int getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public CurrentAccount(String accountNumber) {
		super(accountNumber);
	}
	
	@Override
	public void withdraw(double amount) {
		
		if (getBalance() - amount >= -overdraftLimit) {			
			super.withdraw(amount);
		}
	}
	
	@Override
	public void update() {
		if (getBalance() < 0) {
			sendLetter();
		}
	}
	
	private void sendLetter() {
		System.out.println("The account is in overdraft!");
	}
	
	@Override
	public String toString() {
		return String.format("%s\nOverdraft Limit: %d", super.toString(), overdraftLimit);
	}
}
