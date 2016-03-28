package homework_InstrumentsTask;


import homework_InstrumentsTask.Instrument.Kind;
import homework_InstrumentsTask.Instrument.Type;

public class Demo {
	
	public static void main(String[] args) {
		
		MusicalShop shop = new MusicalShop();
		try {
		shop.addInstrument(new Instrument(Type.KEYBOARD, Kind.AKORDEON, "nqkuv_Akordeon", 55.99), 5);
		shop.addInstrument(new Instrument(Type.KEYBOARD, Kind.PIANO, "Yamaha", 730.00), 4);
		shop.addInstrument(new Instrument(Type.KEYBOARD, Kind.PIANO, "Boston", 860.00), 2);
		shop.addInstrument(new Instrument(Type.KEYBOARD, Kind.PIANO, "Schimmel_pianos", 1200.00), 1);
		shop.addInstrument(new Instrument(Type.ELECTRICAL, Kind.ELEKTRICHESKA_CIGULKA, "qka_El_cigulka", 220.00), 2);
		shop.addInstrument(new Instrument(Type.ELECTRICAL, Kind.ELEKTRICHESKA_KITARA, "Fender", 180.00), 4);
		shop.addInstrument(new Instrument(Type.ELECTRICAL, Kind.ELEKTRICHESKA_KITARA, "Weston", 260.00), 6);
		shop.addInstrument(new Instrument(Type.PERCUSSION, Kind.BARABANI, "Barabanii", 520.78), 3);
		shop.addInstrument(new Instrument(Type.PERCUSSION, Kind.DEIRE, "Deirence", 35.00), 15);
		shop.addInstrument(new Instrument(Type.PERCUSSION, Kind.TUPAN, "nqkuv_Tupan", 105.00), 2);
		shop.addInstrument(new Instrument(Type.STRING, Kind.GADULKA, "Gadulkaa", 80.00), 1);
		shop.addInstrument(new Instrument(Type.STRING, Kind.KITARA, "Stagg", 180.00), 8);
		shop.addInstrument(new Instrument(Type.WIND, Kind.TROMPET, "Gumzata", 150.00), 1);
		shop.addInstrument(new Instrument(Type.WIND, Kind.FLEITA, "Fleitichka", 20.00), 10);
		shop.addInstrument(new Instrument(Type.STRING, Kind.KITARA, "Yamaha", 220.00), 3);
		shop.addInstrument(new Instrument(Type.WIND, Kind.TUBA, "basi_Tubata", 345.00), 4);
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		shop.sellInstrument("Stagg", 3);
		shop.sellInstrument("Barabanii", 2);
		shop.sellInstrument("Yamaha", 1);
		shop.sellInstrument("Fleitichka", 5);
		shop.sellInstrument("Deirence", 7);
		
		shop.availableInstruments();
		System.out.println();
		shop.InstrumentsByAscPrice();
		System.out.println();
		shop.InstrumentsByDescPrice();
		System.out.println();
		shop.instrumentsByType();
		System.out.println();
		shop.getSoldInstrumentsByQuantity();
		System.out.println();
		shop.getSumOfAllSoldInstruments();
		System.out.println();
		shop.getMostSellableInstrument();
		System.out.println();
		shop.getLeastSellableInstrument();
		System.out.println();
		shop.getMostSellableInstrumentType();
		System.out.println();
		shop.getInstrumentTypeWithLargestProfit();
	}

	
}
