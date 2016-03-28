package homework_Lesson27;

import java.util.LinkedList;

public class Scheduler {

	private LinkedList<Task> queue;
	
	Scheduler() {
		queue = new LinkedList<Task>();
	}
	
	void push(Task task) {
		this.queue.add(task);
		System.out.println("Task added");
	}
	
	void main() {
		if(!this.queue.isEmpty()) {
		this.queue.peek().doWork();
		this.queue.poll();
		System.out.println("Task finished and removed from this scheduler");
		main();
		}
		else System.out.println("There are no more tasks to work on");
		return;
	}
}
