package kr.or.ddit.study06.sec06.test03;
/*
 * Prod 클래스에
 * 상품이름
 * 상품종류
 * 판매가격
 * 재고수량
 * 
 */
public class Prod {
	static int prodno=1;
	int no;
	
	
	

	String name;
	String sort;
	int price;
	int qty;

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	Prod(){
		no = prodno++;
	}
	@Override
	public String toString() {
		return no + "\t|" +name + "\t|" + sort+ "\t|" + price + "\t|" + qty ;
	}

}

