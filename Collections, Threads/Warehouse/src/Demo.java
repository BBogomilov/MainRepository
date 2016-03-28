package homework_WarehouseFinal;

public class Demo {
	public static void main(String[] args) {

		Warehouse warehouse = new Warehouse();
		Shop shop1 = new Shop("Pikadili");
		Shop shop2 = new Shop("Billa");
		Shop shop3 = new Shop("Metro");

		Supplier supplier = new Supplier(warehouse);
		ShopSupplier shopSupp1 = new ShopSupplier(warehouse, shop1);
		ShopSupplier shopSupp2 = new ShopSupplier(warehouse, shop2);
		ShopSupplier shopSupp3 = new ShopSupplier(warehouse, shop3);
		Client client1 = new Client(shop1);
		Client client2 = new Client(shop1);
		Client client3 = new Client(shop1);
		Client client4 = new Client(shop2);
		Client client5 = new Client(shop2);
		Client client6 = new Client(shop2);
		Client client7 = new Client(shop3);
		Client client8 = new Client(shop3);
		Client client9 = new Client(shop3);

		client1.start();
		client2.start();
		client3.start();
		client4.start();
		client5.start();
		client6.start();
		client7.start();
		client8.start();
		client9.start();
		shopSupp1.start();
		shopSupp2.start();
		shopSupp3.start();
		supplier.start();
	}

	private static class Supplier extends Thread {

		private Warehouse warehouse;

		public Supplier(Warehouse warehouse) {
			this.warehouse = warehouse;
		}

		@Override
		public void run() {

			while (true) {
				warehouse.addtoWarehouse();

			}
		}
	}

	private static class ShopSupplier extends Thread {

		private Warehouse warehouse;
		private Shop shop;

		ShopSupplier(Warehouse warehouse, Shop shop) {
			super();
			this.warehouse = warehouse;
			this.shop = shop;
		}

		@Override
		public void run() {
			while (true) {
				shop.addToShop(warehouse);

			}
		}
	}

}
