package magazin;

public class Meat extends WeightProduct{

	private String name;
	private final boolean ISVEGETARIAN = false;
	
	Meat(String name, String type, double price) {
		super(type, price);
		this.name = name;
	}

}
