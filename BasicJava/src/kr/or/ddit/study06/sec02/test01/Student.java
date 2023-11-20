//23.11.13

package kr.or.ddit.study06.sec02.test01;

public class Student {
	static String rm = "402호"; //static : 모든 클래스는 이 값을 공유!
	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

}
