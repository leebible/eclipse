//23-11-14
package kr.or.ddit.study06.sec04.test01;

public class MethodExample02 {
	public static void main(String[] args) {
		MethodExample02 obj = new MethodExample02();
		String result = obj.method1();
		System.out.println("method1 에서 리턴 받은 값 :  "+ result);
		int result2 = obj.method2();
		System.out.println("method2 에서 리턴 받은 값 :  "+ result2);
	}

	public String method1() {
		return "test";
	}
	
	public int method2() {
		return 10;
	}
	
	public void method3() {
		
	}
}
