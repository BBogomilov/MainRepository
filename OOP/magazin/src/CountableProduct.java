package magazin;

public class CountableProduct extends Product {

	private int quantity;
	private boolean isOutOfStock;

	CountableProduct(String type, double price) {
		super(type, price);
	}

	protected int getQuantity() {
		return quantity;
	}
	
	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	protected void addQuantity(int quantity) {
		if (quantity > 0)
			this.quantity += quantity;

		else
			System.out.println("Invalid quantity value");
	}

	protected void removeQuantity(int quantity) {
		if (quantity <= 0) {
			System.out.println("Invalid quantity value");
		} else {
			if (quantity > this.quantity) {
				System.out.println(this.getType() + " finished");
				this.quantity = 0;
				this.isOutOfStock = true;
			} else
				this.quantity -= quantity;
		}

	}

	public boolean isOutOfStock() {
		return isOutOfStock;
	}

}
