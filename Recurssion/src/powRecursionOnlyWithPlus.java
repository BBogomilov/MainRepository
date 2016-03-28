
public class powRecursionOnlyWithPlus {

	public static void main(String[] args) {
		
		int number = 9;
		int result = func(number, 3);
		System.out.println(result);

	}
	
	static int temp (int n, int times) {
		if(times ==1) {
			return n;
		}
		return n + temp(n, times-1);
	}
	
	
	static int func(int num, int x) {
		if (x==1) {
			return num;
		}
		if (x ==0) {
			return 1;
		}
		return temp(func(num, x-1), num);
	}

}
