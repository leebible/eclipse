//23-11-24

package kr.or.ddit.study11;

public class MathExample {
//자바는 속도가 느리기에 대량연산에는 적합하진 않음
	public static void main(String[] args) {
		double ran = Math.random();
		//random은 시간과 관련
		System.out.println(ran);
		
		// 절대값
		int abs = Math.abs(-100);
		System.out.println(abs);
		
		int a =30;
		int b = 10;
		
		int max = Math.max(a,b);
//		Math.max //오버로딩,,?
		System.out.println("최대값 : " + max);
		int min = Math.min(a,b);
		System.out.println("최소값 : " + min);
		
		// 2^4
		double pow = Math.pow(2.3, 5);
		System.out.println(pow);
		
		double log10 = Math.log10(100); //로그
		System.out.println(log10); 
		
		double sqrt = Math.sqrt(2); //제곱근
		System.out.println(sqrt); 
		
		double data = 12.5154654;
		//반올림
		double round = Math.round(data);
		MathExample me = new MathExample();
		double result = me.round(data, 2);
		System.out.println(result);
		
		//자연 상수
		double E = Math.E;
		//3.14~~
		double PI = Math.PI;
	}
	
	public double round(double data, int num) {
		int temp =1;
		for(int i=0; i<num; i++) {
			temp*=10;
		}
		System.out.println( Math.round(data*temp));
		return (double) Math.round(data*temp)/temp;
		
	}
}
