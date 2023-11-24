package kr.or.ddit.sutdy07.sec02.test02;

public class FolderPhone extends Phone {

	public void fold() {
		System.out.println("접힌다.");
	}

	@Override
	public String toString() {
		return super.toString(); // 이부분 졸았음
	}
}
