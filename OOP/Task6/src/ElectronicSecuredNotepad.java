package homework9_Polimorphysm;


public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	
	private boolean isStarted;

	ElectronicSecuredNotepad(String name, int pagesNumber) {
		super(name, pagesNumber);
		this.isStarted = false;
		
	}

	@Override
	public void start() {
		System.out.println("Device started");
		isStarted = true;
	}

	@Override
	public void stop() {
		System.out.println("Device stopped");
		isStarted = false;
	}


	@Override
	public void addText(String newText, int pageNumber) {
		if(isStarted)
		super.addText(newText, pageNumber);
	}

	@Override
	public void setText(String newText, int pageNumber) {
		if(isStarted)
		super.setText(newText, pageNumber);
	}

	@Override
	public void removeText(int pageNumber) {
		if(isStarted)
		super.removeText(pageNumber);
	}

	@Override
	public void showAllPages() {
		if(isStarted)
		super.showAllPages();
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if(isStarted)
		super.printAllPagesWithDigits();
	}
	
	@Override
	public boolean searchWord(String word) {
		if(isStarted)
		return super.searchWord(word) ;
		
		else {
		System.out.println("Device not started");
		return false;
		}
	}
}
