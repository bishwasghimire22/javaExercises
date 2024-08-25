package JavaBankApplication;

// ************************************************************************
// Account.java	  Template created on15.9.2016
// - The class for Account objects
// ************************************************************************
public class Account {
	// Fields
	private String accountnumber;
	private double balance;

	// Constructor
	public Account(String accountnumber) {
		this.accountnumber = accountnumber;
		this.balance = 0;
	}

	// Methods
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}

	public String getAccountNumber() {
		return this.accountnumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean withdraw(double amount) {
		if (amount >= this.balance && amount > 0) {
			this.balance -= amount;
			return true;
		} else {
			return false;
		}
	}

}
// End

/*- accountNumber : String
 *  - balance : double 
 *+ Account(accountNumber : String)  
 * + deposit(double amount) : void 
 * + getAccountNumber : String 
 * + getBalance() : double 
 * + withdraw(double amount) : boolean */