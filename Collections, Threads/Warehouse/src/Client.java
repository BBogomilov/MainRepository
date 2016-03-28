package homework_WarehouseFinal;

public class Client extends Thread{

	private Shop shop;
	
	Client(Shop shop){
		this.shop = shop;
	}
	
	@Override
	public void run() {
		while(true) {
			shop.takeFromShop();
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}
