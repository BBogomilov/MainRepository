package magazin;

public class WeightProduct extends Product {

	private double weight;
	private boolean isOutOfStock;

	WeightProduct(String type, double price) {
		super(type, price);
	}

	protected double getWeight() {
		return weight;
	}

	protected void addWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		} else
			System.out.println("Invalid weight value of product");
	}
	
	protected void setWeight(double weight) {
		if (weight <= 0) {
			System.out.println("Invalid weight value ");
		} else
		this.weight = weight;
	}

	protected void removeWeight(double weight) {
		if (weight <= 0) {
				System.out.println("Invalid weight value ");
		} else {
			if(weight > this.weight) {
			System.out.println(this.getType() + " finished in the store");
			this.weight = 0;
			this.isOutOfStock = true;
			}
			else
				this.weight -= weight;
		}
	}

	protected boolean isOutOfStock() {
		return isOutOfStock;
	}

	protected double getPriceForCurrentProduct() {
		return this.getPrice()*this.weight;
	}
}
