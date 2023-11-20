//23-11-15

package kr.or.ddit.study06.sec04.test04;

public class MethodReturnExample02 {
	public static void main(String[] args) {
		MethodReturnExample02 m = new MethodReturnExample02();
		int[] score = { 70, 65, 47 };
		m.test01(score);
	}

	public double[] test01(int[] score) {
		// 한메소드에 한 기능을 설계하는게 원칙
		/*
		 * 총점, 평균 구하nnnnnn고 리턴해보기.
		 *
		 */
		int sum=0;
		double avg=0;
		for(int i : score) {
			sum += i;
		}
		avg = (double) sum/score.length;
		
		double[] arr = {sum, avg};
		System.out.println(sum);
		System.out.println(avg);
		return arr;
	}
}
