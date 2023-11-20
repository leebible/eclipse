//23-11-14

package kr.or.ddit.study06.sec04.test01;

public class MethodExample01 {
	public static void main(String[] args) {
		MethodExample01 obj = new MethodExample01();
		obj.method1("테스트1");
		obj.method1("테스트");
		obj.method1("test");
	}

	public void method1(String param) {
		System.out.println("외부에서 준 파라미터 값 : "+param);
	}
}
