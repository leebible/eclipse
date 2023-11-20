//23.11.13

package kr.or.ddit.study06.sec02.test02;

public class Computer {
	static String name = "컴퓨터";
	String cpu = "i5";
	String ram = "16G";
	String hdd = "1TB";
	@Override
	public String toString() {
		return name+" - [cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + "]";
	}
	
}
