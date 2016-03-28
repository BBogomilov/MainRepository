package magazin;

public abstract class Product {

	private String type; //of product
	private double price;
	
	Product(String type, double price) {
		this.type = type;
		this.price=price;
	}
	
	protected String getType() {
		return type;
	}

	protected double getPrice() {
		return price;
	}

}
