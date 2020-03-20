package bank.account.application;

public class Checking extends Account {

	// specific settings for checking
	private int debitCardNum;
	private int debitCardPin;

	// specific constructor
	public Checking(String ownerName, String sSn, double initDeposit) {
		super(ownerName, sSn, initDeposit);
		accountNumber = "2" + accountNumber;
		System.out.println("Checking");
	}

	// specific methods
	public void cardWithdraw() {

	}

	public void cardTopUp() {

	}

	@Override
	public double baseRate() {
		// TODO Auto-generated method stub
		return (0.15 * super.baseRate());
	}

	@Override
	protected String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo() + getDebitCardNum() + getDebitCardPin();
	}

	int getDebitCardNum() {
		return debitCardNum;
	}

	int getDebitCardPin() {
		return debitCardPin;
	}

}
