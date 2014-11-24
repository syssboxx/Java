package lesson16_Interface_Bank;

public class BankDemo {

	public static void main(String[] args) {

		Bank bank = new Bank(new BusinessAccountOpener());
		
		Account mainAccount = new CurrentAccount("12345");
		Account mySavings = new SavingsAccount("123", 1);
		
		bank.add(mainAccount);
		bank.add(mySavings);
		
		mainAccount.deposit(5000);
		mainAccount.withdraw(6000);
		mySavings.deposit(100);
		
		for(int i=0; i < bank.size(); ++i) {
			System.out.println(bank.get(i).toString());
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		bank.updateAll();
		
		for(int i=0; i < bank.size(); ++i) {
			System.out.println(bank.get(i).toString());
			System.out.println();
		}
	}

}
