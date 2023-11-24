package kr.or.ddit.sutdy07.sec02.test02;

import sun.misc.FpUtils;

public class Main {
	public static void main(String[] args) {

		FolderPhone fp = new FolderPhone();
		System.out.println("폴더폰-------------");
		fp.camera();
		fp.tell();
		fp.fold();
		fp.internet();
		System.out.println("스마트폰-------------");
		SmartPhone sp = new SmartPhone();
		sp.camera();
		sp.touch();
		sp.tell(); 
		sp.internet();

	}
}
