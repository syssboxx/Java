package lesson16_Interface_Bank;

public class Bank {
	
	private static final int CAPACITY = 200;
	
	private Account[] accounts;
	private int size;
	private Opener opener;
	
	public Bank(Opener opener) {
		this.opener = opener;
		accounts = new Account[CAPACITY];
		size = 0;
	}
	
	public void add(Account account) {
		if (size < CAPACITY) {
			accounts[size] = account;
			++size;
			opener.open(account);
		}
	}
	
	public void remove(int index) {
		if (index >= 0 && index < size) {
			for(int i=index; i < size; ++i) {
				accounts[i] = accounts[i + 1];
			}
			--size;
			accounts[size] = null;
		}
	}
	
	public void updateAll() {
		for(int i=0; i < size; ++i) {
			accounts[i].update();
		}
	}
	
	public int size() {
		return size;
	}
	
	public Account get(int index) {
		return accounts[index];
	}
}
