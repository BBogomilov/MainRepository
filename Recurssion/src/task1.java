/*
 �� �� ������� ��������, ����� ��������� N-���� ����� �� ��������.
������� � ������� ����� �� �������� �� 1-��, ����� �������� � �����
�� ����� �� ����������� 2.

 */

public class task1 {

	public static void main(String[] args) {
		
		int n = 7;
		int res = fib(n);
		System.out.println(res);

	}
	
	static int fib (int N) {
		if (N==1) {
			return 0;
		}
		if (N==2) {
			return 1;
		}
		return fib(0+1)+fib(2);
	}
	
	

}
