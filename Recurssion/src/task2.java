import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		System.out.println("enter second number: ");
		int b=sc.nextInt();
		int res = product(a,b);
		System.out.println(res);

	}
	
	static int product(int a, int b) {
	
		if(b==1) {
			return a;
		}
		return a + product(a, --b);
	}

}
