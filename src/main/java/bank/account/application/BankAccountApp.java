package bank.account.application;

import java.util.ArrayList;
import java.util.List;

import utilities.ReadCSV;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();

		// Load file
		String file = "C:\\Users\\Spyrka PC\\eclipse-workspace\\external files\\original.csv";
		List<String[]> bankClients = ReadCSV.read(file);

		// Create objects from file data
		for (String[] bankClient : bankClients) {
			String ownerName = bankClient[0];
			String sSn = bankClient[1];
			String accountType = bankClient[2];
			double initialBalance = Double.parseDouble(bankClient[3]);

			if (accountType.equals("Checking")) {
				accounts.add(new Checking(ownerName, sSn, initialBalance));
			} else if (accountType.equals("Savings")) {
				accounts.add(new Savings(ownerName, sSn, initialBalance));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE.");
			}
		}

		for (Account account : accounts) {
			System.out.println("***********************************");
			account.showInfo();
		}
	}

}
