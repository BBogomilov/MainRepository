package Encapsulation_references;

public class Demo {

	public static void main(String[] args) {
		
		Employee stoicho = new Employee("Stoycho");
		Employee krasi = new Employee("Krasi");
		Employee ivan = new Employee("Ivan");
		Employee nedko = new Employee("Nedko");
		
		AllWork theWork = new AllWork();
		
		Task cleanWorkPlace = new Task("Clean your desk" ,1.50);
		Task googleResearch = new Task("Do some researches", 12);
		Task documentation = new Task("Search some stuff in the documentation room", 9);
		Task otherDocumentation = new Task("Rearrange the whole documentation - alphabetical order", 25);
		Task wipeTheFloor = new Task("Wipe the office floor", 8);
		Task makeFacebook = new Task("Make Facebook", 22);
		Task buyFood = new Task("Buy some food for your colegues", 3.50);
		Task makeTwitter = new Task("Make Twitter", 20);
		Task makeOlx = new Task("Make OLX", 17);
		Task cleanTheCloset = new Task("Clean the colset", 9);
		
		theWork.addTask(cleanWorkPlace);
		theWork.addTask(googleResearch);
		theWork.addTask(documentation);
		theWork.addTask(otherDocumentation);
		theWork.addTask(wipeTheFloor);
		theWork.addTask(makeFacebook);
		theWork.addTask(buyFood);
		theWork.addTask(makeTwitter);
		theWork.addTask(makeOlx);
		theWork.addTask(cleanTheCloset);
		
		stoicho.setAllwork(theWork);
		krasi.setAllwork(theWork);
		ivan.setAllwork(theWork);
		nedko.setAllwork(theWork);
		
		int day=1;
		
		while(true) {
			System.out.println("------------------");
			System.out.println("Day " + day + ":");
			
			stoicho.startWorkingDay();
			krasi.startWorkingDay();
			ivan.startWorkingDay();
			nedko.startWorkingDay();
			
			stoicho.work();
			krasi.work();
			ivan.work();
			nedko.work();
			
			if(theWork.isAllWorkDone()) {
				System.out.println("The whole work is done!");
				break;
			}
			day++;
		}

	}

}
