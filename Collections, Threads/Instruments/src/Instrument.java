package homework_InstrumentsTask;

public class Instrument implements Comparable<Instrument>{

	public enum Type {STRING, PERCUSSION, WIND, KEYBOARD, ELECTRICAL};
	public enum Kind {CIGULKA, VIOLA, ARFA, KITARA, GADULKA, BARABANI, TUPAN, TARAMBUKA, DEIRE, 
		TROMPET, TROMBON, TUBA, KLARINET, FLEITA, PIANO, ORGAN, AKORDEON, SINTEZATOR, BAS_KITARA,
		ELEKTRICHESKA_KITARA, ELEKTRICHESKA_CIGULKA};
	
	private String name;
	private Double price;
	private Type type;
	private Kind kind;
	
	Instrument (Type type, Kind kind, String name, Double price){
		this.type = type;
			if(type == Type.STRING) {
				if((kind != Kind.CIGULKA) && (kind != Kind.VIOLA) && (kind !=Kind.ARFA) && (kind !=Kind.KITARA) && (kind !=Kind.GADULKA)) {
					 throw new IllegalArgumentException("There is no such instrument");				
				}
			}
			if(type == Type.PERCUSSION) {
				if((kind != Kind.BARABANI) && (kind != Kind.TUPAN) && (kind !=Kind.TARAMBUKA) && (kind !=Kind.DEIRE)) {
					 throw new IllegalArgumentException("There is no such instrument");
				}
			}
			if(type == Type.WIND) {
				if((kind != Kind.TROMPET) && (kind != Kind.TROMBON) && (kind !=Kind.TUBA) && (kind !=Kind.KLARINET) && (kind != Kind.FLEITA)) {
					 throw new IllegalArgumentException("There is not such instrument");
				}
			}
			if(type == Type.KEYBOARD) {
				if((kind != Kind.PIANO) && (kind != Kind.ORGAN) && (kind != Kind.AKORDEON)) {
					 throw new IllegalArgumentException("There is no such instrument");
				}
			}
			if(type == Type.ELECTRICAL) {
				if ((kind != Kind.SINTEZATOR) && (kind != Kind.BAS_KITARA) && (kind !=Kind.ELEKTRICHESKA_KITARA) && (kind != Kind.ELEKTRICHESKA_CIGULKA)) {
					throw new IllegalArgumentException("There is no such instrument");
				}
			}
			
		this.kind = kind;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nName: " + this.getName() + "\nType: " + this.getType() +"\nKind: " + this.getKind() + 
		" ; Price: " + this.getPrice() + "\n";
	}
	
	protected String getName() {
		return name;
	}

	protected Double getPrice() {
		return price;
	}

	protected Type getType() {
		return type;
	}

	protected Kind getKind() {
		return kind;
	}
	@Override
	public int compareTo(Instrument o) {
		return this.getName().compareTo(o.getName());
	}
}
