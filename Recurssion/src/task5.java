
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int first = sc.nextInt();
		System.out.println("Enter another number:");
		int second = sc.nextInt();
		
		if(first > second){
			first = first^second;
			second = first^second;
			first = first^second;
		}
		
		print(first, second);

	}
	
	static String print(int start, int end) {
		if (end == start - 1){
			return "";
		}
		String p = print(start, end - 1);
		p = p + end + " ";
		System.out.print(p);
		System.out.print("\n");

		return p;
	}

}
