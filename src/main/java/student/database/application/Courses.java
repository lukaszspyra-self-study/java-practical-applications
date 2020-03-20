package student.database.application;

public enum Courses {
	History(600), Mathematics(1000), English(600), Chemistry(700), ComputerScience(1000);

	Courses(int cost) {
		courseCost = cost;
	}

	int courseCost;

}
