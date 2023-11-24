package kr.or.ddit.sutdy07.sec02.test03;

public class Main {
public static void main(String[] args) {
	//클래스가 3개
	//Pen, FountainPen, BallPen
	/*
	 * pen
	 * 
	 * 1. 펜길이
	 * 2. 펜 굵기
	 */
	
	/*
	 * BallPen
	 * 1.펜길이
	 * 2.펜 굵기
	 * 3. 색상
	 * 4. 남은 양(잉크)
	 */
	/*
	 * FountainPen
	 * 1.펜길이
	 * 2.펜굵기
	 * 3. 색상
	 * 4.남은양
	 */
	Pen p = new Pen();
	BallPen bp = new BallPen();
	FountainPen fp = new FountainPen();
	
	p.length();
	p.thick();
	bp.length();
	bp.thick();
	bp.color();
	
}
}
