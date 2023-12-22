package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
문제) 학번, 이름, 국어점수, 영어점수, 수학점수, 총점, 등수를 멤버로 갖는 Student클래스를 만든다.
        이 Student클래스의 생성자에서는 학번, 이름, 국어점수, 영어점수, 수학점수만 매개변수로 받아서
        초기화 처리를 한다. (총점은 3과목 점수의 합계로 초기화 한다.)

        이 Student객체는 List에 저장하여 관리한다.

    List에 저장된 데이터들을 학번의 오름차순으로 정렬할 수 있는 내부 정렬 기준을 구현하고,
        총점의 내림차순으로 정렬하는데 총점이 같으면 이름의 오름차순으로 정렬되는 외부 정렬 기준 클래스를
        작성하여 정렬된 결과를 출력하시오.

    (단, 등수는 List에 전체 데이터가 추가된 후에 저장되도록 한다.)
    
       다 하면 이름 폴더 만들어서 공유폴더에 넣기
 */


public class StudentTest {
	
	// 등수를 구하는 메서드
	public void createRanking(ArrayList<Student> sList) { //static이 안붙은 메소드를 instance메소드라 한다.
		 for(Student std1 : sList) { //기준 데이터를 구하기 위한 반복문
			 int rank = 1; //처음에는 1등으로 초기화 해놓고 시작한다.
			 
			 for(Student std2 : sList) { // 비교대상을 나타내는 반복문
				 // 기준보다 비교 대상이 크면 등수를 증가시킨다.
				 if(std1.getSum() < std2.getSum()) {
					 rank ++;
				 }
			 }
			 //구해진 등수를 Student객체의 rank변수에 저장한다.
			 std1.setRank(rank);
		 }
	}
	
	
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		StudentTest test = new StudentTest();
		
		sList.add( new Student(1, "홍길동", 95,80,30));
		sList.add( new Student(5, "이순신", 30,50,60));
		sList.add( new Student(9, "성춘향", 85,75,60));
		sList.add( new Student(3, "강감찬", 90,90,90));
		sList.add( new Student(6, "일지매", 95,80,35));
		sList.add( new Student(2, "변학도", 90,90,90));
		
		//List에 데이터가 모두 추가된 후에 등수 구하는 메서드를 호출한다.
		
		
		System.out.println("정렬 전");
		for(Student stud : sList) {
			System.out.println(stud);
		}
		System.out.println("--------------------------------");
		
		Collections.sort(sList);
		
		System.out.println("학번의 오름차순 정렬 후 " );
		for(Student stud : sList) {
			System.out.println(stud);
		}
		System.out.println();
		
	
		
		System.out.println("정렬 전");
		for(Student stud : sList) {
			System.out.println(stud);
		}
		System.out.println("--------------------------------");
		
		Collections.sort(sList, new SortSumDesc());
		
		System.out.println("정렬 후 " );
		for(Student stud : sList) {
			System.out.println(stud);
		}
		System.out.println();
		
		//등수는 외부의 도움을 받았습니다..
//		int rank = 1; // 등수(rank) 초기값 설정
//        int ssc = 1; // 동일한 합계를 가진 학생 수 초기값 설정
//        
//        for (int i = 0; i < sList.size(); i++) {
//            Student cs = sList.get(i);
//            if (i > 0) {
//                Student ps = sList.get(i - 1);
//                if (cs.getSum() != ps.getSum()) {
//                    rank += ssc; // 동일한 합계를 가진 학생 수만큼 등수 증가
//                    ssc = 1; // 같은 합계를 가진 학생 수 초기화
//                } else {
//                    ssc++; // 동일한 합계를 가진 학생 수 증가
//                }
//            }
//            cs.setRank(rank); // 등수(rank) 할당
//        }
        
//		for(int i=0;i<sList.size();i++) {
//				sList.get(i).setRank(i+1);
//			}
		
		test.createRanking(sList); //static 메소드에서 호출하려면 호출당하는 메소드도 static이여야 에러가 안남
		System.out.println("등수+정렬 후 " );
		for(Student stud : sList) { //stud : Student클래스의 참조변수가 들어가는 객체
			System.out.println(stud);
		}
		System.out.println();
	}
}

//총점의 내림차순으로 정렬하는데 총점이 같으면 이름의 오름차순으로 정렬되는 외부 정렬 기준 클래스
	class SortSumDesc implements Comparator<Student> {

		int ret = 0;
		@Override
		public int compare(Student s1, Student s2) {
		if(s1.getSum() < s2.getSum()) {
			ret = 1; 
		}
		if(s1.getSum() == s2.getSum()) {
			if(s1.getName().compareTo(s2.getName()) < 0 ) {
				ret = -1;
			} else if(s1.getName().compareTo(s2.getName()) == 0 ) {
			ret = 0;
			} else if(s1.getName().compareTo(s2.getName()) > 0 )
			ret = 1;
			}
		if(s1.getSum() > s2.getSum()) {
			ret = -1;
		}
		return ret;
		}
		
	}
	
	class Student implements Comparable<Student> {
		private int num; //인스턴스 객체
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int sum;
		private int rank;
		
		//생성자
		public Student(int num, String name, int kor, int eng, int math) {
			super();
			this.num = num; //인스턴스 메소드
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.sum = kor+eng+math;
		}

		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}

		@Override
		public String toString() {
			return "Student [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
					+ ", sum=" + sum + ", rank=" + rank + "]";
		}
		
		// 학번의 오름차순으로 정렬할 수 있는 내부 정렬 기준을 구현
		@Override
		public int compareTo(Student stu) {
			return Integer.compare(this.getNum(), stu.getNum());
	/*		이성경이 푼 답
			if(this.num > stu.getNum()) {
				return 1;
			}
			else if(this.num == stu.num) {
				return 0;
			}
			else { return -1; 
			} */
		}
	}
	
	
