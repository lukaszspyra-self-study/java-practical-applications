package bank.account.application;

public interface IBaseRate {

	// method providing base rate
	public default double baseRate() {
		return (Math.random() * 5 + 1);
	}

}
