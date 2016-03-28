package homework8_Inheritance;

public class Employee extends Person{

	private double daySalary;
	
	Employee(String name, boolean isMale, int age, double salary) {
		super(name, age, isMale);
		setSalary(salary);
	}
	
	protected Double getSalary() {
		return this.daySalary;
	}
	
	protected void setSalary(double salary) {
		if(salary > 0) {
		this.daySalary = salary;
		}
		else System.out.println("Invalid salary validation");
	}
	
	
	protected double calculateOvertime(double hours) {
		if(getAge() >= 18) {
			return hours*((this.getSalary()/8)*1.5) ; // Можем да си направим променлива dailyWorktime, но тъй като
		}											 //  не е указано в задачата, ще вземем за работно време 8 чАса
		 return -1;
	}
	
	protected void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Employee's day salary: " + getSalary());
	}
}
