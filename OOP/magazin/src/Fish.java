package magazin;

public class Fish  extends WeightProduct{

	private String name;
	private final boolean ISSTINKY = true;
	
	Fish(String name, String type, double price) {
		super(type, price);
		this.name = name;
	}

}
