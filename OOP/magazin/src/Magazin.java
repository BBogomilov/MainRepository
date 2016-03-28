package magazin;

public class Magazin {

	private String name;
	private String address;
	private double moneyInCase;
	private Product[] products;
	

	Magazin(String name, String address, int numOfProducts) {
		this.name=name;
		this.address = address;
		this.products = new Product[numOfProducts];
		this.moneyInCase = 0;
	}
	
	protected Product[] getProducts() {
		return products;
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected void addProduct(Product product) {
		for(int i=0; i<this.products.length; i++) {
			if(this.products[i]==null) {
				this.products[i] = product;
				break;
			}
		}
	}
	
	protected void removeProduct(Product product) {
		
		for(int i=0; i<this.products.length; i++) {
			if(this.products[i].getType().equalsIgnoreCase(product.getType())) {
				this.products[i] = null;
			}
		}
	}

	protected double getMoneyInCase() {
		return moneyInCase;
	}

	protected void addMoneyInCase(double money) {
		this.moneyInCase += money;
	}
}
