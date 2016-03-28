package homework_Lesson27;

public class Demo {

	public static void main(String[] args) {

		Scheduler scheduler = new Scheduler();
		scheduler.push(()-> {System.out.println("Wash the dishes");});
		scheduler.push(()-> {System.out.println("Clean the closet");});
		scheduler.push(()-> {System.out.println("Mop the floor");});
		scheduler.push(()-> {System.out.println("Go for a walk");});

		scheduler.main();
	}
}
