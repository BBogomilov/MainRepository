package magazin;

public class Beer extends CountableProduct{
	
	private String name;				// za da e klas, trqbva da ima pone 2 poleta
	private final boolean ISITCOOL = true;

	Beer(String name, String type, double price) {
		super(type, price);
		this.name = name;
	}

}
