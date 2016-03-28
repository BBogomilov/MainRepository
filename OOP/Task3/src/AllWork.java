package Encapsulation_references;

public class AllWork {

	private Task[] tasks;
	private int currentUnassignedTask; //index of undone task	
	private int freePlacesForTasks;
	
	
	 AllWork() {
		Task[] tasks = new Task[10];
		this.tasks = tasks;
		this.freePlacesForTasks = tasks.length;
		this.currentUnassignedTask = 0;
	}
	
	protected void addTask(Task task) {
		if(this.freePlacesForTasks <= 0) {
			System.out.println("there is no more space for new tasks");
		} else {
		this.tasks[(this.tasks.length-1) - (this.freePlacesForTasks-1)] = task;
		this.freePlacesForTasks--;
		}
	}
	
	public Task getNextTask() {
		if(this.getCurrentUnassignedTask() <= 9) {
			this.currentUnassignedTask++;
		return this.tasks[this.getCurrentUnassignedTask()-1];
		}
		
		else {
			return null;
		}
	}
	
	protected int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}
	
	protected Task[] getTasks() {
		return tasks;
	}
	
	protected boolean isAllWorkDone() {
		for(int i=0; i<this.tasks.length; i++) {
			if(this.tasks[i].getWorkingHours() == 0) {
				continue;
			}
			else return false;
		}
		return true;
	}
	
	
}
