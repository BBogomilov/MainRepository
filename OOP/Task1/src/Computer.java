package task1;

public class Computer {
	
	private int year;          
	private double price;    
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Windows XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNoteBook, double hardDiskMemory, double freeMemory, String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNoteBook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	int comparePrice(Computer c) {
		if(this.price > c.price)
			return -1;

		else if(this.price < c.price)
			return 1;
		
		else return 0;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}
	
	void useMemory(int memory) {
		if(freeMemory >= memory)
		this.freeMemory -= memory;
		else System.out.println("Not enough free memory");
	}
	
	void print() {
		System.out.println("Year: " + this.year);
		System.out.println("Price: " + this.price);
		System.out.println("Is it notebook? " + this.isNotebook);
		System.out.println("Hard Disk Memory: " + this.hardDiskMemory);
		System.out.println("Free memory: " + this.freeMemory);
		System.out.println("Operation System: " + this.operationSystem);
	}

}
