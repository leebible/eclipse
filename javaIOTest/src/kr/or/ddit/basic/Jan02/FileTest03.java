package kr.or.ddit.basic.Jan02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest03 {
	public static void main(String[] args) {
		FileTest03 test = new FileTest03();
		test.dir(new File("d:/d_other"));
	}
	
	// 디렉토리 정보를 매개변수로 받아서 해당 디렉토리에 있는 
	// 모든 파일 및 디렉토리 목록을 출력하는 메서드
	public void dir(File d) {
		if(!d.isDirectory()) {
			System.out.println("디렉토리(폴더)만 가능합니다.");
			return;
		}
		
		System.out.println("[" +d.getAbsolutePath() + "] 디렉토리 내용");
		
		// 해당 디렉토리 안에 있는 모든 파일 및 디렉토리 목록을 구한다.
		File[] fileArr = d.listFiles();
		
		//'2023-10-27 오후 12:13'와 같은 형식 구성하기
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		//가져온 목록 개수만큼 반복
		for(File f : fileArr) {
			String fileName = f.getName();
			String attr = "";	//파일 속성
			String size = "";
			
			if(f.isDirectory()) {
				attr = "<DIR>";
			}else {
				size = String.valueOf(f.length());
				attr = f.canRead() ? "R" : "";
				attr += f.canWrite() ? "W" : "";
				attr += f.isHidden() ? "H" : "";
			}
			String strDate = df.format(new Date(f.lastModified()));
			
			System.out.printf("%s %5s %12s %s \n",
					strDate, attr, size, fileName); //날짜, 속성, 사이즈
		}
	}
}
