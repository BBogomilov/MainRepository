package homework9_Polimorphysm;

public interface INotepad {
	
	void addText(String newText, int pageNumber);
	void setText(String newText, int pageNumber);
	void removeText(int pageNumber);
	void showAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits ();
}
