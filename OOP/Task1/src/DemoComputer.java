package task1;

public class DemoComputer {

	public static void main(String[] args) {
		
	/*	Computer pc1 = new Computer();
		Computer pc2 = new Computer();
		
		pc1.year = 2005;
		pc1.price = 560.70;
		pc1.isNotebook = false;
		pc1.hardDiskMemory = 640;
		pc1.freeMemory = 250;
		pc1.operationSystem = "Windows Vista";
		
		pc2.year = 2011;
		pc2.price = 1160.50;
		pc2.isNotebook = true;
		pc2.hardDiskMemory = 1040;
		pc2.freeMemory = 870;
		pc2.operationSystem = "Windows 7";
		
		pc1.useMemory(100);
		
		pc2.changeOperationSystem("Windows 8.1");
		
		pc1.print();
		System.out.println();
		pc2.print(); */
		
		Computer pc = new Computer(2009, 400, 750, 600);
		Computer otherPc = new Computer();
		otherPc.setPrice(180);
		Computer anotherPc = new Computer(1996, 40.75, false, 30, 8.7, "Windows 95");
		
		switch(pc.comparePrice(otherPc)) {
		case 1: System.out.println("First computer has bigger price");
		break;
		case -1: System.out.println("Second computer has bigger price");
		break;
		case 0: System.out.println("Computers have equal price");
		}
		switch(anotherPc.comparePrice(pc)) {
		case 1: System.out.println("First computer has bigger price");
		break;
		case -1: System.out.println("Second computer has bigger price");
		break;
		case 0: System.out.println("Computers have equal price");
		}

	}

}
