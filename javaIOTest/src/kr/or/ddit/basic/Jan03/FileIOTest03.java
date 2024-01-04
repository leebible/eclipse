package kr.or.ddit.basic.Jan03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOTest03 {
	public static void main(String[] args) {
		// 사용자로부터 출력할 단을 입력 받아 구구단을 파일로 출력하는 프로그램 작성하기
		// (출력할 파일명 : 'd:/d_other/gugudan.txt)
		FileOutputStream fout = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력해주세요.");
		int dan = sc.nextInt();
		try {
			fout= new FileOutputStream("d:/d_other/gugudan.txt");
			
			//파일 출력용 스트림 객체 생성
			for(int i=1; i<10; i++) {
				int gop = dan*i;
				String result = dan + " * " + i + " = " + gop + "\n";
				fout.write(result.getBytes("UTF-8"));
			}
			System.out.println("작업이 완료되었습니다.");
			
		}catch (IOException e) {

		}finally {
			if(fout!=null) try { fout.close(); } catch(IOException e) {}
		}
	}
}

