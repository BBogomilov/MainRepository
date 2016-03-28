package homework_BankTask;


public abstract class Product {
	
	private String name;
	private double interest;
	private int period;
	private double money;

	public Product(double money, int months, double interest) {
		if(money > 0){
			this.money = money;
		}
		this.setPeriod(months);
		this.setInterest(interest);
	}
	

	public double getInterest() {
		return this.interest;
	}

	public double getMoney() {
		return this.money;
	}

	private void setPeriod(int months){
		if(months < 1 && months > 60){
			System.out.println("There isn't a deposit for such a period");
		} else {
			this.period = months;
		}
	}
	
	private void setInterest(double interest){
		if(interest < 0){
			System.out.println("It's imposible to have that interest");
		} else {
			this.interest = interest;
		}
	}
	
	public void addMoney(double money){
		this.money += money;
	}
	
	protected int getPeriod(){
		return this.period;
	}
	
	
}
