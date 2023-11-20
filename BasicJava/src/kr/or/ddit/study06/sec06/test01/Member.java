//23-11-16-6(2)

package kr.or.ddit.study06.sec06.test01;

import java.util.Scanner;
//클래스에있는 모든 데이터들은 getter, setter로 묶는게 규칙            
//if구문~필드에 하지않고 ,, 이롷게ㅜㅜ
//alt+shift+s :  generate Getter~
public class Member {
	String name;
	int age;
	String nation;
	String mail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { 
		if(age<0) {
			System.out.println("0보다 작은수는 입력할 수 없습니다.");
			Scanner sc = new Scanner(System.in);
			age = sc.nextInt();
		}else if(age>100) {
			System.out.println("100보다 큰 수는 입력할 수 없습니다.");
			Scanner sc = new Scanner(System.in);
			age = sc.nextInt();
		}
		this.age = age;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", nation=" + nation + ", mail=" + mail + "]";
	}
}