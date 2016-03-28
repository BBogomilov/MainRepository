
public class recurssionPow {

	public static void main(String[] args) {
		
		int num=3;
		int num1 =func(num, 3);
		System.out.println(num1);
	}
	
	static int func (int n, int pow) {
			if (pow == 0) {
				return 1;
			}
			if(pow == 1) {
				return n;
			}
			return n*func(n,--pow);
		
	}
	

}
