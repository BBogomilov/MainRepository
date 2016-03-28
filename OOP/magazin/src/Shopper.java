package magazin;

public class Shopper {

	private String name;
	private Magazin magazin;
	private double money;
	private int maxNumOfProducts;
	private Product[] kolichka;

	Shopper(String name, Magazin magazin, double money, int maxNumOfProducts) {
		this.name = name;
		this.magazin = magazin;
		this.money = money;
		this.maxNumOfProducts = maxNumOfProducts;
		this.kolichka = new Product[maxNumOfProducts];
	}

	protected void addWeightMeasurableProduct(WeightProduct product, double weight) {
		boolean flag = false;
		for (int i = 0; i < this.kolichka.length; i++) {
			if (this.kolichka[i] == null) {
				this.kolichka[i] = product;
				product.setWeight(weight);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("There is no more space in the kolichka");
			return;
		}
		for (int j = 0; j < this.magazin.getProducts().length; j++) {
			if (this.magazin.getProducts()[j].getType().equalsIgnoreCase(product.getType())) {
				((WeightProduct) this.magazin.getProducts()[j]).removeWeight(weight);
				if (((WeightProduct) this.magazin.getProducts()[j]).isOutOfStock()) {
					this.magazin.getProducts()[j] = null;
				}
				break;
			}
		}
		System.out.println(product.getType() + " added - " + weight + " Kg");

	}

	protected void removeWeightMeasurableProduct(WeightProduct product) {
		boolean flag = false;
		boolean flag2 = false;
		for (int i = 0; i < this.kolichka.length; i++) {
			if (this.kolichka[i].getType().equalsIgnoreCase(product.getType())) {
				this.kolichka[i] = null;
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("There is no such product in the kolichka to be removed");
			return;
		}
		for (int j = 0; j < this.magazin.getProducts().length; j++) {
			if (this.magazin.getProducts()[j] != null && this.magazin.getProducts()[j].getType().equals(product.getType())) {
				((WeightProduct) this.magazin.getProducts()[j]).addWeight(product.getWeight());
				flag2 = true;
			}
		}
		if (!flag2) {
			this.magazin.addProduct(product);
		}
		System.out.println(product.getType() + " removed - " + product.getWeight() + " Kg");
	}

	protected void addCountableProduct(CountableProduct product, int quantity) {
		if (quantity < 0) {
			System.out.println("Invalid quantity value");
			return;
		}
		boolean flag = false;
		int counter = 0;
		for (int i = 0; i < this.kolichka.length; i++) {
			if (this.kolichka[i] == null) {
				this.kolichka[i] = product;
				counter++;
				flag = true;
				if (counter == quantity)
					break;
			}
		}
		if (!flag) {
			System.out.println("There aren't any free spaces in the kolichka");
			return;
		}
		for (int j = 0; j < this.magazin.getProducts().length; j++) {
			if (this.magazin.getProducts()[j].getType().equalsIgnoreCase(product.getType())) {
				((CountableProduct) this.magazin.getProducts()[j]).removeQuantity(quantity);
				if (((CountableProduct) this.magazin.getProducts()[j]).isOutOfStock()) {
					System.out.println(this.magazin.getProducts()[j].getType() + " is out of stock");
					this.magazin.getProducts()[j] = null;
				}
				break;
			}
		}
		if (counter < quantity)
			System.out.println("There is not enough space in the kolichka for so many " + product.getType() + "s");

		System.out.println(counter + " " + product.getType() + "s added ");
	}

	protected void removeCountableProduct(CountableProduct product, int quantity) {
		int counter = 0;
		boolean flag = false;
		boolean flag2 = false;
		for (int i = 0; i < this.kolichka.length; i++) {
			if (this.kolichka[i] != null && this.kolichka[i].getType().equalsIgnoreCase(product.getType())) {
				this.kolichka[i] = null;
				flag = true;
				counter++;
			}
		}
		if (!flag) {
			System.out.println("There is no such product to be removed from the koshnica");
			return;
		}
		for (int j = 0; j < this.magazin.getProducts().length; j++) {
			if (this.magazin.getProducts()[j].getType().equals(product.getType())) {
				((CountableProduct) this.magazin.getProducts()[j]).addQuantity(quantity);
				flag2 = true;
				break;
			}
		}
		if (!flag2) {
			this.magazin.addProduct(product);
			product.setQuantity(quantity);
		}

		if (counter < quantity) {
			System.out.println("There are not so many " + product.getType() + "s in the koshnica");
		}
		System.out.println(counter + " " + product.getType() + "s removed");
	}

	protected void pay() {
		double bill = 0;
		for (int i = 0; i < this.kolichka.length; i++) {
			System.out.println("====================");
			if (this.kolichka[i] instanceof WeightProduct) {
				this.money -= ((WeightProduct) this.kolichka[i]).getPriceForCurrentProduct();
				if (this.money <= 0) {
					System.out.println("\n" + this.name
							+ " has ran out of money :( .. let's leave him alone to deal with the shop assistants now ..");
					break;
				}
				this.magazin.addMoneyInCase(((WeightProduct) this.kolichka[i]).getPriceForCurrentProduct());
				bill += ((WeightProduct) this.kolichka[i]).getPriceForCurrentProduct();
				System.out.println("Product: " + this.kolichka[i].getType() + "\n Price for Kg: "
						+ this.kolichka[i].getPrice() + " ; weight: " + ((WeightProduct) this.kolichka[i]).getWeight()
						+ "\n Payed: " + ((WeightProduct) this.kolichka[i]).getPriceForCurrentProduct());
			} else {
				this.money -= this.kolichka[i].getPrice();
				if (this.money <= 0) {
					System.out.println("\n" + this.name
							+ " has ran out of money :( .. let's leave him alone to deal with the shop assistants now ..");
					break;
				}
				this.magazin.addMoneyInCase(this.kolichka[i].getPrice());
				bill += this.kolichka[i].getPrice();
				System.out.println(
						"Product: " + this.kolichka[i].getType() + "\n" + "Price: " + this.kolichka[i].getPrice());
			}
			System.out.println("====================");
		}
		System.out.println("\n Bill: " + bill + "\nCustomer money: " + this.money + "\nMoney in case of "
				+ this.magazin.getName() + ": " + this.magazin.getMoneyInCase());
	}
}
