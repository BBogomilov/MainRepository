package homework8_Inheritance;

public class Person {

	private String name;
	private int age;
	private boolean isMale;
	
	
	Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		setIsMale(isMale);
	}
	
	public void showPersonInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Sex: " + (isMale?"Male":"Female"));
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected boolean isMale() {
		return isMale;
	}

	protected void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}

}
