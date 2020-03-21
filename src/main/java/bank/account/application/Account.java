package bank.account.application;

public abstract class Account implements IBaseRate {

	// Common setting of Checking and Saving accounts
	private String ownerName;
	private String sSn;
	private double accountBalance;
	private static int index = 10000;
	protected String accountNumber;
	private double rate;

	// Constructor with common settings and initialize the account
	public Account(String ownerName, String sSn, double initDeposit) {
		this.ownerName = ownerName;
		this.sSn = sSn;
		this.accountBalance = initDeposit;
		this.accountNumber = createAccountNumber();
		this.rate = baseRate();
	}

	private String createAccountNumber() {
		String accNum = sSn.substring(sSn.length() - 2, sSn.length());
		int uniqueId = ++index;
		int randomNum = (int) (Math.random() * 900 + 100);
		return accNum + uniqueId + randomNum;
	}

	// Common methods
	public void compound() {
		double accSavings = accountBalance * (rate / 100);
		accountBalance += accSavings;
		System.out.println("ACCRUED FOUNDS: $" + accSavings);
		displayAccountBalance();

	}

	public void deposit(double amount) {
		accountBalance += amount;
		System.out.println("DEPOSITING $" + amount);
		displayAccountBalance();
	}

	public void withdraw(double amount) {
		accountBalance -= amount;
		System.out.println("Withdrawing $" + amount);
		displayAccountBalance();
	}

	public void transfer(String destination, double amount) {
		accountBalance -= amount;
		System.out.println("TRANSFERING $" + amount + " TO " + "\"" + destination + "\"");
		displayAccountBalance();
	}

	public void displayAccountBalance() {
		System.out.println("ACCOUNT BALANCE: " + accountBalance);
	}

	protected void showInfo() {
		System.out.println("OWNER NAME: " + ownerName + "\nSOCIAL SECURITY NUMBER: " + sSn + "\nACCOUNT BALANCE: "
				+ accountBalance + "\nACCOUNT NUMBER: " + accountNumber + "\nRATE: " + rate + "%");
	}

}
