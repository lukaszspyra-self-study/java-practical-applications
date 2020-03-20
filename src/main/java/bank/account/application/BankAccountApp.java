package bank.account.application;

public class BankAccountApp {

	public static void main(String[] args) {
		// Load file

		// Save file into data structure

		Account acc1 = new Checking("John Bravo", "253746589", 1500);
		System.out.println(acc1.showInfo());
		Checking checkAcc1 = new Checking("Martin Cornick", "27541328903", 4300);
		System.out.println(checkAcc1.showInfo());
		Savings savAcc1 = new Savings("Coroline Wozniacki", "26354875946", 2870);
		System.out.println(savAcc1.showInfo());
	}

}
