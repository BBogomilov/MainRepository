import java.util.Date;

public class Book extends Reading implements Comparable<Book>{

	private String genre;
	private String author;
	private Date dateOfPublishing;
	
	public Book(String name, String genre, String publishingHouse, String author, Date date) {
		super(name, publishingHouse);
		this.author = author;
		this.dateOfPublishing = date;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nAuthor: " + this.getAuthor() + "\nPublishing house: " +
		this.getPublishingHouse(); 
	}
	
	protected String getAuthor() {
		return author;
	}
	
	protected Date getDateOfPublishing() {
		return dateOfPublishing;
	}

	@Override
	public int compareTo(Book o) {
		if(this.getGenre().compareTo(o.getGenre())== 0)
		return this.getDateOfPublishing().compareTo(o.getDateOfPublishing())*(-1);
		
		return this.getGenre().compareTo(o.getGenre());
		
	}

	public String getGenre() {
		return genre;
	}
	
	
}
