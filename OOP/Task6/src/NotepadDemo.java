package homework9_Polimorphysm;

import java.security.InvalidParameterException;

public class NotepadDemo {

	public static void main(String[] args) {
		
//		ISecuredNotepad diary = new SecuredNotepad("Дневник", 5, "0000");
//			diary.addText("Мило дневниче. днес ходих на курс.", 1);
//			diary.addText("Мило дневниче, днес се напих, защото имах имен ден. Не писах задачи", 2);
//			diary.setText("Мило дневниче. днес писах задачи цял ден, не съм празнувал... наистина.", 2);
//			diary.addText("Край", 5);
//			diary.showAllPages();
//		
//		SimpleNotepad notepad = new SimpleNotepad("Тетрадка някаква", 10) ;
//			notepad.addText("MATEMAТИКА:\n 5+5-9=14\n Теореми: №$%$№@€!№@$€$%§$\n §€%$*€%*(§€*)€§()§*", 1);
//			notepad.addText("Драсканици..", 2);
//			notepad.addText("Още драсканици..", 3);
//			notepad.addText("Още теореми ..%€$%№€€%*€%€§*%§3%€§%€§%$€\n Ф2№$%@№$%Е@№$%$%€€!@№$!@!@!@№)_)+)_", 3);
//			notepad.addText("To be continued..", 4);
//			notepad.showAllPages();
		
		try {
		ElectronicSecuredNotepad electronicNotepad = new ElectronicSecuredNotepad("Tablet", 3);
			electronicNotepad.start();
			electronicNotepad.addText("Apps: Fruit ninja 2; Aviary; Despicable Me 4", 1); 
			electronicNotepad.addText("Телефонен указател; Съобщения; Интернет", 2);
			electronicNotepad.addText("Галерия; Файлов Мениджър", 3);
			electronicNotepad.showAllPages();
			System.out.println(electronicNotepad.searchWord("Me"));
			electronicNotepad.printAllPagesWithDigits();
		}
		catch(InvalidParameterException n) {
			System.out.println("Password not strong enough");
		}
	}
}
