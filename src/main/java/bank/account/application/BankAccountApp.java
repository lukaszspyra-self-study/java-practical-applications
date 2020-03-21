package bank.account.application;

public class BankAccountApp {

	public static void main(String[] args) {
		// Load file

		// Save file into data structure

		Checking checkAcc1 = new Checking("Martin Cornick", "27541328903", 4300);
		checkAcc1.showInfo();
		checkAcc1.withdraw(200);
		checkAcc1.deposit(2000);
		checkAcc1.transfer("Friend of mine", 500);
		checkAcc1.compound();
		System.out.println("**************");
		Savings savAcc1 = new Savings("Coroline Wozniacki", "26354875946", 2870);
		savAcc1.showInfo();
		System.out.println("**************");

	}

}
