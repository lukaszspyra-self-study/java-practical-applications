package bank.account.application;

public class Savings extends Account {

	// specific settings for savings
	private int safetyDepositId;
	private int safetyDepositCode;

	// specific constructor
	public Savings(String ownerName, String sSn, double initDeposit) {
		super(ownerName, sSn, initDeposit);
		this.accountNumber = "1" + accountNumber;
		this.safetyDepositId = createSafetyDepositId();
		this.safetyDepositCode = createSafetyDepositCode();

	}

	private int createSafetyDepositCode() {
		return (int) (Math.random() * (Math.pow(10, 4) - Math.pow(10, 3) + 1) + Math.pow(10, 3));
	}

	private int createSafetyDepositId() {
		return (int) (Math.random() * (Math.pow(10, 3) - Math.pow(10, 2) + 1) + Math.pow(10, 2));
	}

	@Override
	public double baseRate() {
		return (super.baseRate() - 0.25);
	}

	@Override
	public void showInfo() {
		System.out.println("Your savings account details:");
		super.showInfo();
		System.out.println(
				"SAFETY DEPOSIT BOX ID: " + safetyDepositId + "\nSAFETY DEPOSIT BOX CODE: " + safetyDepositCode);
	}

}
