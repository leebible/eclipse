package kr.or.ddit.study06.homework;
//23-11-14 숙제 ㅜㅜ

/*문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.
*String형의 학과와 정수형의 학번을 필드로 선언
* Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 
 적당한 값을 입력 후 출력*/

class Student {
	String depart;
	int number;

		@Override
	public String toString() {
		return "Student [학과=" + depart + ", 학번=" + number + "]";
	}

		public static void main(String[] args) {
			Student stu1 = new Student();
			stu1.depart = "경영학과";
			stu1.number = 20231114;
			
			System.out.println(stu1);
		}

	}
