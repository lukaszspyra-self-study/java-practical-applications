package bank.account.application;

public class Savings extends Account {

	// specific settings for savings
	private int safetyDepositId;
	private int safetyDepositCode;

	// specific constructor
	public Savings(String ownerName, String sSn, double initDeposit) {
		super(ownerName, sSn, initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("Savings");
	}

	// specific methods
	public void depositBox() {

	}

	public void topUpBox() {

	}

	@Override
	public double baseRate() {
		// TODO Auto-generated method stub
		return (super.baseRate() - 0.25 * super.baseRate());
	}

	@Override
	protected String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo() + getSafetyDepositCode() + getSafetyDepositId();
	}

	int getSafetyDepositId() {
		return safetyDepositId;
	}

	int getSafetyDepositCode() {
		return safetyDepositCode;
	}

}
