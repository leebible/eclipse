package kr.or.ddit.study03;

public class BinaryOperator2 {
	public static void main(String[] args) {
		BinaryOperator2 obj = new BinaryOperator2();
//		obj.bitOperator();
		obj.bitOperator2();
	}

	private void bitOperator2()

	{
		int a = 8;
		System.out.println(a >> 2);
		System.out.println(a << 2);
	}

	public void bitOperator() {
		int a = 45;
		int b = 25;
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " | " + b + " = " + (a | b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));
	}
}
