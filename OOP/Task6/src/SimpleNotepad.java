package homework9_Polimorphysm;


public class SimpleNotepad implements INotepad{

	private Page[] pages;
	private String name;
	
	SimpleNotepad(String name, int pagesNumber) {
		if(pagesNumber>0) {
			this.name = name;
			this.pages = new Page[pagesNumber];
			for(int i=0; i<this.pages.length; i++) {
				this.pages[i] = new Page(("Page " + (i+1)), "");
			}
		}
	}
	
	@Override
	public void addText(String newText, int pageNumber) {
		if(validatePage(pageNumber)) {
		this.pages[pageNumber-1].appendText(newText);
		}
		else System.out.println("Invalid page number value");
	}

	@Override
	public void setText(String newText, int pageNumber) {
		if(validatePage(pageNumber)) {
			this.pages[pageNumber-1].removeText();
			this.pages[pageNumber-1].text = newText;
		}
	}

	@Override
	public void removeText(int pageNumber) {
		if(validatePage(pageNumber)) {
			this.pages[pageNumber-1].removeText();
		}
	}

	@Override
	public void showAllPages() {
		for(int i=0; i<this.pages.length; i++) {
			System.out.println(this.pages[i].readPage());
		}
	}
	
	protected boolean validatePage(int page) {
		if(page>0 && page <= this.pages.length) {
			return true;
		}
		else return false;
	}

	@Override
	public boolean searchWord(String word) {
		for(int i=0; i<this.pages.length; i++) {
			if(this.pages[i].searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for(int i=0; i<this.pages.length; i++) {
			if(this.pages[i].containsDigits()) {
				System.out.println(this.pages[i].readPage());
			}
		}
		
	}


}
