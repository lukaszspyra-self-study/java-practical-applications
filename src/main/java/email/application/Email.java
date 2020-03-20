package email.application;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private int passwordLength;
	private String password;
	private String emailAddress;
	private int emailBoxCapacity;
	private String alternateEmail;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.passwordLength = 8;
		this.password = generatePassword(passwordLength);
		this.emailAddress = this.firstName + "." + this.lastName + "@" + this.department + ".AXECompany.com";
		this.emailBoxCapacity = 500;

		System.out
				.println("\nEmployee: " + this.firstName + ", department: " + this.department + "\n");
		System.out.println("EMAIL PASSWORD: " + this.password);
	}

	private String setDepartment() {
		System.out.print("Department Codes: \n[1] Sales \n[2] Development \n[3] Accounting \n[0] None \nENTER CODE: ");
		Scanner inputScanner = new Scanner(System.in);
		int depCode = inputScanner.nextInt();

		switch (depCode) {
		case 1:
			return "Sales";
		case 2:
			return "Development";
		case 3:
			return "Accounting";
		default:
			return "None";
		}
	}

	private String generatePassword(int passLength) {
		String passCharacter = "ABCDEFGHIJKLMNOPRSTUQVWXYZ!@#$%&";
		char[] password = new char[passLength];

		for (int i = 0; i < passLength; i++) {
			int randomInt = (int) (Math.random() * passCharacter.length());
			password[i] = passCharacter.charAt(randomInt);
		}
		return new String(password);
	}

	// Define public API to set password
	public void setPassword(String password) {
		this.password = password;
	}

	// Define public API to set emailBoxCapacity
	public void setEmailBoxCapacity(int capacity) {
		this.emailBoxCapacity = capacity;
	}

	// Define public API to set altEmail
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	public String getPassword() {
		return password;
	}

	public int getEmailBoxCapacity() {
		return emailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String showInfo() {
		return ("NAME: " + firstName + " " + lastName + "\nEMAIL: " + emailAddress + "\nEMAIL BOX CAPACITY: "
				+ emailBoxCapacity);
	}

}