//23.11.13

package kr.or.ddit.study06.sec02.test02;

public class FieldExample02 {
	public static void main(String[] args) {
		/*
		 * Computer 객체생성
		 * -> static 사용해 볼것 name = "컴퓨터";
		 * cpu, ram, hdd
		 */
		Computer c1 = new Computer();
		c1.cpu = "i7";
		Computer c2 = new Computer();
		System.out.println(c1);
		System.out.println(c2);
	}
}