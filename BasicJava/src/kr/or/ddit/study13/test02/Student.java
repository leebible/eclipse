package kr.or.ddit.study13.test02;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank =1;
	 
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor+eng+math;
		this.avg = sum/3.0;

		
}

	@Override
	public String toString() { //실제로 toString 사용하진 않음
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", rank="
				+ rank + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}
}
