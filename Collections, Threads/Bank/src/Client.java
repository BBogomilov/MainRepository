package homework_BankTask;

import java.util.ArrayList;

public class Client {

	Bank bank;
	private String name;
	private String address;
	private double money;
	private double salary;
	private ArrayList<Deposit> deposits;
	private ArrayList<Credit> credits;

	public Client(String name, double money, double salary, Bank bank, String address) {
			this.name = name;
	
		if (money >= 0)
			this.money = money;
		if (salary >= 0)
			this.salary = salary;
		
		this.address = address;
		deposits = new ArrayList<Deposit>();
		credits = new ArrayList<Credit>();
		this.bank = bank;
	}

	public void openDeposit(double money, int period){ // (money, period)
		if (money > this.money) {
			System.out.println("You don't have enough money to open a deposit.");
			return;
		} else {
			Deposit deposit = null;
			int r = (int) (Math.random() * 2 + 1);
			switch (r) {
			case 1:
				deposit = new Deposit(money, Deposit.shortDepositPeriod, Deposit.shortDepositPeriod);
				break;
			case 2:
				deposit = new Deposit(money, Deposit.longDepositPeriod, Deposit.longDepositInterest);
				break;
			}
			this.deposits.add(deposit);
			this.money -= money;
			this.bank.takeDeposit(money, deposit);
		}
	}

	public void getCredit(double money, int period){
		double monthlyPayments = 0;
		for (Credit c : this.credits) {
			monthlyPayments += c.getMonthlyPayment();
		}
		if (monthlyPayments > (this.salary / 2)) {
			System.out.println("You can't afford a credit.");
		} else {
			Credit credit = bank.giveCredit(money, period, this.salary);
			this.credits.add(credit);
			this.money += money;
		}
	}

	public void importMoneyOnCredit() {
		double moneyToTransfer = 0;
		for(Credit c : credits){
			moneyToTransfer += c.getMonthlyPayment();
		}
		this.money -= moneyToTransfer;
		bank.payCredit(moneyToTransfer);
	}

	public double getMoney() {
		return this.money;
	}
	
	public String getName() {
		return this.name;
	}

	public void info() {
		System.out.println("name: " + this.name);
		System.out.println("address: " + this.address);
		System.out.println("money: " + this.money);
		System.out.println("salary: " + this.salary);
		System.out.println("deposits: " + this.deposits.size());
		System.out.println("credits: " + this.credits.size());
		System.out.println("-----------------------");
	}


}
