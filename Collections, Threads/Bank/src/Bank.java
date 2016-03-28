package homework_BankTask;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

	private static String deposit = "Deposit";
	private static String credit = "Credit";
	private static double percent = 100;
	
	private String name;
	private String address;
	HashMap<String, ArrayList>  products;
	private double money;
	private double bankReserv;
	
	public Bank(String name, String address){
		this.name = name;
		this.address = address;
		this.products = new HashMap<String, ArrayList>();
		this.products.put(deposit, new ArrayList<Deposit>());
		this.products.put(credit, new ArrayList<Credit>());
		this.money = 0;
		this.bankReserv = 0;
		
	}
	
	public void takeDeposit(double money, Deposit deposit){
		this.money += money;
		this.products.get(Bank.deposit).add(deposit);
		this.bankReserv += (90/percent) * money;
	} 
	
	public Credit giveCredit(double money, int period, double salary) { 
		if(money > this.bankReserv || (this.money - money) < (10/percent) * this.bankReserv){
			System.out.println("The bank cannot afford to give you a credit");
			return null;
		} else {
			Credit credit = null;
			int r = (int) (Math.random() * 2 + 1);
			switch (r) {
			case 1:
				credit = new Credit(money, period, Credit.ConsumerCreditInterest);
				break;
			case 2:
				credit = new Credit(money, period, Credit.HomeCreditInterest);
				break;
			}
			if(credit.getMonthlyPayment() > salary){
				System.out.println("You cannot afford a credit.");
				return null;
			} else {
				this.money -= money;
				return credit;
			}
		}
	}
	
	
	public void payDepositsInterest(){
		ArrayList<Deposit> deposits = this.products.get(deposit);
		for(Deposit d : deposits){
			double money = d.getMonthlySum();
			d.addMoney(money);
		}
	}
	
	public void info(){
		System.out.println(this.name);
		System.out.println("Money: " + this.money);
		System.out.println("Bank Reserv: " + this.bankReserv);
	}

	public void payCredit(double moneyToTransfer) {
		this.money += moneyToTransfer;
		this.bankReserv += (90/percent) * moneyToTransfer;
	}
	
}
