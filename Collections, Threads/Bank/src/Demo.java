package homework_BankTask;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Bank bank = new Bank("Banka DSK", "Sofia, Bulgaria");
		
		Client client1 = new Client("Client 1",20, 10, bank, "Gabrovo");
		Client client2 = new Client("Client 2", 11000, 500, bank, "Sofia");
		Client client3 = new Client("Client 3", 13500, 750, bank, "Qblanica");
		Client client4 = new Client("Client 4", 92000, 1800, bank, "Dupnica");
		Client client5 = new Client("Client 5", 202000, 900, bank, "Plovdiv");
		Client client6 = new Client("Client 6", 52000, 350, bank, "Vraca");

		
		ArrayList<Client> clients = new ArrayList<Client>();
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		clients.add(client4);
		clients.add(client5);
		clients.add(client6);
		
		
		for(Client c : clients){
			double percent = 80 + (Math.random() * ((90 - 80) + 1));
			int period = (int)(Math.random() * 59 + 1);
			double money = c.getMoney() * (percent /100);
			openDeposit(c, money, period);
		}
		
		bank.info();
		System.out.println();
		
		for(Client c : clients){
			int period = (int)(Math.random() * 59 + 1);
			int minSum = 200;
			int maxSum = 1000;
			double money = minSum + (Math.random() * ((maxSum - minSum) + 1));
			getCredit(c, money, period);
		}
		
		for(Client c : clients){
			c.info();
			System.out.println();
		}
		
		bank.info();
		
	}

	static void getCredit(Client c, double money, int period) {
			c.getCredit(money, period);
	}

	static void openDeposit(Client c, double money, int period) {
			c.openDeposit(money, period);
		
	}
	
}
