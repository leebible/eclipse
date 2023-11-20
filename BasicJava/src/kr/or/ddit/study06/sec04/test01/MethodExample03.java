//23-11-14
package kr.or.ddit.study06.sec04.test01;

public class MethodExample03 {
	public static void main(String[] args) {
		MethodExample03 obj = new MethodExample03();
		int add = obj.add(10, 3);
		System.out.println("add 받은 리턴 값 : " + add);
		int minus = obj.minus(10, 3);
		System.out.println("add 받은 리턴 값 : " + minus);
		double add3 = obj.devide(10, 3);
		System.out.println("add 받은 리턴 값 : " + add3);
		int multiple = obj.multiple(10, 3);
		System.out.println("add 받은 리턴 값 : " + multiple);
		// 빼기, 나누기, 곱하기 해보기
	}

	public int add(int a, int b) {
		return a + b;

	}

	public int minus(int a, int b) {
		return a - b;
	}

	public double devide(int a, int b) {
		return (double)a / b;
	}

	public int multiple(int a, int b) {
		return a * b;
	}

}
