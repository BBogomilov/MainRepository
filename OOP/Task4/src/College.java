package task2;

public class College {

	public static void main(String[] args) {
		
		
		Student gosho = new Student("Georgi", "Sociology", 22);
		Student tisho = new Student("Tihomir", "Information Systems", 20);
		Student petq = new Student("Petya", "Sociology", 23);
		Student desi = new Student("Desislava", "Finance", 21);
		Student ivo = new Student("Ivelin", "Information Systems", 22);

		
		gosho.grade = 6;
		petq.grade = 5.40;
		tisho.grade = 5;
		
		gosho.recieveScholarship(5, 350);
		tisho.recieveScholarship(5, 300);
		petq.recieveScholarship(5, 300);
	
		petq.upYear();
		ivo.upYear();
		desi.upYear();
		
		StudentGroup sociologyGroup = new StudentGroup("Sociology");
		StudentGroup informationSystemsGroup = new StudentGroup("Information Systems");
		
		sociologyGroup.addStudent(gosho);
		sociologyGroup.addStudent(petq);
		
		informationSystemsGroup.addStudent(tisho);
		informationSystemsGroup.addStudent(ivo);
		
		System.out.println(informationSystemsGroup.theBestStudent());
		System.out.println();
		
		sociologyGroup.printStudentsInGroup();
	}

}
