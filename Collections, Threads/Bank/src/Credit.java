package homework_BankTask;


public class Credit extends Product {
	
	static double HomeCreditInterest = 6;
	static double ConsumerCreditInterest = 10;

	private double monthPayment;

	public Credit(double money, int months, double interest) {
		super(money, months, interest);
		this.monthPayment = this.countMonthPayment();
	}
	
	public double getMonthlyPayment(){
		return this.monthPayment;
	}
	
	private double countMonthPayment(){
		double money = super.getMoney();
		double interest = (super.getInterest() / 100) * money;
		return (money + interest) / super.getPeriod();
	}
	
}
