package homework9_Polimorphysm;

public class Page {

	protected String heading;
	protected String text;
	
	Page(String heading, String text) {
		this.heading = heading;
		this.text = text;
	}
	
	protected void appendText(String newText) {
		StringBuilder builder = new StringBuilder();
		builder.append(this.text);
		builder.append(newText);
		this.text = builder.toString();
	}
	
	protected void removeText() {
		this.text = "";
		}
	
	public String readPage() {
		return this.heading + "\n\n" + this.text + "\n";
	}
	
	protected boolean searchWord(String word) {
		return this.text.contains(word);
	}
	
	protected boolean containsDigits() {
		for(int i=0; i< this.text.length(); i++) {
			if (this.text.charAt(i) >= '0' && this.text.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}
}
