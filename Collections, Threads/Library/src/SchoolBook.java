
public class SchoolBook extends Reading implements Comparable<SchoolBook>{

	private String theme;
	private String author;
	
	public SchoolBook(String name, String theme, String publishingHouse, String author) {
		super(name, publishingHouse);
		this.author = author;
		this.theme = theme;
	}


	protected String getAuthor() {
		return author;
	}

	public String getTheme() {
		return theme;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nAuthor: " + this.getAuthor()
		+ "\nPublishing house: " + this.getPublishingHouse();
	}

	@Override
	public int compareTo(SchoolBook o) {
		if(this.getTheme().compareTo(o.getTheme()) == 0)
			return this.getName().compareTo(o.getName());
		
		return this.getTheme().compareTo(o.getTheme());
	}
	
}
