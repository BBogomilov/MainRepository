import java.util.Date;
import java.util.TreeMap;

public abstract class Reading {

	protected String name;
	protected String publishingHouse;
	protected TreeMap<Date, Date> archive;
	
	Reading(String name, String publishingHouse) {
		this.name = name;
		this.publishingHouse = publishingHouse;
	}
	
	protected String getName() {
		return this.name;
	}
	protected String getPublishingHouse() {
		return this.publishingHouse;
	}
	protected TreeMap<Date, Date> getArchive() {
		return this.archive;
	}
}
