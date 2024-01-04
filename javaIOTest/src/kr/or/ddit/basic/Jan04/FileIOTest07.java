package kr.or.ddit.basic.Jan04;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOTest07 {
	public static void main(String[] args) {
		// 사용자로부터 출력할 단을 입력 받아 구구단을 파일로 출력하는 프로그램 작성하기
		// (출력할 파일명 : 'd:/d_other/gugudan2.txt')
		// 문자 기반 스트림을 이용해서 작성하시오.
		FileWriter fin = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요.");
		int dan=sc.nextInt();
		try {
			fin = new FileWriter("d:/d_other/gugudan2.txt");
		
		for(int i=1; i<10; i++) {
			fin.write(dan+" * "+i+"="+(dan*i)+"\n");
		}
		System.out.println("작업완료!");
		fin.close();
		
		}catch (IOException e) {
		}
	}
}

