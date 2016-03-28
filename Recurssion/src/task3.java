import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter num: ");
		int num = sc.nextInt();
		System.out.println(isPrime(num,2));

	}
	
	static boolean isPrime(int n, int x) {
		if (n==1) {
			return true;
		}
		if(x==n) {
			return true;
		}
			return help(n,x++) && isPrime(n,x);
	}
	
	static boolean help(int n, int x) {
		int res = n%x;
		if(res != 0) {
			return true;
		}
		else return false;
	}
	
}
