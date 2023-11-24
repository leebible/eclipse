package kr.or.ddit.sutdy07.sec02.test03;

public class Pen {
	int length;
	int thick;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getThick() {
		return thick;
	}
	public void setThick(int thick) {
		this.thick = thick;
	}
	public void length() {
		System.out.println("1. 펜길이");
	}
	public void thick() {
		System.out.println("2. 펜굵기");
	}
}
