package email.application;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private int defaultPasswordLength;
	private String password;
	// private int mailBoxCapacity;
	// private String alternateEmail;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.defaultPasswordLength = 8;
		this.password = generatePassword(defaultPasswordLength);

		System.out.println(
				"Email created for: " + this.firstName + " " + this.lastName + ", department: " + this.department);
		System.out.println("Your password: " + this.password);
	}


	private String setDepartment() {
		System.out.print("Deaprtment Codes: \n[1] Sales \n[2] Development \n[3] Accounting \n[0] None \nENTER CODE: ");
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

}
