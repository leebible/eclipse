//23-11-15 얕은복사? 깊은 복사?

package kr.or.ddit.study06.sec04.test04;

import java.util.Arrays;

public class MethodCopy {
	public static void main(String[] args) {
		MethodCopy mc = new MethodCopy();
		int arr[] = { 1, 2, 3 };
//		배열 원본 2배로 증가 시킨후 총합*2; <-라는 주석을 달고 카피하면 괜찮
//		int sum = mc.copy(arr);
//		System.out.println(sum);
//		System.out.println(Arrays.toString(arr));
		arr = mc.copy2(arr);
	}

	public int[] copy2(int[] arr) { // 얕은 복사, 추천하진 않음. 최대한 return으로
		/*
		 * 2 배로 증가 하기.
		 */
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		return arr;
	}
	
	public int copy(int[] arr) { // 얕은 복사, 추천하진 않음. 최대한 return으로
		/*
		 * 2 배로 증가 하기.
		 */
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
			sum += arr[i];
		}
		return sum;
	}
}
