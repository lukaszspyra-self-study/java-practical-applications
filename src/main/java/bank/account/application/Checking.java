package bank.account.application;

public class Checking extends Account {

	// specific settings for checking
	private long debitCardNum;
	private int debitCardPin;

	// specific constructor
	public Checking(String ownerName, String sSn, double initDeposit) {
		super(ownerName, sSn, initDeposit);
		this.accountNumber = "2" + accountNumber;
		this.debitCardNum = createDebitCardNum();
		this.debitCardPin = createDebitCardPin();
	}

	private int createDebitCardPin() {
		return (int) (Math.random() * (Math.pow(10, 4) - Math.pow(10, 3) + 1) + Math.pow(10, 3));
	}

	private long createDebitCardNum() {
		// TODO Auto-generated method stub
		return (long) (Math.random() * ((Math.pow(10, 12) - 1) - Math.pow(10, 11) + 1) + Math.pow(10, 11));
	}

	@Override
	public double baseRate() {
		// rounding
		double val = super.baseRate() * 0.15;
		val = val * 100;
		val = Math.round(val);
		val = val / 100;
		return val;
	}

	@Override
	public void showInfo() {
		System.out.println("Your checking account details:");
		super.showInfo();
		System.out.println("DEBIT CARD NUMBER: " + debitCardNum + "\nDEBIT CARD PIN: " + debitCardPin);
	}

}
