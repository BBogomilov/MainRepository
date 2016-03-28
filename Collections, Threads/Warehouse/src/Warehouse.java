package homework_WarehouseFinal;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;


public class Warehouse {

	private static final int QUANTITY_TAKEN = 5;
	private static final int QUANTITY_ADDED = 25;
	private static final int MIN_QUANTITY = 3;
	private TreeMap<String, TreeMap<String, Integer>> whProducts;

	Warehouse() {

		whProducts = new TreeMap<>();
		whProducts.put("VEGETABLES", new TreeMap<String, Integer>());
		whProducts.get("VEGETABLES").put("Potato", 15);
		whProducts.get("VEGETABLES").put("Eggplant", 15);
		whProducts.get("VEGETABLES").put("Cucumber", 15);
		whProducts.put("MEATS", new TreeMap<String, Integer>());
		whProducts.get("MEATS").put("Pork", 15);
		whProducts.get("MEATS").put("Beef", 15);
		whProducts.get("MEATS").put("Chicken", 15);
		whProducts.put("FRUITS", new TreeMap<String, Integer>());
		whProducts.get("FRUITS").put("Banana", 15);
		whProducts.get("FRUITS").put("Orange", 15);
		whProducts.get("FRUITS").put("Apple", 15);

	}

	public synchronized void takeFromWarehouse(String product) {
		if (isDepleted(product)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			take(product);
			notifyAll();
		}
	}

	public synchronized void addtoWarehouse() {
		ArrayList<String> depleted = getDepletedProducts();
		if (depleted.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			for (String product : depleted) {
				fillQuanity(product);
			}
			notifyAll();
		}
	}

	private void take(String product) {

		for (Entry<String, TreeMap<String, Integer>> e : whProducts.entrySet()) {
			for (Entry<String, Integer> entry : e.getValue().entrySet()) {
				if (entry.getKey().equals(product)) {
					entry.setValue(entry.getValue() - QUANTITY_TAKEN);
					break;
				}
			}
		}
	}

	private boolean isDepleted(String product) {

		for (Entry<String, TreeMap<String, Integer>> e : whProducts.entrySet()) {
			for (Entry<String, Integer> entry : e.getValue().entrySet()) {
				if (entry.getKey().equalsIgnoreCase(product) && entry.getValue() >= MIN_QUANTITY)
					return false;
			}
		}
		System.out.println("product ran out of stock in warehouse");
		return true;
	}

	private void fillQuanity(String product) {

		for (Entry<String, TreeMap<String, Integer>> e : whProducts.entrySet()) {
			for (Entry<String, Integer> entry : e.getValue().entrySet()) {
				if (entry.getKey().equals(product)) {
					entry.setValue(entry.getValue() + QUANTITY_ADDED);
					System.out.println("Supplier added " + QUANTITY_ADDED + " " + product + "s to the Warehouse. Quantity of product now: " + entry.getValue());
					break;
				}
			}
		}

	}

	private ArrayList<String> getDepletedProducts() {
		ArrayList<String> depleted = new ArrayList<>();
		for (Entry<String, TreeMap<String, Integer>> e : whProducts.entrySet()) {
			for (Entry<String, Integer> entry : e.getValue().entrySet()) {
				if (entry.getValue() <= MIN_QUANTITY)
					depleted.add(entry.getKey());
			}
		}
		return depleted;
	}
}
