//23-11-14

package kr.or.ddit.study06.sec03.test04;

public class Rectangle {
	/*
	 * 사각형의 1.높이, 2.너비, 3.중심점 x, 4.중심점 y -> 생성자로 만들것. 5.넓이
	 */
	int height;
	int width;
	int x;
	int y;
	int area;

	
	public Rectangle(int height, int width, Point p1) {
		this(height,width,p1.x,p1.y);
	}
	public Rectangle(int height, int width, int x, int y) {
		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;
		this.area = height*width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", x=" + x + ", y=" + y + ", area=" + area + "]";
	}

	
	
	
	
	
}
