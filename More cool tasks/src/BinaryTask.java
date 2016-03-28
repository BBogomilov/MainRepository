
public class BinaryTask {

	public static void main(String[] args) {
		
		int a = 45734582;
		int b = 45572533;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		int counter =0;
		int bigger=0;
		if(a<b) {
			bigger=b;
		}
		else {
			bigger = a;
		}
		
		while(bigger>0) {
		if ((a&1) == (b&1)) {
			counter++;
		}
		bigger = bigger>>1;
		a = a>>1;
		b = b>>1;
		}
		System.out.println(counter);

	}

}
