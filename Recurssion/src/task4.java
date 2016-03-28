import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter positive number: ");
		int x = sc.nextInt();
		System.out.println("enter pow: ");
		int y = sc.nextInt();
		int pow = pow(x, y);
		System.out.println(pow);

	}
	
	static int pow(int x, int y) {
		
		if(x==0)
			return 0;
		if(x==1 || y==0)
			return 1;
		if(y==1)
			return x;
		if(y==2) {
			int result=0;
			for(int i=1; i<=x; i++) {
				result += x;
			}
			return result;
		}
		else {
			int result =0;
			for(int i=1; i<=x; i++) {
				result += pow(x, y-1);
			}
			return result;
		}
		
	}

}
