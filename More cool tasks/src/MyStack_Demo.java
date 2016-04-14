
public class Demo {

	public static void main(String[] args) {
		
		MyStack st = new MyStack();
		st.push(0);
		st.push(4);
		st.push(-1);
		st.pop();
		st.push(2);
		st.push(-8);
		st.pop();
		System.out.println(st.minElement());
	}
}
