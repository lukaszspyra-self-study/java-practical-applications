package student.database.application;

import java.util.Scanner;

public class StudentDatabaseApp {

	private Scanner inputScanner;
	private Student[] students;
	private int studentsNum;

	public StudentDatabaseApp() {

		System.out.print("How many students to add into database?\nENTER NUMBER: ");
		inputScanner = new Scanner(System.in);
		studentsNum = inputScanner.nextInt();
		inputScanner.nextLine();
		students = new Student[studentsNum];
		fillUpStudentData();

	}

	private void fillUpStudentData() {

		for (int i = 0; i < studentsNum; i++) {
			System.out.print("ENTER first name for student no." + (i + 1) + ": ");
			String firstName = inputScanner.nextLine();
			System.out.print("ENTER last name: ");
			String lastName = inputScanner.nextLine();
			System.out.print("Class year available [1-5]\nENTER class year: ");
			int classYear = inputScanner.nextInt();
			inputScanner.nextLine();
			students[i] = new Student(firstName, lastName, classYear);

		}
	}

	private void displayStudentInfo() {
		for (Student st : students) {
			System.out.println(st.toString());
		}
	}

	public static void main(String[] args) {
		StudentDatabaseApp studentDatabaseApp = new StudentDatabaseApp();
		studentDatabaseApp.displayStudentInfo();
		
	}
}
