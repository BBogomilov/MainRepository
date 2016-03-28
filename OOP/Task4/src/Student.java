package task2;

public class Student {

	String name;
	String subject;
	double grade;
	byte yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	 Student() {
		this.grade = 4;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	 Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear() {
		if(!this.isDegree)
			this.yearInCollege++;
		else System.out.println("The student has graduated");
		
		if(this.yearInCollege ==4) {
			this.isDegree = true;
		}
	}
	
	double recieveScholarship(double min, double amount) {
		if(this.grade >= min && this.age < 30) {
			this.money += amount;
		}
		return this.money;
	}
	
}
