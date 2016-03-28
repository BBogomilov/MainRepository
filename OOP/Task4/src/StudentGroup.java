package task2;

public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		Student[] group = new Student[5];
		this.students = group;
		this.freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (this.groupSubject.equalsIgnoreCase(s.subject) && this.freePlaces > 0) {
			int i = 0;
			boolean flag = false;
			while (!flag) {
				if (students[i] == null) {
					students[i] = s;
					this.freePlaces--;
					flag = true;
				} else
					i++;
			}
		} else
			System.out.println("Student's subject is different or there aren't any free places in the group");
	}

	void emptyGroup() {
		Student[] group = new Student[5];
		this.students = group;
		this.freePlaces = 5;
	}

	String theBestStudent() {
		double bestGrade = this.students[0].grade;
		int index = 0;
		for (int i = 1; i < 5 - this.freePlaces; i++) {
			if (this.students[i].grade > bestGrade) {
				bestGrade = this.students[i].grade;
				index = i;
			}
		}
		return this.students[index].name;
	}

	void printStudentsInGroup() {
		for (int i = 0; i < 5 - this.freePlaces; i++) {
			System.out.println("Student " + (i + 1) + ":");
			System.out.println("Name: " + this.students[i].name);
			System.out.println("Age: " + this.students[i].age);
			System.out.println("Has degree? " + (this.students[i].isDegree ? "yes" : "no"));

			if (!this.students[i].isDegree) {
				System.out.println("Year in college: " + this.students[i].yearInCollege);
				System.out.println("Subject: " + this.students[i].subject);
				System.out.println("Grade: " + this.students[i].grade);
				System.out.println("Money: " + this.students[i].money);
			}
			System.out.println();
		}
	}
}
