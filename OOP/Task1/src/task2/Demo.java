package task2;

public class Demo {

	public static void main(String[] args) {
		
		GSM az = new GSM();
		az.model = "Sony";
		GSM drug = new GSM();
		drug.model = "HTC";
		GSM treti = new GSM();
		treti.model = "Samsung";
		
		int[] number = {0,8,5,4,3,4,5,4,7,6,9,0};
		int[] number2 = {0,8,7,4,9,9,5,0,1,6,9,2};
		int[] number3 = {0,8,9,2,5,4,5,4,0,7,7,1};
		
		az.insertSimCard(number);
		drug.insertSimCard(number2);
		treti.insertSimCard(number3);
		
		az.call(drug, 3.6);
		drug.call(treti, 5.9);
		
		az.printInfoForTheLastOutGoingCall();
		treti.printInfoForTheLastInComingCall();
		
		System.out.println(az.getSumForCall());
		System.out.println(drug.getSumForCall());

	}

}
