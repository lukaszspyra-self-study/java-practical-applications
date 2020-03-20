package bank.account.application;

public abstract class Account implements IBaseRate {

	// Common setting of Checking and Saving accounts
	protected String ownerName;
	protected String sSn;
	private double accountBalance;
	private static int index = 10000;
	String accountNumber;
	private double rate;

	// Constructor with common settings and initialize the account
	public Account(String ownerName, String sSn, double initDeposit) {
		this.ownerName = ownerName;
		this.sSn = sSn;
		this.accountBalance = initDeposit;
		System.out.println("Account");
		this.accountNumber = createAccountNumber();
	}

	private String createAccountNumber() {
		String accNum = sSn.substring(sSn.length() - 2, sSn.length());
		int uniqueId = ++index;
		int randomNum = (int) (Math.random() * 900 + 100);
		return accNum + uniqueId + randomNum;
	}

	// Common methods
	protected void deposit(int amount) {

	}

	protected void withdraw(int amount) {

	}

	protected void transfer(int amout, int orgAccount, int destAccount) {

	}

	protected String showInfo() {
		return "Account [ownerName=" + ownerName + ", sSn=" + sSn + ", accountBalance=" + accountBalance
				+ ", accountNumber=" + accountNumber + ", rate=" + rate + "]";
	}

}
