package kr.or.ddit.sutdy07.sec02.test04;

public class Prod {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Prod [이름" + getName() + ", 가격=" + getPrice() + "]";
	}
}
