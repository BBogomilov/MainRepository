import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		int reverseNum = palyndrom(num);
		boolean flag = flag(num, reverseNum);
		System.out.println(reverseNum);
		
		 System.out.println(flag ?"number is palyndrom":"number is not palyndrom");

	}
	
	static int palyndrom (int n) {
	int newN =0;
	while(n>0) {
		newN =newN + (n%10);
		if(n/10!=0) {
		newN *=10;
		}
		n/=10;
	}
	return newN;
	
	}
		static boolean flag(int a, int b) {
		if(a==b)
			return true;
		else return false;
	}
}
