package homework_WarehouseFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Shop{
	private String name;
	private static final int MIN_QUANTITY = 3;
	private static final int QUANTITY_ADDED = 5;
	protected TreeMap<String, TreeMap<String, Integer>> shopProducts;
	
	Shop(String name) {
		this.name = name;
		shopProducts = new TreeMap<>();
		shopProducts.put("VEGETABLES", new TreeMap<String, Integer>());
		shopProducts.get("VEGETABLES").put("Potato", 15);
		shopProducts.get("VEGETABLES").put("Eggplant", 15);
		shopProducts.get("VEGETABLES").put("Cucumber", 15);
		shopProducts.put("MEATS", new TreeMap<String, Integer>());
		shopProducts.get("MEATS").put("Pork", 15);
		shopProducts.get("MEATS").put("Beef", 15);
		shopProducts.get("MEATS").put("Chicken", 15);
		shopProducts.put("FRUITS", new TreeMap<String, Integer>());
		shopProducts.get("FRUITS").put("Banana", 15);
		shopProducts.get("FRUITS").put("Orange", 15);
		shopProducts.get("FRUITS").put("Apple", 15);
	}
	
	
	public synchronized void takeFromShop() {
		Random r = new Random();
		int quantity = r.nextInt(4) + 1;
		ArrayList<String> keyList = new ArrayList<String>();
		for(Entry<String, TreeMap<String, Integer>> e : shopProducts.entrySet()) {
			for(Entry<String, Integer> entry : e.getValue().entrySet()) {
				keyList.add(entry.getKey());
			}
		}
		Collections.shuffle(keyList);
		String product = keyList.get(0);
		
		if(isDepleted(product, quantity)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			take(product, quantity);
			notifyAll();
		}
	}
	
	
	private void take(String product, int quantity) {
		
		for(Entry<String, TreeMap<String, Integer>> e : shopProducts.entrySet()) {
			for(Entry<String, Integer> entry : e.getValue().entrySet()) {
				if(entry.getKey().equalsIgnoreCase(product)) {
					entry.setValue(entry.getValue() - quantity);
					System.out.println(quantity + " " + product + "s taken from " + name);
					break;
				}
			}
		}
	}
	
	public synchronized void addToShop(Warehouse warehouse) {
		ArrayList<String> depleted = this.getDepletedProducts();
		if (depleted.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			for (String product : depleted) {
				warehouse.takeFromWarehouse(product);
				fillQuantity(product);
			}
			notifyAll();
		}
	}

	private boolean isDepleted(String product, int quantity) {
		
		for(Entry<String, TreeMap<String, Integer>> e : shopProducts.entrySet()) {
			for(Entry<String, Integer> entry : e.getValue().entrySet()) {
				if(entry.getKey().equalsIgnoreCase(product) && entry.getValue() >= quantity)
					return false;
			}
		}
		return true;
	}

	private ArrayList<String> getDepletedProducts() {
		ArrayList<String> depleted = new ArrayList<>();
		for(Entry<String, TreeMap<String, Integer>> e : shopProducts.entrySet()) {
			for(Entry<String, Integer> entry : e.getValue().entrySet()) {
				if(entry.getValue() <= MIN_QUANTITY)
					depleted.add(entry.getKey());
			}
		}
		return depleted;
	}


	private void fillQuantity(String product) {
		
		for (Entry<String, TreeMap<String, Integer>> e : this.shopProducts.entrySet()) {
			for (Entry<String, Integer> entry : e.getValue().entrySet()) {
				if (entry.getKey().equals(product)) {
					entry.setValue(entry.getValue() + QUANTITY_ADDED);
					System.out.println("Warehouse added " + QUANTITY_ADDED + " " + product + "s to " + this.getName() + ". Quantity of product now: " + entry.getValue());
					break;
				}
			}
		}
	}


	public String getName() {
		return this.name;
	}
}
