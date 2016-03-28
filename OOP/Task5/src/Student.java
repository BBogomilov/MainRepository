package homework8_Inheritance;

public class Student extends Person{

	private double score;
	
	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}
	
	
	protected double getScore() {
		return score;
	}

	protected void setScore(double score) {
		if(score >= 2 && score <= 6) {
		this.score = score;
		}
		else System.out.println("Score value is not valid");
	}
	
	protected void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("Student's score: " + getScore());
	}

}
