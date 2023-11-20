//23-11-14

package kr.or.ddit.study06.sec04.test01;

public class MethodExample04 {
	public static void main(String[] args) {

		MethodExample04 obj = new MethodExample04();
		obj.method2();
		obj.method1();

	}

	public void method1() {
		System.out.println("method1");
		method2();
	}

	public void method2() {
		System.out.println("method2");
	}
}