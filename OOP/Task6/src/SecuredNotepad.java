package homework9_Polimorphysm;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {

	private String passWord;

	SecuredNotepad(String name, int pagesNumber) {
		super(name, pagesNumber);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strong password");
		String passWord = sc.nextLine();
		if(isSecured(passWord)) {
		this.passWord = passWord;
		}
		else {
			throw new InvalidParameterException();
		}
	}

	private boolean isSecured(String passWord) {
		boolean isRightLength = passWord.length() >= 5;
		boolean isThereDigit = false;
		
		for(int i=0; i<passWord.length(); i++) {
		if(passWord.charAt(i) >= '0' && passWord.charAt(i) <= '9') {
			isThereDigit = true;
			break;
			}
		}	
		boolean isThereLittleLetter = false;
		
		for(int i=0; i<passWord.length(); i++) {
		if(passWord.charAt(i) >= 'a' && passWord.charAt(i) <= 'z') {
			isThereLittleLetter = true;
			break;
			}
		}	
		boolean isThereBigLetter = false;
		
		for(int i=0; i<passWord.length(); i++) {
		if(passWord.charAt(i) >= 'A' && passWord.charAt(i) <= 'Z') {
			isThereBigLetter = true;
			break;
			}
		}	
		
		if(isRightLength && isThereDigit && isThereLittleLetter && isThereBigLetter) {
			return true;
		}
		else return false;
	}

	@Override
	public void addText(String newText, int pageNumber) {
		if (passRequierement()) {
			super.addText(newText, pageNumber);
		}
	}

	@Override
	public void setText(String newText, int pageNumber) {
		if (passRequierement()) {
			super.setText(newText, pageNumber);
		}
	}

	@Override
	public void removeText(int pageNumber) {
		if (passRequierement()) {
			super.removeText(pageNumber);
		}
	}

	@Override
	public void showAllPages() {
		if (passRequierement()) {
			super.showAllPages();
		}
	}
	
	@Override
	public boolean searchWord(String word) {
		return passRequierement() ? super.searchWord(word) : false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if (passRequierement())
		super.printAllPagesWithDigits();
	}

	protected boolean passRequierement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String passWord = sc.nextLine();
		if (passWord.equals(this.passWord)) {
			System.out.println("Acces permited");
			return true;
		} else {
			System.out.println("Wrong password, acces denied");
			return false;
		}
	}

}
