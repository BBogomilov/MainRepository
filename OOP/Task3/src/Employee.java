package Encapsulation_references;

public class Employee {

	
	private final String name;
	private Task currentTask;
	private double hoursLeft;
	private AllWork allWork;
	
	Employee(String name) {
		if(name.length()>0)
			this.name = name;
		else this.name = "Gosho";
	}
	
	protected void startWorkingDay() {
		this.setHoursLeft(8);
	}
	
	public Task getCurrentTask() {
		return currentTask;
	}
	
	protected void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public String getName() {
		return name;
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	protected void setHoursLeft(double hoursLeft) {
		if(hoursLeft >= 0)
		this.hoursLeft = hoursLeft;
		else System.out.println("Invalid value of hours left");
	}
	
	public AllWork getAllWork() {
		return allWork;
	}

	protected void setAllwork(AllWork allwork) {
		this.allWork = allwork;
	}

	protected void work() {
		
		if(this.getCurrentTask() == null || this.getCurrentTask().getWorkingHours() == 0){
			this.setCurrentTask(this.getAllWork().getNextTask());
			if(this.getCurrentTask() == null) {
				//System.out.println("There is no task for this employee to do");
				return;
			}
		}
		System.out.println(this.getName() + " working on " + this.getCurrentTask().getName());
		
			if(this.getHoursLeft() < this.getCurrentTask().getWorkingHours()) {
				this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours() - this.getHoursLeft());
				this.setHoursLeft(0);
				System.out.println(this.getName() + " has finished his working hours for the day");
				showReport ();
				
			}
			else if(this.getHoursLeft() > this.getCurrentTask().getWorkingHours()) {
				this.setHoursLeft(this.getHoursLeft() - this.getCurrentTask().getWorkingHours());
				this.getCurrentTask().setWorkingHours(0);
				System.out.println(this.getCurrentTask().getName() + " done!");
			    showReport ();
			    this.setCurrentTask(this.getAllWork().getNextTask());
			    work();
			}
			else {
				this.setHoursLeft(0);
				this.getCurrentTask().setWorkingHours(0);
				System.out.println(this.currentTask.getName() + " done!");
				System.out.println(this.getName() + " has finished his working hours for the day");
				showReport ();
			}
	}
	
	private void showReport () {
		System.out.println("His working hours left for the day: " + this.getHoursLeft());
		System.out.println("His hours left for the task to be finished:" + this.getCurrentTask().getWorkingHours());
		System.out.println();
	}
}
