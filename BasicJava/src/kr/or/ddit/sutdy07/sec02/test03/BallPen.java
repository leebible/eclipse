package kr.or.ddit.sutdy07.sec02.test03;

public class BallPen extends Pen{
	String color;
	String ink;
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInk() {
		return ink;
	}

	public void setInk(String ink) {
		this.ink = ink;
	}

	public void color() {
		System.out.println("3. 색상");
	}

	public void ink() {
		System.out.println("4. 남은 양(잉크)");
	}

}
