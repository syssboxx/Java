package lesson16_Interface_Bank;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount(String accountNumber, double interesetRate) {
		super(accountNumber);
		
		if (interesetRate >= 0) {			
			this.interestRate = interesetRate;
		} else {
			this.interestRate = 14;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		
		if (getBalance() - amount >= 0) {
			super.withdraw(amount);
		}
	}
	
	@Override
	public void update() {
		double interest = ( getBalance() * interestRate ) / 100;
		deposit(interest);
	}
	
	@Override
	public String toString() {
		return String.format("%s\nInterest rate: %.2f", super.toString(), interestRate);
	}
}
