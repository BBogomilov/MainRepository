package homework_InstrumentsTask;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import homework_InstrumentsTask.Instrument.Type;

public class MusicalShop {

	private Double moneyInCase;
	private TreeMap<Instrument, Integer> instrumentsInShop;
	private TreeMap<Instrument, Integer> soldInstruments;

	MusicalShop() {
		instrumentsInShop = new TreeMap<Instrument, Integer>();
		soldInstruments = new TreeMap<Instrument, Integer>();
		this.moneyInCase = 0.0;
		}
	
	protected void sellInstrument(String name, Integer quantity) {
		if(quantity <= 0) {
			System.out.println("Invalid quantity value");
			return;
		}
		for(Entry<Instrument, Integer> e : instrumentsInShop.entrySet()) {
			if(e.getKey().getName().equalsIgnoreCase(name)) {
				if(e.getValue() >= quantity) {
					e.setValue(e.getValue() - quantity);
					setMoneyInCase(getMoneyInCase() + quantity*e.getKey().getPrice());
					System.out.println(quantity + " " + name + "s Sold out");
					for(Entry<Instrument, Integer> e2 : soldInstruments.entrySet()) {
						if(e2.getKey().getName().equalsIgnoreCase(name)) {
							e2.setValue(e2.getValue() + quantity);
							break;
						}
					}
					soldInstruments.put(e.getKey(), quantity);
					break;
					}
				else System.out.println("There are not that many products of that type in the store");
			}
		}
	}
	
	protected void addInstrument(Instrument instrument, Integer quantity) {
		this.instrumentsInShop.put(instrument, quantity);
	}
	
	protected void getSoldInstrumentsByQuantity() {
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			System.out.println(e.getKey() + "Numbers sold out: " + e.getValue());
		}
	}
	
	protected void getSumOfAllSoldInstruments() {
		Double sum = 0.0;
		for (Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			sum += e.getKey().getPrice()*e.getValue();
		}
		System.out.println("Whole sum of all sold instruments: " + sum);
	}
	
	protected void getMostSellableInstrument() {
		int temp = 0;
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getValue() > temp)
				temp = e.getValue();
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getValue() == temp)
				System.out.println("Best selling Instrument: " + e.getKey() + "With " + temp + " sells");
		}
	}
	
	protected void getLeastSellableInstrument() {
		boolean flag = true;
		Integer temp = null;
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(flag) {
				temp = e.getValue();
				flag = false;
			}
			if(e.getValue() < temp)
				temp = e.getValue();
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getValue() == temp)
				System.out.println("Least selling Instrument: " + e.getKey() + "With " + temp + " sells");
		}
	}
	
	protected void getMostSellableInstrumentType() {
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
		int temp5 = 0;
		
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.STRING){
				temp1 += e.getValue();
			}
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.ELECTRICAL){
				temp2 += e.getValue();
			}
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.WIND){
				temp3 += e.getValue();
			}
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.PERCUSSION){
				temp4 += e.getValue();
			}	
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.KEYBOARD){
				temp5 += e.getValue();
			}
		}
		int[] arr = {temp1, temp2, temp3, temp4, temp5};
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		String type = "";
		if(max == temp1) type = "STRING";
		if(max == temp2) type = "ELECTRICAL";
		if(max == temp3) type = "WIND";
		if(max == temp4) type = "PERCUSSION";
		if(max == temp5) type = "KEYBOARD";
		System.out.println("Most sellable type of instrument is " + type + " with total number of " + max + " sells.");
	}
	protected void getInstrumentTypeWithLargestProfit() {
		double temp1 = 0.0;
		double temp2 = 0.0;
		double temp3 = 0.0;
		double temp4 = 0.0;
		double temp5 = 0.0;
		
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.STRING){
				temp1 += e.getValue()*e.getKey().getPrice();
			}
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.ELECTRICAL){
				temp2 += e.getValue()*e.getKey().getPrice();
			}
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.WIND){
				temp3 += e.getValue()*e.getKey().getPrice();
			}
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.PERCUSSION){
				temp4 += e.getValue()*e.getKey().getPrice();
			}	
		}
		for(Entry<Instrument, Integer> e : soldInstruments.entrySet()) {
			if(e.getKey().getType() == Type.KEYBOARD){
				temp5 += e.getValue()*e.getKey().getPrice();
			}
		}
		double[] arr = {temp1, temp2, temp3, temp4, temp5};
		double max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		String type = "";
		if(max == temp1) type = "STRING";
		if(max == temp2) type = "ELECTRICAL";
		if(max == temp3) type = "WIND";
		if(max == temp4) type = "PERCUSSION";
		if(max == temp5) type = "KEYBOARD";
		System.out.println("The instrument type with the largest profit from its sells is " + type + " with total profit of " + max + " dollars.");
	}
	
	protected void instrumentsByType(){
		TreeMap<Instrument, Integer> instrumentsByType = new TreeMap<Instrument, Integer>(new Comparator<Instrument>() {

			
			@Override
			public int compare(Instrument o1, Instrument o2) {
				if(o1.getType().toString().compareTo(o2.getType().toString()) != 0)
				return o1.getType().toString().compareTo(o2.getType().toString());
				
				return o1.compareTo(o2);
			}
		});
		instrumentsByType.putAll(instrumentsInShop);
		
		for(Entry<Instrument, Integer> e : instrumentsByType.entrySet()) {
			System.out.println(e.getKey() + "Available in stock: " + e.getValue());
		}
	}
	
	protected void InstrumentsByName() {
		for(Entry<Instrument, Integer> e : instrumentsInShop.entrySet()) {
			System.out.println(e.getKey() + "Available in stock: " + e.getValue());
		}
	}

	protected void InstrumentsByDescPrice() {
		TreeMap<Instrument, Integer> map = new TreeMap<Instrument, Integer>(new Comparator<Instrument>() {
			@Override
			public int compare(Instrument o1, Instrument o2) {
				if(o1.getPrice().compareTo(o2.getPrice()) != 0)
					return o2.getPrice().compareTo(o1.getPrice());
					
				return o1.compareTo(o2);
			}
		});
		
		map.putAll(instrumentsInShop);
		for(Entry<Instrument, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "Available in stock: " + e.getValue());
		}
	}
	
	protected void InstrumentsByAscPrice() {
		TreeMap<Instrument, Integer> map = new TreeMap<Instrument, Integer>(new Comparator<Instrument>() {
			@Override
			public int compare(Instrument o1, Instrument o2) {
				if(o1.getPrice().compareTo(o2.getPrice()) != 0)
					return o1.getPrice().compareTo(o2.getPrice());
					
				return o1.compareTo(o2);
			}
		});
		
		map.putAll(instrumentsInShop);
		for(Entry<Instrument, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "Available in stock: " + e.getValue());
		}
	}
	
	protected void availableInstruments() {
		for(Entry<Instrument, Integer> e : instrumentsInShop.entrySet()) {
			if(e.getValue() != 0)
			System.out.println(e.getKey() + "Available in stock: " + e.getValue());
		}
	}

	public Double getMoneyInCase() {
		return moneyInCase;
	}

	public void setMoneyInCase(Double moneyInCase) {
		this.moneyInCase = moneyInCase;
	}
}
