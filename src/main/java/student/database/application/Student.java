package student.database.application;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Scanner;

public class Student {

	private static int uniqueID = 1000;
	private Scanner input = new Scanner(System.in);
	
	private String firstName;
	private String lastName;
	private int classYear;
	private String studentId;
	private EnumSet<Courses> coursesEnrolled;
	private int tuitionBalance;

	public Student(String firstName, String lastName, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.classYear = year;
		this.studentId = createUniqueId(year);
		this.coursesEnrolled = enroll();
		this.tuitionBalance = payTuition();
	}

	private int payTuition() {
		System.out.print("How much you want to pay? ENTER AMOUNT: $");
		tuitionBalance -= input.nextInt();
		input.nextLine();
		return tuitionBalance;
	}

	private EnumSet<Courses> enroll() {
		coursesEnrolled = EnumSet.noneOf(Courses.class);
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Available course codes to enroll:\n[1] History\n[2] Mathematics\n[3] English\n[4] Chemistry\n[5] Computer Science\n[0] TO QUIT\nENTER CODE: ");
			int courseCode = input.nextInt();
			input.nextLine();
			switch (courseCode) {
			case 1: {
				coursesEnrolled.add(Courses.History);
				tuitionBalance += Courses.History.courseCost;
				break;
			}
			case 2: {
				coursesEnrolled.add(Courses.Mathematics);
				tuitionBalance += Courses.Mathematics.courseCost;
				break;
			}
			case 3: {
				coursesEnrolled.add(Courses.English);
				tuitionBalance += Courses.English.courseCost;
				break;
			}
			case 4: {
				coursesEnrolled.add(Courses.Chemistry);
				tuitionBalance += Courses.Chemistry.courseCost;
				break;
			}
			case 5: {
				coursesEnrolled.add(Courses.ComputerScience);
				tuitionBalance += Courses.ComputerScience.courseCost;
				break;
			}
			default:
				flag = false;
				break;
			}
		}
		return coursesEnrolled;
	}

	private String createUniqueId(int studyYear) {
		return String.valueOf(studyYear) + (++uniqueID);
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", classYear=" + classYear
				+ ", studentId=" + studentId + ", coursesEnrolled=" + coursesEnrolled + ", tuitionBalance="
				+ tuitionBalance + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getClassYear() {
		return classYear;
	}

	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}

	public EnumSet<Courses> getCoursesEnrolled() {
		return coursesEnrolled;
	}

	public int getTuitionBalance() {
		return tuitionBalance;
	}

	public static int getUniqueID() {
		return uniqueID;
	}

	public String getStudentId() {
		return studentId;
	}

}
