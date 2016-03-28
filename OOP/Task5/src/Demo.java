package homework8_Inheritance;

public class Demo {

	public static void main(String[] args) {
		
//Ще гръмне, защото в наследеният клас Person сме задали конструкторът да е с параметри(автоматично конструкторът му
//по подразбиране отпада) и когато в подкласа направим конструктор, той трябва задължително в тялото си да вика 
//конструкторът на суперкласа си, освен ако конструкторът на суперкласа е оставен по подразбиране. Ако не бяхме бутали 
//конструктора в Person и беше оставен по подразбиране(или направим нов по подразбиране), конструкторът на подкласа Student
//автоматично щеще да викне конструкторът по подразбиране на Person.
			 
		Person[] group = new Person[10];

		Student s1 = new Student("Nadq", 22, false, 4.80);
		Student s2 = new Student("Nikolai", 25, true, 3.60);
		Employee e1 = new Employee("Penka", false, 46, 30);
		Employee e2 = new Employee("Gosho", true, 43, 50);
		Person p1 = new Person("Kaloyan", 19, true);
		Person p2 = new Person("Misho", 4, true);

		group[0] = s1;
		group[1] = s2;
		group[2] = e1;
		group[3] = e2;
		group[4] = p1;
		group[5] = p2;

		for (int i = 0; i < group.length; i++) {
			if (group[i] instanceof Employee && group[i] != null) {
				((Employee) group[i]).showEmployeeInfo();
				System.out.println();
			} else if (group[i] instanceof Student && group[i] != null) {
				((Student) group[i]).showStudentInfo();
				System.out.println();
			} else if (group[i] != null) {
				group[i].showPersonInfo();
				System.out.println();
			}
		}
		
		for(int i=0; i<group.length; i++) {
			if(group[i] instanceof Employee && group[i] != null) {
				System.out.println("Overtime bonuses: " + ((Employee)group[i]).calculateOvertime(2));
			}
		}
		
	}

}
