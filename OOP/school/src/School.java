package school;

public class School {
	
	private String name;
	private Teacher[] teachers;
	private StudentGroup[] allGroups;
	private Student[] allStudents;
	
	protected void addStudent(Student student) {
		boolean flag = false;
		for(int i=0; i <this.allStudents.length; i++) {
			if(this.allStudents[i] != null) {
				this.allStudents[i] = student;
				flag = true;
			}
		}
		if(!flag)
			System.out.println("There is no more space for new students");
	}
	
	protected void addTeacher(Teacher teacher) {
		boolean flag = false;
		for(int i=0; i <this.teachers.length; i++) {
			if(this.teachers[i] != null) {
				this.teachers[i] = teacher;
				flag = true;
			}
		}
		if(!flag)
			System.out.println("There is no more space for new teachers");
	}
	
	protected void addStudentGroup(StudentGroup studentGroup) {
		boolean flag = false;
		for(int i=0; i <this.allGroups.length; i++) {
			if(this.allGroups[i] != null) {
				this.allGroups[i] = studentGroup;
				flag = true;
			}
		}
		if(!flag)
			System.out.println("There is no more space for new student groups");
	}
}
