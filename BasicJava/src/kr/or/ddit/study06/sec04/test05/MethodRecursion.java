package kr.or.ddit.study06.sec04.test05;
//재귀함수
public class MethodRecursion {
	public static void main(String[] args) {
		MethodRecursion mr = new MethodRecursion();
		int result1 = mr.pow(3);
		System.out.println(result1);
		//1~10까지의 합.
		int result2 = mr.sum(10);
		System.out.println(result2);
		
		int result3 = mr.pebonachi(4); //큰수를 했을때 스택오버플로우를 만날수있음. 간단한것에만 쓰기!
		System.out.println(result3);
	}
	
	public int pow(int t) {
		//1번째 종료조건.
		if(t==0) return 1;
		//2번째 반복조건
		return 2*pow(t-1);
	}
	
	public int sum(int t) {
		if(t==1) return 1 ;
		return t + sum(t-1);
	}
	
	public int pebonachi(int n) {
		if(n==1 || n==2) return 1;
		return pebonachi(n-2) + pebonachi(n-1);
	}
}
