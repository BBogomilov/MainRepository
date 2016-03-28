package homework_BankTask;

public class Deposit extends Product {
	
	static int shortDepositPeriod = 3;
	static double shortDepositInterest = 3;
	
	static int longDepositPeriod = 12;
	static double longDepositInterest = 5;

	private double monthSum;
	
	public Deposit(double money, int months, double interest) {
		super(money, months, interest);
		this.monthSum = this.countInterest();
	}

	private double countInterest(){
		double monthlySumFromInterest = super.getInterest() * super.getMoney();
		return monthlySumFromInterest;
	}
	
	public double getMonthlySum(){
		return this.monthSum;
	}

}

