import java.util.Scanner;

public class hangMan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Hello, this is my first game and it's called The Hangman. Enjoy :)");
		System.out.println();
		
		String word = "absolutely";
	
		
		StringBuilder text = new StringBuilder();
		
		for(int i=0; i<word.length(); i++) {
			
			if(i==0) {
				text.append(word.charAt(0));
			}
			else if (i==word.length()-1) {
				text.append(word.charAt(word.length()-1));
				break;
			}
			else
				text.append('_');
			
			text.append(' ');
		}

		
		int triesLeft = 5;
		char letter;
		boolean correctLetter;
		boolean winner;
		
		while(true) {
			
			System.out.println(text);
			
			winner = true;
			correctLetter = false;
			System.out.print("въведи буква: ");
			
			letter = sc.next().charAt(0);
			for(int i=1; i<word.length()-1; i++) {
				if(word.charAt(i) == letter) {
					text.setCharAt(i+i,letter);
					correctLetter = true;
				}
				else continue;
			}
			if(!correctLetter) {
				if(triesLeft - 1 ==0) {
					System.out.println("Абе важното е да сме живи и здрави..");
					break;
				} else
				System.out.println("Съжалявам, няма такава буква.. oстават ти " + --triesLeft + " опита");
			}
			else {
				for(int i=0; i<text.length(); i++) {
					if(text.charAt(i) == '_') {
						winner = false;
					}
					else continue;
				}
				if(winner) {
					System.out.println(text);
					System.out.println("Евала!");
					break;
				}
				else continue;
			}
			
		}
		
	}

}
