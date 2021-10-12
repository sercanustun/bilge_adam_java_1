package AtmProject;

public class Account extends Atm {
	protected int balance = 10000;
	
	public Account() {
		super();
	}
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
}
