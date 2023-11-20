package kr.or.ddit.study06.sec06.test04;

public class Book {
	static int prodno=1;
	int no;
	
	String name;
	String writer;
	String sort; 
	int price;

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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
	Book(){
		no = prodno++;
	}
	@Override
	public String toString() {
		return no+". "+ name + "\t|" + writer + "\t|" +sort + "\t|" + price;
	}
}
