//23-11-16-7(2)

package kr.or.ddit.study06.sec06.test02;

public class Phone {
	/*
	 * Phone 클래스에
	 * 
	 * 핸드폰번호
	 * 이름
	 * 그룹
	 * 단축키
	 * 
	 */
	String number;
	String name;
	String group;
	String shortk;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getShortk() {
		return shortk;
	}
	public void setShortk(String shortk) {
		this.shortk = shortk;
	}
	@Override
	public String toString() {
		return  number +",   "+ name+",   "+  group +",   "+shortk ;
	}
	
}
