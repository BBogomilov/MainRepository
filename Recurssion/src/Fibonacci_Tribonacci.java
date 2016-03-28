import java.util.Scanner;

public class Fibonacci_Tribonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter a number > 0: ");
		int num = sc.nextInt();
		
		int res = fib(num);
		System.out.println(res);
		
		int res2 = trib(num);
		System.out.println(res2);
	}
	
	static int fib(int n) {
		if(n==1) {
			return 1;
		}
		if (n==2) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	
	static int trib(int n) {
		if (n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
		}
		if(n==3) {
			return 2;
		}
		return trib(n-1) + trib(n-2) + trib(n-3);
	}

}
