package homework9_Polimorphysm;

import java.security.InvalidParameterException;

public class NotepadDemo {

	public static void main(String[] args) {
		
//		ISecuredNotepad diary = new SecuredNotepad("�������", 5, "0000");
//			diary.addText("���� ��������. ���� ����� �� ����.", 1);
//			diary.addText("���� ��������, ���� �� �����, ������ ���� ���� ���. �� ����� ������", 2);
//			diary.setText("���� ��������. ���� ����� ������ ��� ���, �� ��� ���������... ��������.", 2);
//			diary.addText("����", 5);
//			diary.showAllPages();
//		
//		SimpleNotepad notepad = new SimpleNotepad("�������� �������", 10) ;
//			notepad.addText("MATEMA����:\n 5+5-9=14\n �������: �$%$�@�!�@$�$%�$\n ��%$*�%*(��*)��()�*", 1);
//			notepad.addText("����������..", 2);
//			notepad.addText("��� ����������..", 3);
//			notepad.addText("��� ������� ..%�$%���%*�%��*%�3%��%��%$�\n �2�$%@�$%�@�$%$%��!@�$!@!@!@�)_)+)_", 3);
//			notepad.addText("To be continued..", 4);
//			notepad.showAllPages();
		
		try {
		ElectronicSecuredNotepad electronicNotepad = new ElectronicSecuredNotepad("Tablet", 3);
			electronicNotepad.start();
			electronicNotepad.addText("Apps: Fruit ninja 2; Aviary; Despicable Me 4", 1); 
			electronicNotepad.addText("��������� ��������; ���������; ��������", 2);
			electronicNotepad.addText("�������; ������ ��������", 3);
			electronicNotepad.showAllPages();
			System.out.println(electronicNotepad.searchWord("Me"));
			electronicNotepad.printAllPagesWithDigits();
		}
		catch(InvalidParameterException n) {
			System.out.println("Password not strong enough");
		}
	}
}
