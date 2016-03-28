package task2;

public class GSM {

	String model;
	boolean hasSimCard;
	int[] simMobileNumber;
	double outGoingCallsDuration;
	Call lastInComingCall;
	Call lastOutGoingCall;
	
	void insertSimCard(int[] simMobileNumber) {
		if(simMobileNumber[0] == 0 && simMobileNumber[1] ==8 && simMobileNumber.length == 12) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}
		else System.out.println("Invalid phone number");
	}
	
	void removeSimCard() {
		this.hasSimCard = false;
	}
	
	void call(GSM reciever, double duration) {
		if(duration <= 0) {
		System.out.println("Invalid call duration");
		return;
		}
		
		if(this.simMobileNumber == reciever.simMobileNumber) {
			System.out.println("You can't call yourself ..");
			return;
		}
		
		if(!this.hasSimCard || !reciever.hasSimCard) {
			System.out.println("One of the GSMs doesn't have SIM Card..(or both)");
			return;
		}
		
		Call currentCall = new Call();
		currentCall.duration = duration;
		currentCall.reciever = reciever;
		currentCall.caller = this;
		
		this.lastOutGoingCall = currentCall;
		reciever.lastInComingCall = currentCall;
		this.outGoingCallsDuration += currentCall.duration;
	}
	
	 double getSumForCall() {
		return this.outGoingCallsDuration*0.5; // Не мога да достъпя статичнатa променлива priceForAMinute от друг клас
	}
	 
	 void printPhoneNumber () {
		 for(int i=0; i<12;i++) {
			 System.out.print(this.simMobileNumber[i]);
		 }
	 }
	 
	 void printInfoForTheLastOutGoingCall() {
		 if(this.lastOutGoingCall != null) {
		 System.out.print("Caller(" + this.lastOutGoingCall.caller.model + "): ");
		 this.lastOutGoingCall.caller.printPhoneNumber();
		 System.out.print("\nReciever(" + this.lastOutGoingCall.reciever.model + "): ");
		 this.lastOutGoingCall.reciever.printPhoneNumber();
		 System.out.println("\nDuration: " + this.lastOutGoingCall.duration);
		 }
		 else System.out.println("There is no outgoing call to be inspected");
	 }
	 
	 void printInfoForTheLastInComingCall () {
		 if(lastInComingCall != null) {
		 System.out.print("Caller(" + this.lastInComingCall.caller.model + "): ");
		 this.lastInComingCall.caller.printPhoneNumber();
		 System.out.print("\nReciever(" + this.lastInComingCall.reciever.model + "): ");
		 this.lastInComingCall.reciever.printPhoneNumber();
		 System.out.println("\nDuration: " + this.lastInComingCall.duration);
		 }
		 else System.out.println("There is no incoming call to be inspected");
	 }
	 
 }
